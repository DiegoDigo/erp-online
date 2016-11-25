package br.com.control.vendas.cadastros.tipocobrancas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.tipoCobranca.TipoCobrancaService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;
import br.com.control.vendas.cadastros.AbstractController;

@RestController
@RequestMapping(RotasRest.RAIZ_TIPO + RotasRest.RAIZ_COBRANCA)
public class TipoCobrancaController extends AbstractController {

	@Autowired
	private TipoCobrancaService tipoCobrancaService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<TipoCobranca> mensagem) {
		List<TipoCobranca> tiposCobrancas = tipoCobrancaService.listarTiposCobrancas();
		return new MensagemRetorno(HttpStatus.OK, "Listagem retornada com Sucesso", tiposCobrancas, mensagem.getIdentificacao());

	}

}
