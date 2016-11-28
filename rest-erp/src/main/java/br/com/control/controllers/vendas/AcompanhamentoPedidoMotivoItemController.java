package br.com.control.controllers.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.acompanhamentopedido.AcompanhamentoPedidoMotivoItemService;
import br.com.control.controllers.AbstractController;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.AcompanhamentoPedidoMotivoItem;

@RestController
@RequestMapping(RotasRest.RAIZ_ACOMPANHAMENTO + RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_MOTIVO + RotasRest.RAIZ_ITEM)
public class AcompanhamentoPedidoMotivoItemController extends AbstractController {

	@Autowired
	private AcompanhamentoPedidoMotivoItemService acompanhamentoPedidoMotivoItemService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<AcompanhamentoPedidoMotivoItem> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Acompanhamento pedido motivo item listado com sucesso !", acompanhamentoPedidoMotivoItemService.listarMotivoItem(), mensagem.getIdentificacao());
	}

}
