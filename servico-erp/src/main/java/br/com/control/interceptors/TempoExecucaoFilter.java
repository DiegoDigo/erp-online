package br.com.control.interceptors;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import br.com.control.auditoria.Auditoria;
import br.com.control.autenticacao.AuditoriaService;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.TipoOperacao;

@Component
public class TempoExecucaoFilter implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(TempoExecucaoFilter.class);
	
	@Autowired
	private AuditoriaService auditoriaService;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// ANTES DA EXECUCAO DO CONTEUDO
		String parameter = request.getParameter("mensagem");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		try {
			MensagemRecebida<?> mensagemRecebida = mapper.readValue(parameter, MensagemRecebida.class);

			Auditoria auditoria = new Auditoria();
			Calendar calendarioInicio = Calendar.getInstance();
			auditoria.setDataInicioExecucaoServico(calendarioInicio);
			auditoria.setIdentificacao(mensagemRecebida.getIdentificacao());

			String method = ((HttpServletRequest) request).getMethod();
			auditoria.getIdentificacao().setTipoOperacao(TipoOperacao.recuperaPorMethod(method));

			String servico = ((HttpServletRequest) request).getRequestURI();
			auditoria.getIdentificacao().setServicoAcessado(servico);
			auditoriaService.salvar(auditoria);

			
			logger.info("### ACESSANDO SERVICO ERP ###");
			logger.info("--> serviço: "+servico);
			logger.info("--> usuário: "+auditoria.getIdentificacao().getUsuarioOrigemServico());
			logger.info("--> sistem origem: "+auditoria.getIdentificacao().getOrigem());
			logger.info("--> sistem destino: "+auditoria.getIdentificacao().getDestino());
			
			// EXECUTA O CONTEUDO
			chain.doFilter(request, response);
			
			// APOS A EXECUCAO DO CONTEUDO
			Calendar calendarioFim = Calendar.getInstance();
			auditoria.setDataFimExecucaoServico(calendarioFim);
			auditoria.setDuracao(calculaDiferencaEntreDatas(calendarioInicio.getTime(), calendarioFim.getTime()));
			logger.info("--> duração de: "+auditoria.getDuracao());
			logger.info("--------------------------------------------------");
			auditoriaService.salvar(auditoria);
		} catch (InvalidFormatException e) {
			throw new RuntimeException("Erro ao converter a mensagem recebida, verifique o formato da mensagem!");
		}

	}

	private String calculaDiferencaEntreDatas(Date d1, Date d2) {
		long diff = d2.getTime() - d1.getTime();

		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);

		String retorno = "";

		if (diffDays != 0) {
			retorno += diffDays + " dias";
		}
		if (diffHours != 0) {
			retorno += diffHours + " horas";
		}
		if (diffMinutes != 0) {
			retorno += diffMinutes + " minutos";
		}
		if (diffSeconds != 0) {
			retorno += diffSeconds + " segundos";
		}

		if (retorno.equals("")) {
			retorno = "1 segundo";
		}

		return retorno;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
