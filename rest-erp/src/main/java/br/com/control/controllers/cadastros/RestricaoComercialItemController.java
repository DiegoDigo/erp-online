package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.RestricaoComercialItemService;
import br.com.control.controllers.AbstractController;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;

@RestController
@RequestMapping(RotasRest.RAIZ_RESTRICAO + RotasRest.RAIZ_COMERCIAL + RotasRest.RAIZ_ITEM)
public class RestricaoComercialItemController extends AbstractController {
	@Autowired
	private RestricaoComercialItemService restricaService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<ClienteEndereco> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Retricao Comercial Item listado com sucesso !", restricaService.listar(), mensagem.getIdentificacao());
	}
}
