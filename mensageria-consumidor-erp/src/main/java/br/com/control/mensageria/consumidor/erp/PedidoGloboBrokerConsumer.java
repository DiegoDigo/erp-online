package br.com.control.mensageria.consumidor.erp;

import br.com.control.globobroker.PedidoCapaGloboBrokerService;
import br.com.control.globobroker.PedidoItemGloboBrokerService;
import br.com.control.globobroker.rest.client.SincronismoPedidoBroker;
import br.com.control.globobroker.services.ClienteRestGloboBroker;
import br.com.control.portal.enums.CadastrosEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class PedidoGloboBrokerConsumer extends ERPConsumer {

    private static final Logger logger = LoggerFactory.getLogger(PedidoGloboBrokerConsumer.class);

    @Autowired
    private PedidoCapaGloboBrokerService pedidoCapaGloboBrokerService;

    @Autowired
    private PedidoItemGloboBrokerService pedidoItemGloboBrokerService;

    @Autowired
    private ClienteRestGloboBroker clienteRestGloboBroker;

    @JmsListener(destination = "PEDIDO_BROKER", containerFactory = "jmsListenerContainerFactoryJControl")
    public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
        SincronismoPedidoBroker clienteRest = new SincronismoPedidoBroker();
        clienteRest.sinalizaPortalAtualizacao("", CadastrosEnum.PEDIDO_BROKER);

    }
}