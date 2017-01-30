package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.TipoCobrancaClienteService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_TIPO + RotasRest.RAIZ_COBRANCA + RotasRest.RAIZ_CLIENTE)
public class TipoCobrancaClienteController extends AbstractController {

	@Autowired
	private TipoCobrancaClienteService tipoCobrancaClienteService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<TipoCobrancaCliente> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Tipo cobrança cliente Listado com sucesso !", tipoCobrancaClienteService.listarTiposCobranca(), mensagem.getIdentificacao());
	}

}
