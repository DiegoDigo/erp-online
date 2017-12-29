package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.VendedorService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.VendedorTO;
import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;

@Component
public class VendedorConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(VendedorConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private VendedorService vendedorService;

	@JmsListener(destination = "VW_VENDEDOR", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_VENDEDOR: "+codigoErp);
		
		Vendedor vendedor = vendedorService.recuperarVendedor(codigoErp);

		if (vendedor == null) {
			log.warn("Vendedor com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		VendedorTO vendedorTO = new VendedorTO(vendedor);
		
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.VENDEDOR), vendedorTO, "Vendedor");
		log.info("--> Vendedor com codigo: " + codigoErp + " enviado para o Portal!");
	}

}