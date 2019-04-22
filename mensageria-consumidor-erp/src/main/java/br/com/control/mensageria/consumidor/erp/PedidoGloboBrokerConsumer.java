package br.com.control.mensageria.consumidor.erp;

import br.com.control.globobroker.PedidoCapaGloboBrokerService;
import br.com.control.globobroker.PedidoItemGloboBrokerService;
import br.com.control.globobroker.model.envio.PedidoCapaGloboBroker;
import br.com.control.globobroker.model.envio.PedidoItemGloboBroker;
import br.com.control.globobroker.services.ClienteRestGloboBroker;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PedidoGloboBrokerConsumer extends ERPConsumer{

    private static final Logger logger = LoggerFactory.getLogger(PedidoGloboBrokerConsumer.class);

	@Autowired
    private PedidoCapaGloboBrokerService pedidoCapaGloboBrokerService;
    @Autowired
    private PedidoItemGloboBrokerService pedidoItemGloboBrokerService;
    @Autowired
    private ClienteRestGloboBroker clienteRestGloboBroker;

    @JmsListener(destination = "PEDIDO_BROKER", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();

		logger.info("### PEDIDO_BROKER: ");
        logger.info("### SINALIZADOR -> PEDIDO ERP TERCEIRO - GLOBO BROKER ###");
        List<PedidoCapaGloboBroker> pedidos = pedidoCapaGloboBrokerService.listar();
        List<PedidoItemGloboBroker> itens = pedidoItemGloboBrokerService.listar();

        pedidos.forEach(p -> {
            List<PedidoItemGloboBroker> itensDoPedido = itens.stream().filter(i -> i.isItemDoPedido(p))
                    .collect(Collectors.toList());

            BigDecimal somaValoresLiquidoItensPedido = itensDoPedido.stream()
                    .map(item -> new BigDecimal(item.getValorLiquido())).reduce(BigDecimal.ZERO, BigDecimal::add);

            p.setValorLiquido(Double.parseDouble(somaValoresLiquidoItensPedido.toString()));

            p.setItensPedido(itensDoPedido);

            logger.info(" --> VAI SINALIZAR XXX");
            logger.info(" ---> " + p.getEnderecoWebService().replace("/pedido", ""));

            // Sinaliza o ERp terceiro
            clienteRestGloboBroker.sinalizaErpTerceiro(p.getEnderecoWebService().replace("/pedido", ""),
                    p.getUsuarioErpTerceiro(), p.getSenhaErpTerceiro(), p);
        });

        logger.info("### FIM -> PEDIDO ERP TERCEIRO - GLOBO BROKER ###");
	}
}