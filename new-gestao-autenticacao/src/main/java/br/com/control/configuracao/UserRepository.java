package br.com.control.configuracao;

import org.springframework.data.repository.CrudRepository;

import br.com.control.modelo.Usuario;

public interface UserRepository extends CrudRepository<Usuario, Long> {

	Usuario findByLogin(String login);
}
