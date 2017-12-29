package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.GrupoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.GrupoTO;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;

@Component
public class GrupoProdutoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(GrupoProdutoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private GrupoService grupoService;

	@JmsListener(destination = "VW_GRUPO_PRODUTO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_GRUPO_PRODUTO: "+codigoErp);
		Grupo grupo = grupoService.recuperaGrupo(codigoErp);
		if (grupo == null) {
			log.warn("--> Grupo com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}
		GrupoTO grupoTO = new GrupoTO(grupo);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.GRUPO_PRODUTO), grupoTO, "Grupo");
		log.info("--> Grupo com codigo: " + codigoErp + " enviado para o Portal!");
	}

}