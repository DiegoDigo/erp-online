package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.ServiceFirebaseSfa;

@Component
public class PathRxConsumer extends ERPConsumer {

	private static Logger log = LoggerFactory.getLogger(PathRxConsumer.class);

	@Autowired
	private ServiceFirebaseSfa serviceFirebaseSfa;

	@JmsListener(destination = "PATH_SFA", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaPathSfa(final Message<String> message) throws JMSException {

		String caminhoPath = message.getPayload().replace("\\", "\\\\");
		try {
			log.info("PATH_SFA: " + caminhoPath);
			if (serviceFirebaseSfa.gravarArquivo(caminhoPath)) {
				log.info("--> PATH_SFA: " + caminhoPath + " criado no firebase !");
			}else {
				log.info("--> PATH_SFA: " + caminhoPath + " arquivo nao existe !");
			}			

		} catch (Exception e) {
			log.error(e.getMessage());
			log.error(e.getCause() != null ? e.getCause().toString() : "");
			log.error(e.getStackTrace() != null ? e.getStackTrace().toString() : "");
			throw new RuntimeException(e);
		}
	}
}