package br.com.control.mensageria.consumidor.portal;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.cadastro.PedidoCapaService;
import br.com.control.cadastro.PedidoItemService;
import br.com.control.mensageria.produtor.PedidoCapaProducer;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.PedidoItemTO;
import br.com.control.portal.mensageria.to.StatusAcompanhamentoPedidoTO;

@Component
public class PedidoCapaConsumer {

	private static Logger log = LoggerFactory.getLogger(PedidoCapaConsumer.class);

	@Autowired
	private PedidoCapaService pedidoCapaService;

	@Autowired
	private PedidoItemService pedidoItemService;

	@Autowired
	private PedidoCapaProducer producer;

	@JmsListener(destination = "${portal_ambiente}_pedidos")
	public void receiveMessage(final Message<PedidoCapaTO> message) throws JMSException {
		PedidoCapaTO pedidoCapa = message.getPayload();

		log.info("### RECEBIDO DA FILA O PEDIDO " + pedidoCapa.getRecId() + " VINDO DO "+pedidoCapa.getOrigem()+"###");
		log.info("--> capa recebida: " + pedidoCapa);

		try {

			AcompanhamentoPedidoTO capaTO = pedidoCapaService.salvarCapa(pedidoCapa);

			if (capaTO != null) {
				for (PedidoItemTO item : pedidoCapa.getItens()) {
					item.setNumeroPrePedidoGestao(Long.valueOf(capaTO.getNumeroPedidoGestao()));
					pedidoItemService.salvarItem(item);
				}

				log.info("--> numero pre-pedido gerado no erp: " + capaTO.getNumeroPedidoGestao());

				StatusAcompanhamentoPedidoTO status = new StatusAcompanhamentoPedidoTO();
				status.setNumeroPrePedidoErp(capaTO.getNumeroPedidoGestao());
				status.setRecId(capaTO.getRecId());

				log.info("--> status pedido: " + status.recuperaStatus());
				producer.sendMessage(status);

				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

//				log.debug("### DADOS DO PEDIDO CAPA :" + mapper.writeValueAsString(pedidoCapa));
			}

		} catch (Exception e) {
			log.error(e.getMessage());
			log.error(e.getCause() != null ? e.getCause().toString() : "");
			log.error(e.getStackTrace() != null ? e.getStackTrace().toString() : "");
			throw new RuntimeException(e);
		}
	}

	// private void preparaDatasPedido(PedidoCapaTO pedidoCapa) {
	// String dataVencimento = util.formataData(pedidoCapa.getDataHoraEmissao(),
	// "yyyyMMdd");
	// String dataEmissao = util.formataData(pedidoCapa.getDataHoraEmissao(),
	// "yyyyMMdd");
	// String horaEmissao = util.formataData(pedidoCapa.getDataHoraEmissao()\,
	// "HHmm");
	// pedidoCapa.setDataVencimento(Integer.valueOf(dataVencimento));
	// pedidoCapa.setDataEmissao(Integer.valueOf(dataEmissao));
	// pedidoCapa.setHoraEmissao(Integer.valueOf(horaEmissao));
	// }

}