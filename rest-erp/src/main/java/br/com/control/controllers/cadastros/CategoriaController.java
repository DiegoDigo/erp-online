package br.com.control.controllers.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.CategoriaService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.produto.Categoria;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_PRODUTO + RotasRest.RAIZ_CATEGORIA)
public class CategoriaController extends AbstractController {

	@Autowired
	private CategoriaService servicoCategoria;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam(value = "mensagem") MensagemRecebida<Categoria> mensagem) {
		List<Categoria> categoriasEncontradas = servicoCategoria.listarTodos();
		return new MensagemRetorno(HttpStatus.OK, "Listagem retornada com Sucesso", categoriasEncontradas,
				mensagem.getIdentificacao());
	}

}
