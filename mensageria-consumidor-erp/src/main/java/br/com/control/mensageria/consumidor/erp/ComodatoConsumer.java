package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.ComodatoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.ComodatoTO;
import br.com.control.vendas.cadastro.modelo.Comodato;

@Component
public class ComodatoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(ComodatoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private ComodatoService comodatoService;

	@JmsListener(destination = "VW_COMODATO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_COMODATO: "+codigoErp);

		Comodato comodatoBase = comodatoService.listarComodato(codigoErp);
		if (comodatoBase == null) {
			log.warn("Comodato com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		} 

		ComodatoTO comodatoTO = new ComodatoTO(comodatoBase);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.COMODATO), comodatoTO, "Comodato");
		log.info("--> Comodato com codigo: " + codigoErp + " enviado para o Portal!");
	}

}