package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.MovimentoFinanceiroService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.MovimentoFinanceiroTO;
import br.com.control.vendas.cadastro.modelo.MovimentoFinanceiro;

@Component
public class MovimentoFinanceiroConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(MovimentoFinanceiroConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private MovimentoFinanceiroService movimentoFinanceiroService;

	@JmsListener(destination = "VW_MOVIMENTO_FINANCEIRO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_MOVIMENTO_FINANCEIRO: "+codigoErp);

		MovimentoFinanceiro movimentoFinanceiroBase = movimentoFinanceiroService.buscarMovimentoFinanceiro(Integer.valueOf(codigoErp));

		if (movimentoFinanceiroBase == null) {
			log.warn("Movimento Financeiro com codigo: " + codigoErp+ " nao encontrado no DBMaker!");
			return;
		}

		MovimentoFinanceiroTO movimentoFinanceiroTO = new MovimentoFinanceiroTO(movimentoFinanceiroBase);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.MOVIMENTO_FINANCEIRO), movimentoFinanceiroTO, "Movimento Financeiro");
		
		log.info("--> Movimento Financeiro com codigo: " + codigoErp + " enviado para o Portal!");
	}

}