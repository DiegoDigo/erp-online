package br.com.control.vendas.cadastro.modelo.produto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Familia implements Serializable {

	private Long id;
	
	private String matriculaAssociada;
	
	private boolean ativo;
	
	private String codigoFamiliaProduto;

	private String descricao;
	
	private String codigoFameb;

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

	public String getCodigoFamiliaProduto() {
		return codigoFamiliaProduto;
	}

	public void setCodigoFamiliaProduto(String codigoFamiliaProduto) {
		this.codigoFamiliaProduto = codigoFamiliaProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigoFameb() {
		return codigoFameb;
	}

	public void setCodigoFameb(String codigoFameb) {
		this.codigoFameb = codigoFameb;
	}
	
}
