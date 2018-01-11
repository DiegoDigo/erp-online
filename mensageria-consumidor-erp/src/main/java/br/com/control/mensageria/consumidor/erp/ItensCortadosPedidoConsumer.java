package br.com.control.mensageria.consumidor.erp;

import java.util.ArrayList;
import java.util.List;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import br.com.control.cadastro.PedidoItemCortadoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.PedidoItemCortadoTO;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoItemCortado;

@Component
public class ItensCortadosPedidoConsumer extends ERPConsumer {

	private static Logger log = LoggerFactory.getLogger(ItensCortadosPedidoConsumer.class);

	@Autowired
	private SincronismoCadastroService sincronismoCadastoService;
	
	@Autowired
	private PedidoItemCortadoService pedidoItemCortadoService;
		

	@JmsListener(destination = "VW_ITEM_CORTADO_PRE_PEDIDO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		
		
		String codigoErp = message.getPayload();
		String codigoEmpresaErp = codigoErp.substring(0, 3);
		String codigoPrePedidoErp = codigoErp.substring(3, 14);
		
		
		log.info("VW_ITEM_CORTADO_PRE_PEDIDO: "+codigoErp);
		
		List<PedidoItemCortado> itensCortados = pedidoItemCortadoService.recuperarItensCordados(Integer.valueOf(codigoEmpresaErp), codigoPrePedidoErp);

		if (itensCortados == null) {
			String msg = "Nao foram encontrados itens cortados para codigo: " + codigoErp + " no DBMaker!";
			log.warn(msg);
			return;
		}

		List<PedidoItemCortadoTO> itensCortadosTO = new ArrayList<>();
		for (PedidoItemCortado pedidoItemCortado : itensCortados) {
			PedidoItemCortadoTO itemCortadoTO = new PedidoItemCortadoTO(pedidoItemCortado);
			itensCortadosTO.add(itemCortadoTO);
		}

		sincronismoCadastoService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.CORTE_ITEM_PREPEDIDO), itensCortadosTO,
				"Itens Cortados");
		log.info("--> Itens Cortados com codigo: " + codigoErp + " enviados para o Portal!");	
	}
	

}