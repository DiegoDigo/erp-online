package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.OcorrenciaService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.OcorrenciaTO;
import br.com.control.vendas.cadastro.modelo.ocorrencia.Ocorrencia;

@Component
public class OcorrenciaConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(OcorrenciaConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private OcorrenciaService ocorrenciaService;

	@JmsListener(destination = "VW_OCORRENCIA", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_OCORRENCIA: "+codigoErp);
		

		Ocorrencia ocorrencia = ocorrenciaService.recuperarOcorrencia(codigoErp);

		if (ocorrencia == null) {
			log.warn("Ocorrencia com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		OcorrenciaTO ocorrenciaTO = new OcorrenciaTO(ocorrencia);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.OCORRENCIA), ocorrenciaTO, "Ocorrencia");
		
		log.info("--> Ocorrencia com codigo: " + codigoErp + " enviada para o Portal!");
	}

}