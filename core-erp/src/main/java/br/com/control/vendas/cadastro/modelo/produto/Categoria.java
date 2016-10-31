package br.com.control.vendas.cadastro.modelo.produto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Categoria implements Serializable {

	private Long id;
	
	private String matriculaAssociada;
	
	private boolean ativo;
	
	private String codigoCategoriaProduto;

	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatriculaAssociada() {
		return matriculaAssociada;
	}

	public void setMatriculaAssociada(String matriculaAssociada) {
		this.matriculaAssociada = matriculaAssociada;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public String getCodigoCategoriaProduto() {
		return codigoCategoriaProduto;
	}

	public void setCodigoCategoriaProduto(String codigoCategoriaProduto) {
		this.codigoCategoriaProduto = codigoCategoriaProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	
}
