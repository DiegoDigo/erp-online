package br.com.control.mensageria.consumidor;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.cadastro.ClienteService;
import br.com.control.portal.mensageria.to.ClienteTO;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Component
public class PreCadastroClienteConsumer {

	private static Logger log = LoggerFactory.getLogger(PreCadastroClienteConsumer.class);

	private static final String FILA_PRE_CADASTRO_CLIENTE = "pre_cadastro_cliente";

	@Autowired
	private ClienteService clienteService;

	@JmsListener(destination = FILA_PRE_CADASTRO_CLIENTE)
	public void receiveMessage(final Message<ClienteTO> message) throws JMSException {

		ClienteTO clienteTO = message.getPayload();

		log.debug("### RECEBIDO O CLIENTE " + clienteTO.getCpfCnpj() + " DA FILA DE PRE CADASTRO ###");

		// Salvar pré-cadastro
		clienteService.salvar(new Cliente(clienteTO));

		// FIXME: Rever para o caso do gestão devolver um código ERP para o
		// Portal
		// producer.sendMessage(status);

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

		try {
			log.debug("### PRE-CLIENTE : {} ###" + mapper.writeValueAsString(clienteTO));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}