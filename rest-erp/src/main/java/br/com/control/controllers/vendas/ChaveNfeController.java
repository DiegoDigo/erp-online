package br.com.control.controllers.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.NFEChaveService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.pedido.ChaveNfe;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.RAIZ_NFE)
public class ChaveNfeController extends AbstractController {

	@Autowired
	private NFEChaveService nfeChaveService;

	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<ChaveNfe> mensagem) {
		return new MensagemRetorno(HttpStatus.OK, "Chave NFE listadas com sucesso !",
				nfeChaveService.listarTodos(), mensagem.getIdentificacao());
	}

}
