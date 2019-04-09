package br.com.control.globobroker.resources;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.controllers.AbstractController;
import br.com.control.globobroker.PedidoCapaGloboBrokerService;
import br.com.control.globobroker.PedidoItemGloboBrokerService;
import br.com.control.globobroker.model.envio.PedidoCapaGloboBroker;
import br.com.control.globobroker.model.envio.PedidoItemGloboBroker;
import br.com.control.globobroker.services.ClienteRestGloboBroker;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.GLOBO_BROKER + RotasRest.RAIZ_PEDIDO)
public class PedidoGloboBrokerController extends AbstractController {

	private static final Logger logger = LoggerFactory.getLogger(PedidoGloboBrokerController.class);

	@Autowired
	private PedidoCapaGloboBrokerService pedidoCapaGloboBrokerService;

	@Autowired
	private PedidoItemGloboBrokerService pedidoItemGloboBrokerService;

	@Autowired
	private ClienteRestGloboBroker clienteRestGloboBroker;

	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
	public void sinalizaPortalSincronismoCadastroGrupo(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> PEDIDO ERP TERCEIRO - GLOBO BROKER ###");
		List<PedidoCapaGloboBroker> pedidos = pedidoCapaGloboBrokerService.listar();
		List<PedidoItemGloboBroker> itens = pedidoItemGloboBrokerService.listar();

		// TODO: mover para outro metodo
		pedidos.forEach(p -> {
			List<PedidoItemGloboBroker> itensDoPedido = itens.stream().filter(i -> i.isItemDoPedido(p))
					.collect(Collectors.toList());

			BigDecimal somaValoresLiquidoItensPedido = itensDoPedido.stream()
					.map(item -> new BigDecimal(item.getValorLiquido())).reduce(BigDecimal.ZERO, BigDecimal::add);

			p.setValorLiquido(Double.parseDouble(somaValoresLiquidoItensPedido.toString()));

			p.setItensPedido(itensDoPedido);

			// Sinaliza o ERp terceiro
			clienteRestGloboBroker.sinalizaErpTerceiro(p.getEnderecoWebService().replace("/pedido", ""),
					p.getUsuarioErpTerceiro(), p.getSenhaErpTerceiro(), p);
		});

		logger.info("### FIM -> PEDIDO ERP TERCEIRO - GLOBO BROKER ###");
	}
}
