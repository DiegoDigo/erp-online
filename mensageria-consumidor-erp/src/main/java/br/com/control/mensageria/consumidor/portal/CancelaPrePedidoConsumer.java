package br.com.control.mensageria.consumidor.portal;

import br.com.control.cadastro.PedidoCapaService;
import br.com.control.cadastro.PrePagamentoService;
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
public class CancelaPrePedidoConsumer {

    private static Logger log = LoggerFactory.getLogger(CancelaPrePedidoConsumer.class);

    @Autowired
    private PrePagamentoService prePagamentoService;

    @Autowired
    private PedidoCapaService pedidoCapaService;


    @Autowired
    private PedidoCapaProducer producer;


    @JmsListener(destination = "${prefixo_ambiente_fila}__cancelamento_pre_pedido_${numero_matricula_empresa}")
    public void receiveMessage(final Message<PedidoCapaTO> message) throws JMSException {
        PedidoCapaTO pedidoCapa = message.getPayload();

        CancelaPrePedido cancelaPrePedido = new CancelaPrePedido();
        cancelaPrePedido.setCodigoEmpresa(pedidoCapa.getCodigoEmpresa());
        cancelaPrePedido.setNumeroPedido(pedidoCapa.getNumeroPrePedidoGestao());


        if (pedidoCapaService.CancelarPedido(cancelaPrePedido) != null){

            log.info("___________________________________________________________");
            log.info("### PRE PEDIDO CANCELADO " + pedidoCapa.getNumeroPrePedidoGestao() + " VINDO DO L ###");
            log.info("--> pre pedido: " + pedidoCapa);

        }else{

            log.info("___________________________________________________________");
            log.info("### PRE PEDIDO " + pedidoCapa.getNumeroPrePedidoGestao() + " NAO ENCONTRADO ###");
            log.info("--> pre pedido: " + pedidoCapa);

        }

    }
}