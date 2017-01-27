package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.RestricaoComercialService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.RestricaoComercial;

@RestController
@RequestMapping(RotasRest.RAIZ_RESTRICAO + RotasRest.RAIZ_COMERCIAL)
public class RestricaoComercialController extends AbstractController {

	@Autowired
	private RestricaoComercialService restricaoComercialService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<RestricaoComercial> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Restricoes comercial Listado com sucesso ! ", restricaoComercialService.listar(), mensagem.getIdentificacao());
	}

}
