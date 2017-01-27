package br.com.control.mensageria.produtor;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import br.com.control.portal.mensageria.to.StatusAcompanhamentoPedidoTO;

@Component
public class PedidoCapaProducer {

	@Autowired
	@Qualifier("jmsTemplateAcompanhamentoPedidos")
	private JmsTemplate jmsTemplateAcompanhamento;

	public void sendMessage(final StatusAcompanhamentoPedidoTO status) {
		jmsTemplateAcompanhamento.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				ObjectMessage objectMessage = session.createObjectMessage(status);
				return objectMessage;
			}
		});
	}

}