package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.CondicaoPagamentoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.CondicaoPagamentoTO;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

@Component
public class CondicaoPagamentoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(CondicaoPagamentoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private CondicaoPagamentoService condicaoPagamentoService;

	@JmsListener(destination = "VW_CONDICAO_PAGAMENTO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_CONDICAO_PAGAMENTO: "+codigoErp);
		
		CondicaoPagamento condicaoPagamento = condicaoPagamentoService.recuperarCondicaoPagamento(codigoErp);
		if (condicaoPagamento == null) {
			log.warn("Condicao Pagamento com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		CondicaoPagamentoTO condicaoPagamentoTO = new CondicaoPagamentoTO(condicaoPagamento);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.CONDICAO_PAGAMENTO), condicaoPagamentoTO, "Condições de Pagemanto");
		log.info("--> Condicao Pagamento com codigo: " + codigoErp + " enviado para o Portal!");
	}
}