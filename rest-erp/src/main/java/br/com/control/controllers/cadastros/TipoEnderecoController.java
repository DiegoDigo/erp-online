package br.com.control.controllers.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.TipoEnderecoService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_TIPO + RotasRest.RAIZ_ENDERECO)
public class TipoEnderecoController extends AbstractController {

	@Autowired
	private TipoEnderecoService tipoEnderecoService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<TipoEndereco> mensagem) {
		List<TipoEndereco> tiposEndereco = tipoEnderecoService.Listar();
		return new MensagemRetorno(HttpStatus.OK, "Tipo endereço listado com sucesso!", tiposEndereco,
				mensagem.getIdentificacao());
	}
}
