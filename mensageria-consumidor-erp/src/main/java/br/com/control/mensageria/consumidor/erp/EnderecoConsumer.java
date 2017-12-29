package br.com.control.mensageria.consumidor.erp;

import java.util.ArrayList;
import java.util.List;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.ClienteEnderecoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.ClienteEnderecoTO;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

@Component
public class EnderecoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(EnderecoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private ClienteEnderecoService clienteEnderecoService;

	@JmsListener(destination = "VW_ENDERECO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_ENDERECO: "+codigoErp);
		
		List<ClienteEndereco> clienteEnderecos = clienteEnderecoService.recuperarTipoEnderecoCodigoERP(codigoErp);
		if (clienteEnderecos == null || clienteEnderecos.isEmpty()) {
			log.warn("Cliente Endereco com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		List<ClienteEnderecoTO> clienteEnderecoTOs = new ArrayList<>();
		for (ClienteEndereco clienteEndereco : clienteEnderecos) {
			clienteEnderecoTOs.add(new ClienteEnderecoTO(clienteEndereco));
		}

		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.CLIENTE_ENDERECO), clienteEnderecoTOs, "Cliente Endereco");
		log.info("--> Endereço com codigo: " + codigoErp + " enviado para o Portal!");
	}

}