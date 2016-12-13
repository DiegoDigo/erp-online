package br.com.control.controllers.vendas;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.controllers.AbstractController;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.portal.mensageria.to.AcompanhamentoPedidoTO;

@RestController
@RequestMapping("servicos")
public class TesteController extends AbstractController {
	@RequestMapping(value = "b", method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortal(@RequestParam("mensagem") MensagemRecebida<AcompanhamentoPedidoTO> mensagem) {
		
		System.out.println("CHEGOU NO SERVICO: "+mensagem.getConteudo());
		
		return new MensagemRetorno(HttpStatus.OK, "Capas do pedido listada com sucesso",
				null, mensagem.getIdentificacao());
	}


}
