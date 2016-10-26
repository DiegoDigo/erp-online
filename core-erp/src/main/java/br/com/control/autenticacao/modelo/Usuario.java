package br.com.control.autenticacao.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	private String nome;

	@NotEmpty
	@Column(unique = true, nullable = false)
	private String login;
	
	@Enumerated(EnumType.STRING)
	private Sistema sistema;
	
	@NotEmpty
	private String password;
	
	@JsonIgnore
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "perfil_usuario", joinColumns = { @JoinColumn(name = "id_usuario") }, inverseJoinColumns = { @JoinColumn(name = "id_perfil") })
	private Set<Perfil> perfis = new HashSet<Perfil>();

	public Usuario() {
	}

	public Usuario(Usuario user) {
		super();
		this.id = user.getId();
		this.nome = user.getNome();
		this.login = user.getLogin();
		this.password = user.getPassword();
		this.perfis = user.getPerfis();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(Set<Perfil> perfis) {
		this.perfis = perfis;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

}
