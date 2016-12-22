package br.com.control.mensageria.consumidor;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.cadastro.PedidoCapaService;
import br.com.control.cadastro.PedidoItemService;
import br.com.control.mensageria.produtor.PedidoCapaProducer;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.PedidoItemTO;
import br.com.control.util.FormatacaoUtil;

@Component
public class PedidoCapaConsumer {

	private static Logger log = LoggerFactory.getLogger(PedidoCapaConsumer.class);
	
	private static final String FILA_PEDIDOS = "pedidos";

	@Autowired
	private PedidoCapaService pedidoCapaService;

	@Autowired
	private PedidoItemService pedidoItemService;

	@Autowired
	private PedidoCapaProducer producer;
	
	@Autowired
	private FormatacaoUtil util;

	@JmsListener(destination = FILA_PEDIDOS)
	public void receiveMessage(final Message<PedidoCapaTO> message) throws JMSException {
		PedidoCapaTO pedidoCapa = message.getPayload();

		log.debug("### RECEBIDO O PEDIDO " + pedidoCapa.getRecId() + " DA FILA PEDIDOS ###");

		preparaDatasPedido(pedidoCapa);
		
		AcompanhamentoPedidoTO capaTO = pedidoCapaService.salvarCapa(pedidoCapa);

		for (PedidoItemTO item : pedidoCapa.getItens()) {
			item.setNumeroPrePedidoGestao(capaTO.getNumeroPedidoGestao());
			pedidoItemService.salvarItem(item);
		}
		
		producer.sendMessage(capaTO);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);

		try {
			log.debug("### PEDIDO CAPA : {} ###" + mapper.writeValueAsString(pedidoCapa));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	private void preparaDatasPedido(PedidoCapaTO pedidoCapa) {
		String dataVencimento = util.formataData(pedidoCapa.getDataHoraEmissao(), "yyyyMMdd");
		String dataEmissao = util.formataData(pedidoCapa.getDataHoraEmissao(), "yyyyMMdd");
		String horaEmissao = util.formataData(pedidoCapa.getDataHoraEmissao(), "HHmm");
		pedidoCapa.setDataVencimento(Integer.valueOf(dataVencimento));
		pedidoCapa.setDataEmissao(Integer.valueOf(dataEmissao));
		pedidoCapa.setHoraEmissao(Integer.valueOf(horaEmissao));
	}

}