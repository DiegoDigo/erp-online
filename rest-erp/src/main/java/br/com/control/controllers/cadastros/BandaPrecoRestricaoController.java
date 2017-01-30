package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.BandaPrecoRestricaoService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_BANDA + RotasRest.RAIZ_PRECO + RotasRest.RAIZ_RESTRICAO)
public class BandaPrecoRestricaoController extends AbstractController {

	@Autowired
	private BandaPrecoRestricaoService bandaPrecoRestricaoService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<ClienteEndereco> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Endereços clientes listado com sucesso !", bandaPrecoRestricaoService.listar(), mensagem.getIdentificacao());
	}

}
