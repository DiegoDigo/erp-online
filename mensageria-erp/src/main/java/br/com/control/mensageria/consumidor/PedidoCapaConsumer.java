package br.com.control.mensageria.consumidor;

import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.PedidoCapaService;
import br.com.control.mensageria.produtor.PedidoCapaProducer;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;

@Component
public class PedidoCapaConsumer {

	private static final String FILA_PEDIDOS = "pedidos";

	@Autowired
	private PedidoCapaService pedidoCapaService;

	@Autowired
	private PedidoCapaProducer producer;

	@JmsListener(destination = FILA_PEDIDOS)
	public void receiveMessage(final Message<PedidoCapaTO> message) throws JMSException {
		PedidoCapaTO pedidoCapa = message.getPayload();

		System.out.println("RECEBIDO O PEDIDO " + pedidoCapa.getRecId() + " DA FILA PEDIDOS :");

		AcompanhamentoPedidoTO capaTO = pedidoCapaService.salvarCapa(pedidoCapa);

		producer.sendMessage(capaTO);

		System.out.println("Application : response received : {}" + pedidoCapa);
	}

}