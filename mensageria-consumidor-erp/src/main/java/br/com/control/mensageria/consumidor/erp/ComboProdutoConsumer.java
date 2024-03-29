package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.DetalheComboProdutoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.DetalheComboProdutoTO;
import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;

@Component
public class ComboProdutoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(ComboProdutoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private DetalheComboProdutoService detalheComboProdutoService;

	@JmsListener(destination = "VW_COMBO_PRODUTO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_COMBO_PRODUTO: "+codigoErp);
		

		DetalheComboProduto comboProduto = detalheComboProdutoService.recuperarComboProduto(codigoErp);
		if (comboProduto == null) {
			String msg = "Combo Produto com codigo: " + codigoErp + " nao encontrado no DBMaker!";
			log.warn(msg);
			return;
		}

		DetalheComboProdutoTO comboProdutoTO = new DetalheComboProdutoTO(comboProduto);

		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.PRODUTO_COMBO), comboProdutoTO, "Detalhe combo produto");
		log.info("--> Combo Produto com codigo: " + codigoErp + " enviado para o Portal!");
	}

}