package br.com.control.mensageria.consumidor;

import java.util.List;

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

import br.com.control.cadastro.ClienteEnderecoService;
import br.com.control.portal.mensageria.to.ClienteEnderecoTO;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

@Component
public class AlteracaoDadosCadastraisContatoConsumer {

	private static Logger log = LoggerFactory.getLogger(AlteracaoDadosCadastraisContatoConsumer.class);

	private static final String FILA_ALTERACAO_DADOS_CADASTRAIS_ENDERECO = "alteracao_dados_cadastrais_endereco";

	
	@Autowired
	private ClienteEnderecoService clienteEnderecoService;
	

	@JmsListener(destination = FILA_ALTERACAO_DADOS_CADASTRAIS_ENDERECO)
	public void receiveMessage(final Message<ClienteEnderecoTO> message) throws JMSException {
		@SuppressWarnings("unchecked")
		List<ClienteEnderecoTO> clienteEnderecoTOs = (List<ClienteEnderecoTO>) message.getPayload();
		for (ClienteEnderecoTO clienteEnderecoTO : clienteEnderecoTOs) {
			log.debug("### RECEBIDO ALTERAÇÃO DO ENDEREÇO DO CLIENTE " + clienteEnderecoTO.getCodigoClienteERP() + " DA ALTERAÇÃO DE DADOS CADASTRAIS ENDERECO ###");

			// Salvar pré-cadastro
			clienteEnderecoService.alterarDados(new ClienteEndereco(clienteEnderecoTO));

			// FIXME: Rever para o caso do gestão devolver um código ERP para o
			// Portal
			// producer.sendMessage(status);

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

			try {
				log.debug("### Altera_Dados_Cadastrais : {} ###" + mapper.writeValueAsString(clienteEnderecoTO));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}