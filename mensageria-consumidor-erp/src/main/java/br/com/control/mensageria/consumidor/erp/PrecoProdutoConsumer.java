package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.PrecoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.PrecoTO;
import br.com.control.vendas.cadastro.modelo.preco.Preco;

@Component
public class PrecoProdutoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(PrecoProdutoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private PrecoService precoService;

	@JmsListener(destination = "VW_PRECO_PRODUTO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_PRECO_PRODUTO: "+codigoErp);
		if (codigoErp.length() == 8) {
			log.warn("Não é possível atualizar capa de Preço!");
			return;
		}
		
		Preco preco = precoService.recuperarTabelaPreco(codigoErp);
		if (preco == null) {
			log.warn("Preco Produto com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		PrecoTO precoTO = new PrecoTO(preco);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.TABELA_PRECO), precoTO, "Preco");
		log.info("--> Preco com codigo: " + codigoErp + " enviado para o Portal!");
	}

}