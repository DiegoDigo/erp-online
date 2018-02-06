package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.NFEChaveService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.NfeChaveTO;

@Component
public class NfeGeracaoChaveConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(NfeGeracaoChaveConsumer.class);

	@Autowired
	private NFEChaveService nfeChaveService;

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@JmsListener(destination = "VW_CH_NFISCAL", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaGeracaoChaveNFEPortal(final Message<String> message) throws JMSException {
		
		String codigoErp = message.getPayload();
		log.info("### VW_CH_NFISCAL: "+codigoErp);
		
		String sequenciaNota = codigoErp.substring(0, 3);
		String numeroNota = codigoErp.substring(3, codigoErp.length());
		
		NfeChaveTO nfeChave = nfeChaveService.recuperarPorNumeroNota(numeroNota, sequenciaNota);
		if (nfeChave == null) {
			log.warn("Chave da NFE com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.CHAVE_NFE), nfeChave, "Chave NFE");
		log.info("--> Cliente com codigo: " + codigoErp + " enviado para o Portal!");
	}

}