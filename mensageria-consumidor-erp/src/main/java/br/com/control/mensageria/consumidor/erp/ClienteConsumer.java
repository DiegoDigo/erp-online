package br.com.control.mensageria.consumidor.erp;

import java.util.List;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.ClienteService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.ClienteEnderecoTO;
import br.com.control.portal.mensageria.to.ClienteTO;
import br.com.control.portal.mensageria.to.TipoCobrancaClienteTO;
import br.com.control.portal.mensageria.to.VendedorClienteTO;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Component
public class ClienteConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(ClienteConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private ClienteService clienteService;

	@Autowired
	private TipoCobrancaClienteConsumer tipoCobrancaClienteConsumer;

	@Autowired
	private EnderecoConsumer enderecoClienteConsumer;

	@Autowired
	private VendedorClienteConsumer vendedorClienteConsumer;

	@JmsListener(destination = "VW_CLIENTE", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaClientePortal(final Message<String> message) throws JMSException {
		
		String codigoErp = message.getPayload();
		log.info("### VW_CLIENTE: "+codigoErp);
		
		Cliente cliente = clienteService.recuperarCliente(Integer.valueOf(codigoErp));
		if (cliente == null) {
			log.warn("Cliente com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		TipoCobrancaClienteTO tipoCobrancaClienteTO = tipoCobrancaClienteConsumer.recuperaTipoCobrancaClienteTO(message);
		if(tipoCobrancaClienteTO == null) {
			log.warn("Tipo de Cobranca do cliente com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}
		
		List<ClienteEnderecoTO> enderecosClienteTO = enderecoClienteConsumer.recuperaEnderecosClienteTO(message);
		if(enderecosClienteTO == null) {
			log.warn("Endereco do cliente com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}
		
		List<VendedorClienteTO> vendedoresClienteTO = vendedorClienteConsumer.recuperaVendedoresClienteTO(message);
		if(vendedoresClienteTO == null) {
			log.warn("Vendedor do cliente com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}
		
		
		ClienteTO clienteTO = new ClienteTO(cliente);
		clienteTO.setTipoCobrancaClienteTO(tipoCobrancaClienteTO);
		clienteTO.setEnderecosClienteTO(enderecosClienteTO);
		clienteTO.setVendedoresClienteTO(vendedoresClienteTO);
		
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.CLIENTE), clienteTO, "Cliente");
		log.info("--> Cliente com codigo: " + codigoErp + " enviado para o Portal!");
	}

}