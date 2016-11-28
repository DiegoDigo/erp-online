package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.autenticacao.modelo.Usuario;
import br.com.control.repositorio.UsuarioRepository;

@RestController
public class UsuarioController {

	private final UsuarioRepository userRepository;

	@Autowired
	public UsuarioController(UsuarioRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping("/users")
	public Iterable<Usuario> getUsers() {
		return userRepository.findAll();
	}

}
