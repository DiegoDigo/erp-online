package br.com.control.controllers.cadastros;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.CONEXAO)
public class ValidacaoConexaoService {
	

	@RequestMapping(value = RotasRest.VALIDA, method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<String> listar() {
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
	
	
}
	