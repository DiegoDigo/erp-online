package br.com.control.mensageria.consumidor.portal;

import br.com.control.cadastro.ClienteEnderecoService;
import br.com.control.portal.mensageria.to.ClienteTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class AlteracaoDadosCadastraisEnderecoConsumer {

	private static Logger log = LoggerFactory.getLogger(AlteracaoDadosCadastraisEnderecoConsumer.class);

	@Autowired
	private ClienteEnderecoService clienteEnderecoService;
	
	@JmsListener(destination = "${prefixo_ambiente_fila}_alteracao_dados_cadastrais_endereco_${numero_matricula_empresa}")
	public void receiveMessage(final Message<ClienteTO> message) throws JMSException {

		ClienteTO clienteTO = message.getPayload();
		log.debug("### RECEBIDO ALTERACAO DO ENDERECO DO CLIENTE " + clienteTO.getCodigoErp() + " DA FILA DE ALTERACAO DE DADOS CADASTRAIS ENDERECO ###");

		clienteTO.setRg("");
        clienteTO.setCelular("0");

		// Salvar pré-cadastro
		clienteEnderecoService.alterarDados(clienteTO);
		log.info("--> dados do endereco alterados no erp");

		// FIXME: Rever para o caso do gestão devolver um código ERP para o
		//		// Portal
		//		// producer.sendMessage(status);

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

		try {
			log.debug("### dados do endereco alterado : {} ###" + mapper.writeValueAsString(clienteTO));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}