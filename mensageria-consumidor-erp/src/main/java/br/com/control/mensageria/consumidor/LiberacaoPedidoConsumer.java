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
import br.com.control.mensageria.produtor.PedidoCapaProducer;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.portal.mensageria.to.StatusAcompanhamentoPedidoTO;
import br.com.control.util.FormatacaoUtil;

@Component
public class LiberacaoPedidoConsumer {

	private static Logger log = LoggerFactory.getLogger(LiberacaoPedidoConsumer.class);

	private static final String FILA_LIBERACAO_PEDIDO = "liberação_pedido";

	@Autowired
	private PedidoCapaService pedidoCapaService;

	@Autowired
	private PedidoCapaProducer producer;

	@Autowired
	private FormatacaoUtil util;

	@JmsListener(destination = FILA_LIBERACAO_PEDIDO)
	public void receiveMessage(final Message<PedidoCapaTO> message) throws JMSException {
		PedidoCapaTO pedidoCapa = message.getPayload();

		log.debug("### LIBERANDO O PEDIDO " + pedidoCapa.getRecId() + " DA LIBERAÇÃO DE PEDIDO ###");

		preparaDatasPedido(pedidoCapa);

		AcompanhamentoPedidoTO capaTO = pedidoCapaService.salvarCapa(pedidoCapa);		

		StatusAcompanhamentoPedidoTO status = new StatusAcompanhamentoPedidoTO();
		status.setNumeroPrePedidoErp(capaTO.getNumeroPedidoGestao());
		status.setRecId(capaTO.getRecId());

		producer.sendMessage(status);

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