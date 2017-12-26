package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.sincronismo.SincronismoAcompanhamentoPedidoService;

@Component
public class StatusPedidoConsumer {

	private static Logger log = LoggerFactory.getLogger(StatusPedidoConsumer.class);

	@Autowired
	private SincronismoAcompanhamentoPedidoService sincronismoAcompanhamentoPedidoService;


	@JmsListener(destination = "VW_PEDIDO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigo_erp = message.getPayload();
		log.info("VW_STATUS_PEDIDO: "+codigo_erp);
		sincronismoAcompanhamentoPedidoService.enviaParaOPortal(codigo_erp.trim());
	}

}