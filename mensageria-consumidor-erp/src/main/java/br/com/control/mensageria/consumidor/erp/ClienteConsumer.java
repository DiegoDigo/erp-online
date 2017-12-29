package br.com.control.mensageria.consumidor.erp;

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
import br.com.control.portal.mensageria.to.ClienteTO;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Component
public class ClienteConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(ClienteConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private ClienteService clienteService;

	@JmsListener(destination = "VW_CLIENTE", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_CLIENTE: "+codigoErp);
		
		Cliente cliente = clienteService.recuperarCliente(Integer.valueOf(codigoErp));
		if (cliente == null) {
			log.warn("Cliente com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		ClienteTO clienteTO = new ClienteTO(cliente);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.CLIENTE), clienteTO, "Cliente");
		log.info("--> Cliente com codigo: " + codigoErp + " enviado para o Portal!");
	}

}