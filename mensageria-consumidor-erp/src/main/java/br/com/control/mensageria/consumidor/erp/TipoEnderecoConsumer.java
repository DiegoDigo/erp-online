package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.TipoEnderecoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.TipoEnderecoTO;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;

@Component
public class TipoEnderecoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(TipoEnderecoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private TipoEnderecoService tipoEnderecoService;

	@JmsListener(destination = "VW_TIPO_ENDERECO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_TIPO_ENDERECO: "+codigoErp);
		
		TipoEndereco tipoEndereco = tipoEnderecoService.recuperarTipoEndereco(codigoErp);
		if (tipoEndereco == null) {
			log.warn("Tipo Endereço com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		TipoEnderecoTO tipoEnderecoTO = new TipoEnderecoTO(tipoEndereco);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.TIPO_ENDERECO), tipoEnderecoTO, "Tipo de Endereço");
		log.info("--> Tipo Endereço com codigo: " + codigoErp + " enviado para o Portal!");
	}

}