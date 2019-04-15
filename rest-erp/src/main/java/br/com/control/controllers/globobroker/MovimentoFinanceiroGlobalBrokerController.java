package br.com.control.controllers.globobroker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.controllers.AbstractController;
import br.com.control.globobroker.MovimentoFinanceiroGloboBrokerService;
import br.com.control.globobroker.model.envio.MovimentoFinanceiroGloboBroker;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.GLOBO_BROKER + RotasRest.RAIZ_MOVIMENTO + RotasRest.RAIZ_FINANCEIRO)
public class MovimentoFinanceiroGlobalBrokerController extends AbstractController {

	@Autowired
	private MovimentoFinanceiroGloboBrokerService movimentoFinanceiroService;

	@RequestMapping(value = "gravarTituloBaixado", method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno gravarTituloBaixado(
			@RequestBody MensagemRecebida<MovimentoFinanceiroGloboBroker> movimentoFinanceiroGloboBroker) {
		String mensagemRetorno = movimentoFinanceiroService
				.gravaTituloBaixado(movimentoFinanceiroGloboBroker.getConteudo());
		return new MensagemRetorno(HttpStatus.CREATED, "POST Efetuado!", mensagemRetorno,
				movimentoFinanceiroGloboBroker.getIdentificacao());
	}

	@RequestMapping(value = "gravarTituloAberto", method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno gravarTituloAberto(
			@RequestBody MensagemRecebida<MovimentoFinanceiroGloboBroker> movimentoFinanceiroGloboBroker) {
		System.out.println("Entrou na controller");
		String mensagemRetorno = movimentoFinanceiroService
				.gravaTituloAberto(movimentoFinanceiroGloboBroker.getConteudo());
		return new MensagemRetorno(HttpStatus.CREATED, "POST Efetuado!", mensagemRetorno,
				movimentoFinanceiroGloboBroker.getIdentificacao());
	}

}
