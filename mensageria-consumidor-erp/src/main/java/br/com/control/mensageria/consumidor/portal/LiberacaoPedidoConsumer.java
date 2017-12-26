package br.com.control.mensageria.consumidor.portal;

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

	@Autowired
	private LiberacaoPedidoService liberacaoPedidoService;
	

	@JmsListener(destination = "${portal_ambiente}_liberacao_pedido")
	public void receiveMessage(final Message<LiberacaoPedidoTO> message) throws JMSException {
		LiberacaoPedidoTO liberacao = message.getPayload();

		log.info("### RECEBIDO O PEDIDO " + liberacao.getNumeroPedidoGestao() + " DA FILA DE LIBERACAO DE PEDIDOS ###");
		
		liberacaoPedidoService.liberarPedido(liberacao);
		
		if (liberacao.getStatusPedido().equals("0")) {
			log.info("--> pedido com numero: " + liberacao.getNumeroPedidoGestao() + " liberado no erp ###");
		}else{
			log.info("--> pedido com numero: " + liberacao.getNumeroPedidoGestao() + " recusado no erp ###");
		}
	}

}