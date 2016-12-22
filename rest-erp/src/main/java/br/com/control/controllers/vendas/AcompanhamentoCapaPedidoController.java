package br.com.control.controllers.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.acompanhamentopedido.AcompanhamentoCapaPedidoService;
import br.com.control.controllers.AbstractController;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.AcompanhamentoPedidoCapa;

@RestController
@RequestMapping(RotasRest.RAIZ_ACOMPANHAMENTO + RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_CAPA)
public class AcompanhamentoCapaPedidoController extends AbstractController {

	@Autowired
	private AcompanhamentoCapaPedidoService acompanhamentoCapaPedidoService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<AcompanhamentoPedidoCapa> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Capas do pedido listada com sucesso",
				acompanhamentoCapaPedidoService.listarAcomapanhamentos(), mensagem.getIdentificacao());
	}

}
