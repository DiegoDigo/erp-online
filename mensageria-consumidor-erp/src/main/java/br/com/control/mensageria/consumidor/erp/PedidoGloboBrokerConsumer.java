package br.com.control.mensageria.consumidor.erp;

import br.com.control.globobroker.PedidoCapaGloboBrokerService;
import br.com.control.globobroker.PedidoItemGloboBrokerService;
import br.com.control.globobroker.model.envio.PedidoCapaGloboBroker;
import br.com.control.globobroker.model.envio.PedidoItemGloboBroker;
import br.com.control.globobroker.services.ClienteRestGloboBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
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

    @JmsListener(destination = "PEDIDO_BROKER")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {

        logger.info("### PEDIDO_BROKER");
        logger.info("### CHAMANDO PEDIDO ERP TERCEIRO - GLOBO BROKER ###");
        List<PedidoCapaGloboBroker> pedidos = pedidoCapaGloboBrokerService.listar();
        List<PedidoItemGloboBroker> itens = pedidoItemGloboBrokerService.listar();

        pedidos.forEach(p -> {
            List<PedidoItemGloboBroker> itensDoPedido = itens.stream().filter(i -> i.isItemDoPedido(p))
                    .collect(Collectors.toList());

            BigDecimal somaValoresLiquidoItensPedido = itensDoPedido.stream()
                    .map(item -> new BigDecimal(item.getValorLiquido())).reduce(BigDecimal.ZERO, BigDecimal::add);

            System.out.println("Valor original: " + somaValoresLiquidoItensPedido);

            BigDecimal bd = new BigDecimal(somaValoresLiquidoItensPedido.doubleValue()).setScale(2, RoundingMode.HALF_UP);
            double valorLiquidoFormatado = bd.doubleValue();
            System.out.println("Valor formatado: " + valorLiquidoFormatado);

            p.setValorLiquido(valorLiquidoFormatado);

            p.setItensPedido(itensDoPedido);

            logger.info(" --> VAI ENVIAR PEDIDO");
            logger.info(" ---> " + p.getEnderecoWebService().replace("/pedido", ""));

            // Sinaliza o ERp terceiro
            clienteRestGloboBroker.sinalizaErpTerceiro(p.getEnderecoWebService().replace("/pedido", ""),
                    p.getUsuarioErpTerceiro(), p.getSenhaErpTerceiro(), p);
        });

        logger.info("### FIM -> PEDIDO ERP TERCEIRO - GLOBO BROKER ###");
    }
}
