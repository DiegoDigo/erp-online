package br.com.control.mensageria.consumidor.portal;

import br.com.control.cadastro.PedidoItemService;
import br.com.control.dao.PedidoRecolhaComodatoCapaDao;
import br.com.control.dao.PedidoRecolhaComodatoItemDao;
import br.com.control.mensageria.produtor.PedidoCapaProducer;
import br.com.control.portal.mensageria.to.*;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class PedidoComodatoConsumer {

	private static Logger log = LoggerFactory.getLogger(PedidoComodatoConsumer.class);

	@Autowired
	private PedidoRecolhaComodatoCapaDao pedidoCapaService;

	@Autowired
	private PedidoRecolhaComodatoItemDao pedidoItemService;

	@Autowired
	private PedidoCapaProducer producer;


	@JmsListener(destination = "${prefixo_ambiente_fila}_pedido_comodato_${numero_matricula_empresa}")
	public void receiveMessage(final Message<PedidoComodatoTO> message) throws JMSException {
		PedidoComodatoTO pedidoCapa = message.getPayload();

		log.info("___________________________________________________________");
		log.info("### RECEBIDO DA FILA O PEDIDO COMODATO " + pedidoCapa.getRecId() + " VINDO DO "+pedidoCapa.getOrigem()+" ###");
		log.info("--> capa recebida: " + pedidoCapa);

		try {

			AcompanhamentoPedidoTO capaTO = pedidoCapaService.salvarCapaPedidoComodato(pedidoCapa);

			if (capaTO != null) {
				int cont = 1;
				for (PedidoComodatoItemTO item : pedidoCapa.getItens()) {
					item.setNumeroPrePedidoGestao(Long.valueOf(capaTO.getNumeroPedidoGestao()));
					item.setUltimoItem(pedidoCapa.getItens().size() == cont ? "S" : "N");
					pedidoItemService.salvarItemPedidoComodato(item, capaTO.getNumeroPedidoGestao());
					cont++;
				}

				StatusAcompanhamentoPedidoTO status = new StatusAcompanhamentoPedidoTO();
				status.setNumeroPrePedidoErp(capaTO.getNumeroPedidoGestao());
				status.setRecId(capaTO.getRecId());
				log.info("--> status pedido comodato: " + status.recuperaStatus());
				log.info("___________________________________________________________");


				producer.sendMessage(status);

				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

			}

		} catch (Exception e) {
			log.error(e.getMessage());
			log.error(e.getCause() != null ? e.getCause().toString() : "");
			log.error(e.getStackTrace() != null ? e.getStackTrace().toString() : "");
			throw new RuntimeException(e);
		}
	}

}