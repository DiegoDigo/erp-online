package br.com.control.vendas.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.ProdutoService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.produto.Produto;

@RestController
@RequestMapping(RotasRest.RAIZ_PRODUTO)
public class ProdutoController extends AbstractController{

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value = RotasRest.LISTAR, method=RequestMethod.GET, headers="Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<Produto> mensagem){
		return new MensagemRetorno(HttpStatus.OK, "Produtos Listado com sucesso !", produtoService.listarProdutos(), mensagem.getIdentificacao());
	}
	
}
