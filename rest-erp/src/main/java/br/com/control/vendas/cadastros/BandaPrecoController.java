package br.com.control.vendas.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.BandaPrecoService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.preco.BandaPreco;

@RestController
@RequestMapping(RotasRest.RAIZ_BANDA + RotasRest.RAIZ_PRECO)
public class BandaPrecoController extends AbstractController {

	@Autowired
	private BandaPrecoService bandaPrecoService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<BandaPreco> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Banda Preço Listada com sucesso !", bandaPrecoService.listarBanda(),
				mensagem.getIdentificacao());
	}

}
