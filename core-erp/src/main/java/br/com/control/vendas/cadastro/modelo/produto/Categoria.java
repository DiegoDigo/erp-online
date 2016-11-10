package br.com.control.vendas.cadastro.modelo.produto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Categoria implements Serializable {

//	private Long id;
//	
	private String matriculaEmpresa;
	
	private boolean ativo;
	
	private String codigoCategoriaProduto;

	private String descricao;

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getMatriculaEmpresa() {
		return matriculaEmpresa;
	}

	public void setMatriculaEmpresa(String matriculaEmpresa) {
		this.matriculaEmpresa = matriculaEmpresa;
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
