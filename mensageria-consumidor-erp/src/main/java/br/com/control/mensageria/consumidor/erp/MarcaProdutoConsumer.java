package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.MarcaService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.MarcaTO;
import br.com.control.vendas.cadastro.modelo.produto.Marca;

@Component
public class MarcaProdutoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(MarcaProdutoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private MarcaService marcaService;

	@JmsListener(destination = "VW_MARCA_PRODUTO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_MARCA_PRODUTO: "+codigoErp);
		Marca marca = marcaService.recuperaMarca(codigoErp);
		if (marca == null) {
			log.warn("--> Marca com codigo: " + codigoErp + " nao encontrada no DBMaker!");
			return;
		}
		MarcaTO marcaTO = new MarcaTO(marca);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.MARCA_PRODUTO), marcaTO, "Marca");
		log.info("--> Marca com codigo: " + codigoErp + " enviada para o Portal!");
	}

}