package br.com.control.mensageria.consumidor;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.LiberacaoPedidoService;
import br.com.control.portal.mensageria.to.LiberacaoPedidoTO;

@Component
public class LiberacaoPedidoConsumer {

	private static Logger log = LoggerFactory.getLogger(LiberacaoPedidoConsumer.class);

	private static final String FILA_LIBERACAO_PEDIDO = "liberacao_pedido";

	@Autowired
	private LiberacaoPedidoService liberacaoPedidoService;
	

	@JmsListener(destination = FILA_LIBERACAO_PEDIDO)
	public void receiveMessage(final Message<LiberacaoPedidoTO> message) throws JMSException {
		LiberacaoPedidoTO liberacao = message.getPayload();

		liberacaoPedidoService.liberarPedido(liberacao);
		
		if (liberacao.getStatusPedido().equals("0")) {
			log.info("### PEDIDO " + liberacao.getNumeroPrePedidoGestao() + " LIBERADO ###");
		}else{
			log.info("### PEDIDO " + liberacao.getNumeroPrePedidoGestao() + " RECUSADO ###");
		}
	}

}