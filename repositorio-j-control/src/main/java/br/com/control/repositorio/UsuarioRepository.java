package br.com.control.repositorio;


import org.springframework.data.repository.CrudRepository;

import br.com.control.autenticacao.modelo.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Usuario findByLogin(String login);
}
