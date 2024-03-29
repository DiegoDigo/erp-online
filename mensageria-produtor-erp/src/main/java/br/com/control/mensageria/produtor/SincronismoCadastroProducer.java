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

import br.com.control.portal.integracao.MensagemRetorno;


@Component
public class SincronismoCadastroProducer {

	@Autowired
	@Qualifier("jmsTemplateSincronismoCadastro")
	private JmsTemplate jmsTemplateSincronismoCadastro;

	public void sendMessage(final MensagemRetorno msg) {
		jmsTemplateSincronismoCadastro.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				ObjectMessage objectMessage = session.createObjectMessage(msg);
				return objectMessage;
			}
		});
	}
}