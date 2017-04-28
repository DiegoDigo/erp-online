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
public class AlteracaoDadosCadastraisContatoConsumer {

	private static Logger log = LoggerFactory.getLogger(AlteracaoDadosCadastraisContatoConsumer.class);

	
	@Autowired
	private ClienteService clienteService;
	
	@JmsListener(destination = "${portal_ambiente}_alteracao_dados_cadastrais_contato")
	public void receiveMessage(final Message<ClienteTO> message) throws JMSException {
		ClienteTO clienteTO = message.getPayload();

		log.info("### RECEBIDO ALTERAÇAO DO CONTATO DO CLIENTE " +clienteTO.getRazaoSocial() +" - "+ clienteTO.getCpfCnpj() + " DA FILA DE ALTERAÇÃO DE DADOS CADASTRAIS CONTATO ###");

		// Salvar pré-cadastro
		clienteService.alterarDados(new Cliente(clienteTO));
		log.info("--> dados do cliente: " + clienteTO.getRazaoSocial() +" alterados no erp");

		// FIXME: Rever para o caso do gestão devolver um código ERP para o
		// Portal
		// producer.sendMessage(status);

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

		try {
			log.info("--> dados cadastrais alterados: {}" + mapper.writeValueAsString(clienteTO));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
}