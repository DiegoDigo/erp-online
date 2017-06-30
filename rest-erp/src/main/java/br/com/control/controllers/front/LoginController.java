package br.com.control.controllers.front;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.autenticacao.modelo.Usuario;
import br.com.control.controllers.AbstractController;

@RestController
@RequestMapping(value = "/front/login/")
public class LoginController extends AbstractController {


	@RequestMapping(value = "efetua", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> loga(@RequestBody Usuario usuario) {
		System.out.println(usuario.getLogin());
		System.out.println(usuario.getPassword());
		return new ResponseEntity<String>("TESTE OK", HttpStatus.OK);
	}

}
