package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.DetalheComboProdutoService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_PRODUTO + RotasRest.RAIZ_DETALHE_COMBO)
public class DetalheComboProdutoController extends AbstractController {

	@Autowired
	private DetalheComboProdutoService detalheComboProdutoService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<DetalheComboProduto> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Detalhe Combo Produto Listado com sucesso !",
				detalheComboProdutoService.listarTodos(), mensagem.getIdentificacao());
	}
}
