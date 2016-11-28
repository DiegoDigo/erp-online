package br.com.control.controllers.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.HistoricoPedidoItemService;
import br.com.control.controllers.AbstractController;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

@RestController
@RequestMapping(RotasRest.RAIZ_HISTORICO + RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_ITEM)
public class HistoricoPedidoItemController extends AbstractController {

	@Autowired
	private HistoricoPedidoItemService historicoPedidoItemService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<HistoricoPedidoItem> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "", historicoPedidoItemService.listarPedidoItem(), mensagem.getIdentificacao());
	}

}
