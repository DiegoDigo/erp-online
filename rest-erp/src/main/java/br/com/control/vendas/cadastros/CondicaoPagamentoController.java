package br.com.control.vendas.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.CondicaoPagamentoService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

@RestController
@RequestMapping(RotasRest.RAIZ_CONDICAO_PAGAMENTO)
public class CondicaoPagamentoController extends AbstractController{
	
	@Autowired
	private CondicaoPagamentoService condicaoPagamentoService;
	
	@RequestMapping(value = RotasRest.LISTAR, method = RequestMethod.GET , headers="Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<CondicaoPagamento> mensagem){
		List<CondicaoPagamento> condicoes = condicaoPagamentoService.listarCondicoes();
		return new MensagemRetorno(HttpStatus.OK, "Listado com sucesso", condicoes, mensagem.getIdentificacao());
	}
	
	

}
