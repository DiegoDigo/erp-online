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

import br.com.control.cadastro.VisitaService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.VisitaTO;
import br.com.control.vendas.cadastro.modelo.cliente.Visita;

@Component
public class DiasVisitaConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(DiasVisitaConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private VisitaService visitaService;

	@JmsListener(destination = "VW_DIAS_VISITA_VENDEDOR", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_DIAS_VISITA_VENDEDOR: "+codigoErp);

		List<Visita> diasVisitas = visitaService.recuperaPorPasta(Integer.parseInt(codigoErp));

		if (diasVisitas.isEmpty()) {
			log.warn("Não foram encontrados dias de visita para a pasta com codigo: " + codigoErp+ " no DBMaker!");
			return;
		}
		List<VisitaTO> visitas = new ArrayList<>();
		for (Visita visita : diasVisitas) {
			VisitaTO visitaTO = new VisitaTO(visita);
			visitas.add(visitaTO);
		}

		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.VISITAS), visitas, "Dias de Visita");
		
		log.info("--> Dias de Visita da pasta: " + codigoErp + " enviados para o Portal!");
	}

}