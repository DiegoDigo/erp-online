package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.cadastro.tipoCobranca.TipoCobrancaService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.TipoCobrancaTO;
import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

@Component
public class TipoCobrancaConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(TipoCobrancaConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private TipoCobrancaService tipoCobrancaService;

	@JmsListener(destination = "VW_TIPO_COBRANCA", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_TIPO_COBRANCA: "+codigoErp);
		
		TipoCobranca tipoCobranca = tipoCobrancaService.recuperarTipoCobranca(codigoErp);
		if (tipoCobranca == null) {
			log.warn("Tipo Cobranca com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}
		
		TipoCobrancaTO tipoCobrancaTO = new TipoCobrancaTO(tipoCobranca);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.TIPO_COBRANCA), tipoCobrancaTO, "Tipo Cobrança");
		log.info("--> Tipo Cobranca com codigo: " + codigoErp + " enviado para o Portal!");
	}

}