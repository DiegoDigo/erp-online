package br.com.control.controllers.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.sincronismo.SincronismoAcompanhamentoPedidoService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.RAIZ_ACOMPANHAMENTO + RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_CAPA)
public class StatusAcompanhamentoPedidoController extends AbstractController {

	@Autowired
	private SincronismoAcompanhamentoPedidoService acompanhamentoCapaPedidoService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		
		return new MensagemRetorno(HttpStatus.OK, "Status pedido listado com sucesso",
				acompanhamentoCapaPedidoService.listaStatusPedidos(), mensagem.getIdentificacao());
	}

	@RequestMapping(value = RotasRest.BUSCAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno recuperar(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		
		String numeroPrePedido = "0";
		if (mensagem.getConteudo() != null) {
			numeroPrePedido = mensagem.getConteudo();
		}
		return new MensagemRetorno(HttpStatus.OK, "Status pedido listado com sucesso",
				acompanhamentoCapaPedidoService.recuperaStatusPedidos(numeroPrePedido), mensagem.getIdentificacao());
	}

}
