package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.ProdutoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.ProdutoTO;
import br.com.control.vendas.cadastro.modelo.produto.Produto;

@Component
public class ProdutoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(ProdutoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private ProdutoService produtoService;

	@JmsListener(destination = "VW_PRODUTO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_PRODUTO: "+codigoErp);
		Produto produto = produtoService.recuperaProduto(codigoErp);
		if (produto == null) {
			log.warn("--> Produto com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}
		ProdutoTO produtoTO = new ProdutoTO(produto);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.PRODUTO), produtoTO, "Produto");
		log.info("--> Produto com codigo: " + codigoErp + " enviado para o Portal!");
	}

}