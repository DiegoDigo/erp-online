package br.com.control.autenticacao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.control.autenticacao.modelo.Usuario;
import br.com.control.repositorio.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {

	private final UsuarioRepository userRepository;

	@Autowired
	public UsuarioService(UsuarioRepository userRepository) {
		this.userRepository = userRepository;
	}

	public Usuario criarUsuario(Usuario usuario){
		return this.userRepository.save(usuario);
	}

	public Usuario buscarPorLogin(String login){
		return this.userRepository.findByLogin(login);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = this.buscarPorLogin(username);
		if (user == null) {
			throw new UsernameNotFoundException(String.format("Usuário %s não existe!", username));
		}
		return new UserRepositoryUserDetails(user);
	}

	private final static class UserRepositoryUserDetails extends Usuario implements UserDetails {

		private static final long serialVersionUID = 1L;

		private UserRepositoryUserDetails(Usuario user) {
			super(user);
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return getPerfis();
		}

		@Override
		public String getUsername() {
			return getLogin();
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return true;
		}

	}

}
