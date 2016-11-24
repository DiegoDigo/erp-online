package br.com.control.vendas.cadastros.pedido.acompanhamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.cadastro.acompanhamentopedido.SiglaAcompanhamentoPedidoService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.pedido.acompanhemanto.StatusAcompanhamentoPedido;
import br.com.control.vendas.cadastros.AbstractController;

@RestController
@RequestMapping(RotasRest.RAIZ_ACOMPANHAMENTO + RotasRest.RAIZ_PEDIDO)
public class StatusAcompanhamentoPedidoController extends AbstractController {

	@Autowired
	private SiglaAcompanhamentoPedidoService siglaAcompanhamentoPedidoService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(
			@RequestParam(value = "mensagem") MensagemRecebida<StatusAcompanhamentoPedido> mensagem) {
		ObjectMapper mapper = new ObjectMapper();
		StatusAcompanhamentoPedido siglaAcompanhamentoPedido = mapper.convertValue(mensagem.getConteudo(),
				StatusAcompanhamentoPedido.class);
		List<StatusAcompanhamentoPedido> siglasAcompanhamentoPedido = siglaAcompanhamentoPedidoService
				.listaSigla(siglaAcompanhamentoPedido.getSiglaStatus());
		return new MensagemRetorno(HttpStatus.OK, "Listagem retornada com Sucesso", siglasAcompanhamentoPedido,
				mensagem.getIdentificacao());
	}

}