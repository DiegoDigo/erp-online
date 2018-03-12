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
import br.com.control.cadastro.PedidoPendenteLiberacaoService;
import br.com.control.cadastro.sincronismo.SincronismoAcompanhamentoPedidoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.enums.StatusPedidoEnum;
import br.com.control.portal.mensageria.to.HistoricoPedidoCapaTO;
import br.com.control.portal.mensageria.to.HistoricoPedidoItemTO;
import br.com.control.portal.mensageria.to.PedidoPendenteLiberacaoTO;
import br.com.control.portal.mensageria.to.StatusAcompanhamentoPedidoTO;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoPendenteLiberacao;

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
	
	
	@Autowired
	private PedidoPendenteLiberacaoService pedidoPendenteLiberacaoService;
	

	@JmsListener(destination = "VW_ACOMPANHAMENTO_PEDIDO", containerFactory = "jmsListenerContainerFactoryJControl")
	public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
		String codigoErp = message.getPayload();
		log.info("VW_ACOMPANHAMENTO_PEDIDO: "+codigoErp);
		StatusAcompanhamentoPedidoTO statusAcompanhamentoTO = sincronismoAcompanhamentoPedidoService.enviaParaOPortal(codigoErp.trim());
		if(statusAcompanhamentoTO != null && !statusAcompanhamentoTO.getSituacaoPedidoErp().equals("9") && (recuperaStatusDoPedido(statusAcompanhamentoTO) == StatusPedidoEnum.ANALISE || recuperaStatusDoPedido(statusAcompanhamentoTO) == StatusPedidoEnum.APROVADO)){
			sinalizaHistoricoPedidoAprovado(codigoErp, origemPedidoEhPortal(statusAcompanhamentoTO));
		}
		
		if(statusAcompanhamentoTO != null && statusAcompanhamentoTO.pedidoEstaBloquado()) {
			sinalizaPedidoPendenteLiberacao(codigoErp);
		}
		
	
	}

	private boolean origemPedidoEhPortal(StatusAcompanhamentoPedidoTO statusAcompanhamentoTO) {
		return statusAcompanhamentoTO.getNumeroPrePedidoErp() != null && !statusAcompanhamentoTO.getNumeroPrePedidoErp().equals("0");
	}
	
	private void sinalizaPedidoPendenteLiberacao(String codigoErp) {
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

	private void sinalizaHistoricoPedidoAprovado(String codigoErp, boolean origemPortal) {
		log.info("### VW_HISTORICO_PEDIDO_CAPA: "+codigoErp);

		HistoricoPedidoCapa historioPedidoCapa = historicoPedidoCapaService.buscarHistoricoCapa(codigoErp);

		if (historioPedidoCapa == null) {
			log.warn("Historico Pedido Capa com codigo: " + codigoErp+ " nao encontrado no DBMaker!");
			return;
		}

		HistoricoPedidoCapaTO historicoPedidoCapaTO = new HistoricoPedidoCapaTO(historioPedidoCapa, origemPortal);

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