package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.CanalService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.CanalTO;
import br.com.control.vendas.cadastro.modelo.canal.Canal;

@Component
public class CanalVendaConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(CanalVendaConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private CanalService canalService;

	@JmsListener(destination = "VW_CANAL_VENDA", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_CANAL_VENDA: "+codigoErp);
		
		Canal canal = canalService.recuperaCanal(codigoErp);

		if (canal == null) {
			log.warn("Canal com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		CanalTO canalTO = new CanalTO(canal);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.CANAL), canalTO, "Canal");
		log.info("--> Canal com codigo: " + codigoErp + " enviado para o Portal!");
	}

}