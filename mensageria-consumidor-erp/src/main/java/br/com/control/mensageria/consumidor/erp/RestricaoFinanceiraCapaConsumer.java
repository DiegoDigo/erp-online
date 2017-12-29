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

import br.com.control.cadastro.RestricaoFinanceiraItemService;
import br.com.control.cadastro.RestricaoFinanceiraService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.RestricaoFinanceiraItemTO;
import br.com.control.portal.mensageria.to.RestricaoFinanceiraTO;
import br.com.control.vendas.cadastro.modelo.RestricaoFinanceira;
import br.com.control.vendas.cadastro.modelo.RestricaoFinanceiraItem;

@Component
public class RestricaoFinanceiraCapaConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(RestricaoFinanceiraCapaConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private RestricaoFinanceiraService restricaoFinanceiraService;

	@Autowired
	private RestricaoFinanceiraItemService restricaoFinanceiraItemService;

	@JmsListener(destination = "VW_RESTRICAO_FINANCEIRA_CAPA", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_RESTRICAO_FINANCEIRA_CAPA: "+codigoErp);

		RestricaoFinanceira restricaoFinanceira = restricaoFinanceiraService.buscarPorCodigoErp(codigoErp);
		if (restricaoFinanceira == null) {
			log.warn("Restricao Financeira com codigo: " + codigoErp+ " nao encontrado no DBMaker!");
			return;
		}

		RestricaoFinanceiraTO restricaoFinanceiraTo = new RestricaoFinanceiraTO(restricaoFinanceira);

		List<RestricaoFinanceiraItem> restricaoFinanceiraItens = restricaoFinanceiraItemService.buscarPorCodigoErp(codigoErp);
		if (restricaoFinanceira == null || restricaoFinanceiraItens.isEmpty()) {
			log.warn("Sem Itens para a Restrição Financeira: " + codigoErp+ " no DBMaker!");
		}else{
			List<RestricaoFinanceiraItemTO> restricaoFinanceiraItensTO = new ArrayList<>();
			for (RestricaoFinanceiraItem restricaoItem : restricaoFinanceiraItens) {
				RestricaoFinanceiraItemTO restricaoFinanceiraItemTO = new RestricaoFinanceiraItemTO(restricaoItem);
				restricaoFinanceiraItensTO.add(restricaoFinanceiraItemTO);
			}

			restricaoFinanceiraTo.setRestricaoItens(restricaoFinanceiraItensTO);
		}

		
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.RESTRICAO_FINANCEIRA), restricaoFinanceiraTo,
				"Restricao Financeira");
		
		
		log.info("--> Restricao Financeira com codigo: " + codigoErp + " enviada para o Portal!");
	}

}