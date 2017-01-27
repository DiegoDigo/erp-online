package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.RestricaoFinanceiraItemService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.RestricaoFinanceiraItem;

@RestController
@RequestMapping(RotasRest.RAIZ_RESTRICAO + RotasRest.RAIZ_FINANCEIRO + RotasRest.RAIZ_ITEM)
public class RestricaoFinanceiraItemController extends AbstractController {

	@Autowired
	private RestricaoFinanceiraItemService restricaoFinanceiraItemService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<RestricaoFinanceiraItem> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Restricao financeira item listado com sucesso !", restricaoFinanceiraItemService.listar(), mensagem.getIdentificacao());
	}

}
