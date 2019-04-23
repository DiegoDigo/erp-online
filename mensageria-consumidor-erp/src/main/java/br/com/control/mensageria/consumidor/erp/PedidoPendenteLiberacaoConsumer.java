package br.com.control.mensageria.consumidor.erp;

import javax.jms.JMSException;

import br.com.control.portal.enums.StatusLiberacaoPedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.PedidoPendenteLiberacaoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.PedidoPendenteLiberacaoTO;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoPendenteLiberacao;

@Component
public class PedidoPendenteLiberacaoConsumer extends ERPConsumer{

	private static Logger log = LoggerFactory.getLogger(PedidoPendenteLiberacaoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	
	@Autowired
	private PedidoPendenteLiberacaoService pedidoPendenteLiberacaoService;

	@JmsListener(destination = "VW_PEDIDO_PENDENTE_LIBERACAO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("### VW_PEDIDO_PENDENTE_LIBERACAO: "+codigoErp);
		
		
		PedidoPendenteLiberacao pedidoPendenteLiberacao = pedidoPendenteLiberacaoService
				.recuperarPedidoPendenteLiberacao(codigoErp);

		if (pedidoPendenteLiberacao == null) {
			log.warn("Pedido com codigo: " + codigoErp + " nao encontrado no DBMaker!");
			return;
		}

		PedidoPendenteLiberacaoTO pedidoPendenteLiberacaoTO = new PedidoPendenteLiberacaoTO(pedidoPendenteLiberacao);
		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.PEDIDO_PENDENTE_LIBERACAO), pedidoPendenteLiberacaoTO,
				"Pedido Pendente Liberação");
		
		log.info("--> Pedido Pendente Liberação com codigo: " + codigoErp + " enviado para o Portal!");
	}

}