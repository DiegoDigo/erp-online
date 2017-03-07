package br.com.control.controllers.cadastros;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.CONEXAO)
public class ValidacaoConexaoController {
	

	@RequestMapping(value = RotasRest.VALIDA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno validar() {
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", "Conexão efetuada com sucesso!", null);
	}
	
	
}
