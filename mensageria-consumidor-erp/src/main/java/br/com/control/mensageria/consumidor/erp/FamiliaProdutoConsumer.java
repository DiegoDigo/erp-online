package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.FamiliaService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.FamiliaTO;
import br.com.control.vendas.cadastro.modelo.produto.Familia;

@Component
public class FamiliaProdutoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(FamiliaProdutoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private FamiliaService familiaService;

	@JmsListener(destination = "VW_FAMILIA_PRODUTO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_FAMILIA_PRODUTO: "+codigoErp);
		Familia familia = familiaService.recuperaFamilia(codigoErp);
		if (familia == null) {
			log.warn("--> Familia com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}
		FamiliaTO familiaTO = new FamiliaTO(familia);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.FAMILIA_PRODUTO), familiaTO, "Familia");
		log.info("--> Familia com codigo: " + codigoErp + " enviada para o Portal!");
	}

}