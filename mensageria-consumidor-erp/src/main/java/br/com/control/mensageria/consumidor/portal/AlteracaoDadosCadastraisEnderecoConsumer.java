package br.com.control.mensageria.consumidor.portal;

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
public class AlteracaoDadosCadastraisEnderecoConsumer {

	private static Logger log = LoggerFactory.getLogger(AlteracaoDadosCadastraisEnderecoConsumer.class);

	@Autowired
	private ClienteEnderecoService clienteEnderecoService;
	
	@JmsListener(destination = "${prefixo_ambiente_fila}_alteracao_dados_cadastrais_endereco")
	public void receiveMessage(final Message<ClienteEnderecoTO> message) throws JMSException {
		@SuppressWarnings("unchecked")
		List<ClienteEnderecoTO> clienteEnderecoTOs = (List<ClienteEnderecoTO>) message.getPayload();
		for (ClienteEnderecoTO clienteEnderecoTO : clienteEnderecoTOs) {
			log.debug("### RECEBIDO ALTERACAO DO ENDERECO DO CLIENTE " + clienteEnderecoTO.getCodigoClienteERP() + " DA FILA DE ALTERACAO DE DADOS CADASTRAIS ENDERECO ###");

			// Salvar pré-cadastro
			clienteEnderecoService.alterarDados(new ClienteEndereco(clienteEnderecoTO));
			log.info("--> dados do endereco alterados no erp");
			
			// FIXME: Rever para o caso do gestão devolver um código ERP para o
			// Portal
			// producer.sendMessage(status);

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

			try {
				log.debug("### dados do endereco alterado : {} ###" + mapper.writeValueAsString(clienteEnderecoTO));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
		
	}
	

	
}