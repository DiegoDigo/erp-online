package br.com.control.controllers.globobroker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.controllers.AbstractController;
import br.com.control.globobroker.MovimentoFinanceiroGloboBrokerService;
import br.com.control.globobroker.model.envio.MovimentoFinanceiroGloboBroker;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.RAIZ_GLOBO_BROKER +  RotasRest.RAIZ_MOVIMENTO + RotasRest.RAIZ_FINANCEIRO)
public class MovimentoFinanceiroGlobalBrokerController extends AbstractController {

	@Autowired
	private MovimentoFinanceiroGloboBrokerService movimentoFinanceiroService;

	@RequestMapping(value = "/gravar", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> gravarTituloBaixado(@RequestBody MovimentoFinanceiroGloboBroker movimento) {
		MovimentoFinanceiroGloboBroker result = movimentoFinanceiroService.gravarTitulo(movimento);
		return new ResponseEntity<String>(result.getMensagemRetorno(), HttpStatus.OK);
	}
}
