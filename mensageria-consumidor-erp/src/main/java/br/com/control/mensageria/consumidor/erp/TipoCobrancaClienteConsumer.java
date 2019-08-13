package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.TipoCobrancaClienteService;
import br.com.control.portal.mensageria.to.TipoCobrancaClienteTO;
import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;

@Component
public class TipoCobrancaClienteConsumer {

	private static Logger log = LoggerFactory.getLogger(TipoCobrancaClienteConsumer.class);

	@Autowired
	private TipoCobrancaClienteService tipoCobrancaClienteService;

	public TipoCobrancaClienteTO recuperaTipoCobrancaClienteTO(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_TIPO_COBRANCA_CLIENTE: "+codigoErp);

		TipoCobrancaCliente tipoCobrancaCliente = tipoCobrancaClienteService.recuperarTipoCobrancaCliente(codigoErp);
		if (tipoCobrancaCliente == null) {
			log.warn("Tipo Cobranca Cliente com codigo: " + codigoErp+ " nao encontrado no DBMaker!");
			return null;
		}

		return new TipoCobrancaClienteTO(tipoCobrancaCliente);
	}

}