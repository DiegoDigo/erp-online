package br.com.control.mensageria.consumidor.portal;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.PrePagamentoService;
import br.com.control.portal.mensageria.to.PrePagamentoTO;

@Component
public class PrePagamentoConsumer {

	private static Logger log = LoggerFactory.getLogger(PrePagamentoConsumer.class);

	@Autowired
	private PrePagamentoService prePagamentoService;

	@JmsListener(destination = "${prefixo_ambiente_fila}_pre_pagamentos_${numero_matricula_empresa}")
	public void receiveMessage(final Message<PrePagamentoTO> message) throws JMSException {
		PrePagamentoTO prePagamentoTO = message.getPayload();

		log.info("___________________________________________________________");
		log.info("### RECEBIDO DA FILA O PRE PAGAMENTO DO TITULO: " + prePagamentoTO.getNumeroTitulo() +"###");
		log.info("--> prePagamentoTO recebido: " + prePagamentoTO);
		try {
			prePagamentoService.salvarPrePagamento(prePagamentoTO);
		} catch (Exception e) {
			log.error(e.getMessage());
			log.error(e.getCause() != null ? e.getCause().toString() : "");
			log.error(e.getStackTrace() != null ? e.getStackTrace().toString() : "");
			throw new RuntimeException(e);
		}
	}
}