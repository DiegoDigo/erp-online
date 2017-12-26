package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.dao.ClienteDao;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;

@Component
public class CadastaroClienteConsumer {

	private static Logger log = LoggerFactory.getLogger(CadastaroClienteConsumer.class);

	@Autowired
	private ClienteDao clienteDao;


	@JmsListener(destination = "VW_CADASTRO_CLIENTE", containerFactory = "jmsListenerContainerFactoryJControl")
	public void receiveMessage(final Message<String> message) throws JMSException {
		String codigo_erp = message.getPayload();
		System.out.println(codigo_erp);
		Cliente cliente = clienteDao.recuperarCliente(Integer.valueOf(codigo_erp.trim()));
		log.info(cliente.toString());
	}

}