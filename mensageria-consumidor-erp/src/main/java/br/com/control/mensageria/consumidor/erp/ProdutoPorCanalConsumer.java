package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.ProdutoCanalService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.ProdutoCanalTO;
import br.com.control.vendas.cadastro.modelo.produto.ProdutoCanal;

@Component
public class ProdutoPorCanalConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(ProdutoPorCanalConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private ProdutoCanalService produtoCanalService;

	@JmsListener(destination = "VW_PRODUTOS_POR_CANAL", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_PRODUTOS_POR_CANAL: "+codigoErp);
		ProdutoCanal produtoCanal = produtoCanalService.recuperaProdutoCanal(codigoErp);
		if (produtoCanal == null) {
			log.warn("--> Produto Por Canal com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}
		ProdutoCanalTO produtoCanalTO = new ProdutoCanalTO(produtoCanal);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.PRODUTO_CANAL), produtoCanalTO, "Produto Por Canal");
		log.info("--> Produto Por Canal com codigo: " + codigoErp + " enviado para o Portal!");
	}

}