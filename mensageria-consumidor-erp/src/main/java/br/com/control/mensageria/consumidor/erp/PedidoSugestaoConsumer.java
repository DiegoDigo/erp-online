package br.com.control.mensageria.consumidor.erp;

import java.util.ArrayList;
import java.util.List;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.PedidoSugestaoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.PedidoSugestaoTO;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoSugestao;

@Component
public class PedidoSugestaoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(PedidoSugestaoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private PedidoSugestaoService pedidoSugestaoService;

	@JmsListener(destination = "VW_PEDIDO_SUGESTAO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_PEDIDO_SUGESTAO: "+codigoErp);
		
		List<PedidoSugestao> sugestoes = pedidoSugestaoService.listar();
		List<PedidoSugestaoTO> pedidosSugestaoTO = new ArrayList<>();
		for (PedidoSugestao pedidoSugestao : sugestoes) {
			pedidosSugestaoTO.add(new PedidoSugestaoTO(pedidoSugestao));
		}

		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.PEDIDO_SUGESTAO), pedidosSugestaoTO, "Pedidos Sugestao");
		log.info("--> Pedidos Sugestao com codigo: " + codigoErp + " enviados para o Portal!");
	}

}