package br.com.control.vendas.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.HistoricoPedidoCapaService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;

@RestController
@RequestMapping(RotasRest.RAIZ_HISTORICO + RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_CAPA)
public class HistoricoPedidoCapaController extends AbstractController {

	@Autowired
	private HistoricoPedidoCapaService historicoPedidoCapaService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<HistoricoPedidoCapa> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Historico pedidos capa listado com sucesso !",
				historicoPedidoCapaService.listarHistoricoCapa(), mensagem.getIdentificacao());
	}

}
