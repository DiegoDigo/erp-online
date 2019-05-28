package br.com.control;

import br.com.control.dao.PedidoCapaDao;
import br.com.control.portal.Service.PedidoCapaPortalService;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.retransmissao.Serivce.PedidoRetransmissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;

import br.com.control.configuracao.ConfiguracaoWeb;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.List;
import java.util.concurrent.Executor;

@SpringBootApplication
@Import({ ConfiguracaoWeb.class, ConexaoBanco.class })
@EnableAspectJAutoProxy
@EnableJms
@EnableScheduling
public class StartErpOnline extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(StartErpOnline.class, args);
	}

	@Autowired
	PedidoRetransmissaoService pedidoRetransmissaoService;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StartErpOnline.class);
	}

	@Bean
	public HttpMessageConverters customConverters() {
		ByteArrayHttpMessageConverter arrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
		return new HttpMessageConverters(arrayHttpMessageConverter);
	}

	@Bean
	@Order(Ordered.HIGHEST_PRECEDENCE)
	CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return filter;
	}

	@Bean("threadPoolTaskExecutor")
	public Executor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(20);
		executor.setMaxPoolSize(1000);
		executor.setWaitForTasksToCompleteOnShutdown(true);
		executor.setThreadNamePrefix("erpRetransmissao-");
		return executor;
	}

	@Autowired
	PedidoCapaDao pedidoCapaDao;

	@Async("threadPoolTaskExecutor")
	@Scheduled(cron = "1 * * * * *")
	protected void verificarPedidosReTransmissao() {
		System.out.println("Buscando pedidos não transmitidos");
		List<PedidoCapaTO> pedidosNaoTransmitidos = pedidoRetransmissaoService.verificar();


		pedidosNaoTransmitidos.forEach(pedidoCapa -> {
			try {
				pedidoCapaDao.salvarCapaPedido(pedidoCapa);
				pedidoRetransmissaoService.transmitido(pedidoCapa.getRecId());
			} catch (Exception e) {
				System.out.println("Não foi possivel retransmitir o pedido. Causa: " + e.getMessage());
			}
		});
	}
}