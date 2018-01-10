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

import br.com.control.cadastro.HistoricoPedidoCapaService;
import br.com.control.cadastro.HistoricoPedidoItemService;
import br.com.control.cadastro.sincronismo.SincronismoAcompanhamentoPedidoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.enums.StatusPedidoEnum;
import br.com.control.portal.mensageria.to.HistoricoPedidoCapaTO;
import br.com.control.portal.mensageria.to.HistoricoPedidoItemTO;
import br.com.control.portal.mensageria.to.StatusAcompanhamentoPedidoTO;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

@Component
public class AcompanhamentoPedidoConsumer extends ERPConsumer {

	private static Logger log = LoggerFactory.getLogger(AcompanhamentoPedidoConsumer.class);

	@Autowired
	private SincronismoAcompanhamentoPedidoService sincronismoAcompanhamentoPedidoService;
	
	@Autowired
	private HistoricoPedidoCapaService historicoPedidoCapaService;

	@Autowired
	private HistoricoPedidoItemService historicoPedidoItemService;
	
	@Autowired
	private SincronismoCadastroService sincronismoCadastroService;
	

	@JmsListener(destination = "VW_ACOMPANHAMENTO_PEDIDO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("VW_ACOMPANHAMENTO_PEDIDO: "+codigoErp);
		StatusAcompanhamentoPedidoTO statusAcompanhamentoTO = sincronismoAcompanhamentoPedidoService.enviaParaOPortal(codigoErp.trim());
		if(statusAcompanhamentoTO != null && recuperaStatusDoPedido(statusAcompanhamentoTO) == StatusPedidoEnum.ANALISE){
			sinalizaHistoricoPedidoAprovado(codigoErp);
		}
	
	}
	
	public StatusPedidoEnum recuperaStatusDoPedido(StatusAcompanhamentoPedidoTO status) {
		if (status.getSituacaoPedidoErp() != null && status.getSituacaoPedidoErp().equals("8")) {
			return StatusPedidoEnum.ENTREGUE;
		} else if (status.getNumeroRomaneio() != null && !status.getNumeroRomaneio().equals("0")) {
			return StatusPedidoEnum.SEPARACAO;
		} else if (status.getSituacaoPedidoErp() != null && status.getSituacaoPedidoErp().equals("0")) {
			return StatusPedidoEnum.APROVADO;
		} else {
			return StatusPedidoEnum.ANALISE;
		}
	}

	private void sinalizaHistoricoPedidoAprovado(String codigoErp) {
		log.info("### VW_HISTORICO_PEDIDO_CAPA: "+codigoErp);

		HistoricoPedidoCapa historioPedidoCapa = historicoPedidoCapaService.buscarHistoricoCapa(codigoErp);

		if (historioPedidoCapa == null) {
			log.warn("Historico Pedido Capa com codigo: " + codigoErp+ " nao encontrado no DBMaker!");
			return;
		}

		HistoricoPedidoCapaTO historicoPedidoCapaTO = new HistoricoPedidoCapaTO(historioPedidoCapa);

		List<HistoricoPedidoItem> historicoPedidoItens = historicoPedidoItemService
				.buscarItemPedido(codigoErp);

		if (codigoErp == null || codigoErp.isEmpty()) {
			log.warn("Historico Pedido Item com codigo: " + codigoErp+ " nao encontrado no DBMaker!");
		}else{
			List<HistoricoPedidoItemTO> historicoPedidoItensTO = new ArrayList<>();

			for (HistoricoPedidoItem historicoPedidoItem : historicoPedidoItens) {
				HistoricoPedidoItemTO historicoPedidoItemTO = new HistoricoPedidoItemTO(historicoPedidoItem);
				historicoPedidoItensTO.add(historicoPedidoItemTO);
			}

			historicoPedidoCapaTO.setHistoricoPedidoItens(historicoPedidoItensTO);
		}

		

		sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.HISTORICO_PEDIDO_CAPA), historicoPedidoCapaTO,
				"Historico Pedido Capa");
		
		
		log.info("--> Historico Pedido Capa com codigo: " + codigoErp + " enviado para o Portal!");
	}

}