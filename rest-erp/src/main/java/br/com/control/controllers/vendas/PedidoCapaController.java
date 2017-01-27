package br.com.control.controllers.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.PedidoCapaService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.portal.mensageria.to.PedidoCapaTO;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_CAPA)
public class PedidoCapaController extends AbstractController {

	@Autowired
	private PedidoCapaService pedidoCapaService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<PedidoCapaTO> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Pedido capa listado com sucesso", pedidoCapaService.listarPedido(),
				mensagem.getIdentificacao());
	}
}
