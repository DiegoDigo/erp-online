package br.com.control.controllers.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.PedidoCapaService;
import br.com.control.controllers.AbstractController;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_CAPA)
public class PedidoCapaController extends AbstractController {

	@Autowired
	private PedidoCapaService pedidoCapaService;

//	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
//	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<PedidoCapaTO> mensagem) {
//		return new MensagemRetorno(HttpStatus.OK, "Pedido capa listado com sucesso", pedidoCapaService.listarPedido(),
//				mensagem.getIdentificacao());
//	}
}
