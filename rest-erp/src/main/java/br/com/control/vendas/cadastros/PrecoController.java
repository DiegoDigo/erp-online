package br.com.control.vendas.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.PrecoService;
import br.com.control.integracao.MensagemRecebida;
import br.com.control.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.preco.Preco;

@RestController(RotasRest.RAIZ_PRECO)
public class PrecoController {

	@Autowired
	private PrecoService precoService;
	
	@RequestMapping(value = RotasRest.LISTAR , method = RequestMethod.GET , headers ="Accept=application/json")
	public MensagemRetorno listar(@RequestParam("mensagem") MensagemRecebida<Preco> mensagem){
		return new MensagemRetorno(HttpStatus.OK, "Precos Listados com sucesso ! ", precoService.ListaPreco(), mensagem.getIdentificacao());
	}
	
}
