package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.cadastro.acompanhamentopedido.StatusAcompanhamentoPedidoService;
import br.com.control.controllers.AbstractController;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;

@RestController
@RequestMapping(RotasRest.RAIZ_ACOMPANHAMENTO + RotasRest.RAIZ_PEDIDO)
public class StatusAcompanhamentoPedidoController extends AbstractController {

	@Autowired
	private StatusAcompanhamentoPedidoService siglaAcompanhamentoPedidoService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(
			@RequestParam(value = "mensagem") MensagemRecebida<StatusAcompanhamentoPedido> mensagem) {
		ObjectMapper mapper = new ObjectMapper();
		String numeroPrePedido = mapper.convertValue(mensagem.getConteudo(),
				String.class);
		StatusAcompanhamentoPedido statusAcompanhamentoPedidoErp = siglaAcompanhamentoPedidoService
				.recuperaStatusDoPedido(numeroPrePedido);
		return new MensagemRetorno(HttpStatus.OK, "Listagem retornada com Sucesso", statusAcompanhamentoPedidoErp,
				mensagem.getIdentificacao());
	}

}