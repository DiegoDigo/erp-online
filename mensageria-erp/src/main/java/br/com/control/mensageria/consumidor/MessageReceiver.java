package br.com.control.mensageria.consumidor;

import javax.jms.JMSException;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

import br.com.control.portal.mensageria.PedidoCapa;

@Component
public class MessageReceiver {
 
    private static final String FILA_PEDIDOS = "pedidos";
     
    @JmsListener(destination = FILA_PEDIDOS)
    
    public void receiveMessage(final Message<PedidoCapa> message) throws JMSException {
        MessageHeaders headers =  message.getHeaders();
        System.out.println("Application : headers received : {}" + headers);
         
        PedidoCapa response = message.getPayload();
        System.out.println("Application : response received : {}" +response);
    }
    
    
//    public void receiveMessage(final Message<Pessoa> message) throws JMSException {
//        MessageHeaders headers =  message.getHeaders();
//        System.out.println("Application : headers received : {}" + headers);
//         
//        Pessoa response = message.getPayload();
//        System.out.println("Application : response received : {}" +response);
//    }
}