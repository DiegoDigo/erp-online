package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String codigo;
	
	private String nomeFantasia;
	
	private String razaoSocial;
	
	@OneToMany
	private List<Endereco> enderecos = new ArrayList<>();
	
	@OneToOne
	private ContatoResponsavel contatoResponsavel; 

	@OneToMany
	private List<Documento> documentos = new ArrayList<>();

	@OneToOne
	private Estabelecimento estabelecimento; 
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public ContatoResponsavel getContatoResponsavel() {
		return contatoResponsavel;
	}

	public void setContatoResponsavel(ContatoResponsavel contatoResponsavel) {
		this.contatoResponsavel = contatoResponsavel;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	
}
