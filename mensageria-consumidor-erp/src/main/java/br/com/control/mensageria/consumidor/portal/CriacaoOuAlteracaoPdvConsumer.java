package br.com.control.mensageria.consumidor.portal;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.ClienteService;
import br.com.control.portal.mensageria.to.ClienteTO;

@Component
public class CriacaoOuAlteracaoPdvConsumer {

	private static Logger log = LoggerFactory.getLogger(CriacaoOuAlteracaoPdvConsumer.class);

	@Autowired
	private ClienteService clienteService;

	@JmsListener(destination = "${prefixo_ambiente_fila}_alteracao_dados_cadastrais_contato_${numero_matricula_empresa}")
	public void receiveMessage(final Message<ClienteTO> message) throws JMSException {
		ClienteTO clienteTO = message.getPayload();
		// clienteTO.setLatitude(BigDecimal.ZERO);
		// clienteTO.setLongitude(BigDecimal.ZERO);
		// clienteTO.setEmail("teste@teste.com");
		// clienteTO.setRg("432223332");
		// clienteTO.setPontoReferenciaFaturamento("fat");
		// clienteTO.setPontoReferenciaEntrega("ent");
		// clienteTO.setPontoReferenciaCobranca("cob");
		// clienteTO.setMotivoBloqueio("Mot");
		// clienteTO.setInscricaoEstadual("IE");

		System.out.println(clienteTO);
		log.info("### RECEBIDO ALTERACAO DO CONTATO DO CLIENTE " + clienteTO.getRazaoSocial() + " - "
				+ clienteTO.getCpfCnpj() + " DA FILA DE ALTERACAO DE DADOS CADASTRAIS CONTATO ###");
		log.info("--> clienteTO: " + clienteTO);
		clienteService.salvarOuAlterar(clienteTO);
		log.info("--> dados do cliente: " + clienteTO.getRazaoSocial() + " inseridos/alterados no erp");
	}

}