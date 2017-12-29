package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.TipoCobrancaClienteService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.TipoCobrancaClienteTO;
import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;

@Component
public class TipoCobrancaClienteConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(TipoCobrancaClienteConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private TipoCobrancaClienteService tipoCobrancaClienteService;

	@JmsListener(destination = "VW_TIPO_COBRANCA_CLIENTE", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_TIPO_COBRANCA_CLIENTE: "+codigoErp);

		TipoCobrancaCliente tipoCobrancaCliente = tipoCobrancaClienteService.recuperarTipoCobrancaCliente(codigoErp);
		if (tipoCobrancaCliente == null) {
			log.warn("Tipo Cobranca Cliente com codigo: " + codigoErp+ " nao encontrado no DBMaker!");
			return;
		}

		TipoCobrancaClienteTO tipoCobrancaClienteTO = new TipoCobrancaClienteTO(tipoCobrancaCliente);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.TIPO_COBRANCA_CLIENTE), tipoCobrancaClienteTO, "Tipo de Cobrança Cliente");
		log.info("--> Tipo Cobranca Cliente com codigo: " + codigoErp + " enviado para o Portal!");
	}

}