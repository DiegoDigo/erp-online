package br.com.control.vendas.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.PedidoCapaService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoCapa;

@RestController
@RequestMapping(RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_CAPA)
public class PedidoCapaController extends AbstractController {

	@Autowired
	private PedidoCapaService pedidoCapaService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<PedidoCapa> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Pedido capa listado com sucesso", pedidoCapaService.listarPedido(),
				mensagem.getIdentificacao());
	}

}