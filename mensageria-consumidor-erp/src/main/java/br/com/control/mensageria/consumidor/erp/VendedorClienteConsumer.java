package br.com.control.mensageria.consumidor.erp;

import java.util.ArrayList;
import java.util.List;

import javax.jms.JMSException;

import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.VendedorClienteService;
import br.com.control.portal.mensageria.to.VendedorClienteTO;
import br.com.control.vendas.cadastro.modelo.vendedor.VendedorCliente;

@Component
public class VendedorClienteConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(VendedorClienteConsumer.class);

	@Autowired
	private VendedorClienteService vendedorClienteService;

	@Autowired
	SincronismoCadastroService sincronismoCadastroService;

	public List<VendedorClienteTO> recuperaVendedoresClienteTO(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_VENDEDOR_CLIENTE: "+codigoErp);
		
		List<VendedorCliente> vendedorClientes = vendedorClienteService.recuperarClientesVendedor(codigoErp);
		if (vendedorClientes == null || vendedorClientes.isEmpty()) {
			log.warn("Vendedor Cliente com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return null;
		}

		List<VendedorClienteTO> vendedoresClienteTO = new ArrayList<VendedorClienteTO>();
		for (VendedorCliente vendedorCliente : vendedorClientes) {
			vendedoresClienteTO.add(new VendedorClienteTO(vendedorCliente));
		}

//		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.VENDEDOR_CLIENTE), vendedoresClienteTO, "Vendedor do Cliente");
//		log.info("--> Vendedor Cliente com codigo: " + codigoErp + " enviado para o Portal!");

		return vendedoresClienteTO;
		

	}

}