package br.com.control.portal.mensageria;

import java.io.Serializable;

public class CondicaoPagamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long recId;
	
	private String codigoCondicaoPagamento;
	
	private Boolean ativo;
	
	private String descricao;
	
	private Boolean informaPrimeiraParcela;
	
	private Integer numeroDias;
	
	private Integer prazo;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getCodigoCondicaoPagamento() {
		return codigoCondicaoPagamento;
	}

	public void setCodigoCondicaoPagamento(String codigoCondicaoPagamento) {
		this.codigoCondicaoPagamento = codigoCondicaoPagamento;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getInformaPrimeiraParcela() {
		return informaPrimeiraParcela;
	}

	public void setInformaPrimeiraParcela(Boolean informaPrimeiraParcela) {
		this.informaPrimeiraParcela = informaPrimeiraParcela;
	}

	public Integer getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(Integer numeroDias) {
		this.numeroDias = numeroDias;
	}

	public Integer getPrazo() {
		return prazo;
	}

	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}

}
