package br.com.control.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.configuracao.UserRepository;
import br.com.control.modelo.Usuario;

@RestController
public class UsuarioController {

	private final UserRepository userRepository;

	@Autowired
	public UsuarioController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping("/users")
	public Iterable<Usuario> getUsers() {
		return userRepository.findAll();
	}

}
