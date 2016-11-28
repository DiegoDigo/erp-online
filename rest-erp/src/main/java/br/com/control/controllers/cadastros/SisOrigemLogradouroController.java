package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.SisOrigemLogradouroService;
import br.com.control.controllers.AbstractController;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.cliente.SisOrigemLogradouro;

@RestController
@RequestMapping(RotasRest.RAIZ_ORIGEM_LOGRADOURO)
public class SisOrigemLogradouroController extends AbstractController {

	@Autowired
	private SisOrigemLogradouroService sisOrigemLogradouroService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<SisOrigemLogradouro> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Origem Logradouro listado com sucesso !", sisOrigemLogradouroService.listarOrigemLogradouro(), mensagem.getIdentificacao());
	}

}
