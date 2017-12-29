package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.ParocoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.ParocoTO;
import br.com.control.vendas.cadastro.modelo.produto.Paroco;

@Component
public class ParocoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(ParocoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private ParocoService parocoService;

	@JmsListener(destination = "VW_PAROCO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_PAROCO: "+codigoErp);

		
		Paroco paroco = parocoService.recuperaParoco(codigoErp);

		if (paroco == null) {
			log.warn("Paroco com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		ParocoTO parocoTo = new ParocoTO(paroco);

		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.PAROCO), parocoTo, "Paroco");
		log.info("--> Paroco com codigo: " + codigoErp + " enviado para o Portal!");
	}

}