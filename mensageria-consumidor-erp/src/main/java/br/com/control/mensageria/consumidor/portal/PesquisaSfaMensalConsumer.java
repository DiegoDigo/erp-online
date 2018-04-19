package br.com.control.mensageria.consumidor.portal;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.SfaPesquisaMensalService;
import br.com.control.portal.mensageria.to.SfaPesquisaMensalTO;

@Component
public class PesquisaSfaMensalConsumer {

	private static Logger log = LoggerFactory.getLogger(PesquisaSfaMensalConsumer.class);

	@Autowired
	private SfaPesquisaMensalService sfaPesquisaMensalService;

	@JmsListener(destination = "${prefixo_ambiente_fila}_pesquisa_mensal_sfa")
	public void receiveMessage(final Message<SfaPesquisaMensalTO> message) throws JMSException {
		SfaPesquisaMensalTO sfaPesquisaMensalTO = message.getPayload();
		log.info("___________________________________________________________");
		log.info("### RECEBIDO DA FILA O A PESQUISA  : " + sfaPesquisaMensalTO.getCodigoPesquisa() +"###");
		log.info("--> pesquisa mensal recebida: " + sfaPesquisaMensalTO);
		try {
			sfaPesquisaMensalService.salvarPesquisaSfaMensal(sfaPesquisaMensalTO);
		} catch (Exception e) {
			log.error(e.getMessage());
			log.error(e.getCause() != null ? e.getCause().toString() : "");
			log.error(e.getStackTrace() != null ? e.getStackTrace().toString() : "");
			throw new RuntimeException(e);
		}
	}
}