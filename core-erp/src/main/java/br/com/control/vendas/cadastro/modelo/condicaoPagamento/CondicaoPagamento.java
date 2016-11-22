package br.com.control.vendas.cadastro.modelo.condicaoPagamento;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CondicaoPagamento implements Serializable{

	private Long recId;
	private Boolean ativo;
	private String codigoCondicaoPagamento;
	private String descricao;
	private Boolean informaPrimeiraParcela;
	private Integer numeroDias;
	private Integer prazo;
	private Long matricualRecId;
	public Long getRecId() {
		return recId;
	}
	public void setRecId(Long recId) {
		this.recId = recId;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public String getCodigoCondicaoPagamento() {
		return codigoCondicaoPagamento;
	}
	public void setCodigoCondicaoPagamento(String codigoCondicaoPagamento) {
		this.codigoCondicaoPagamento = codigoCondicaoPagamento;
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
	public Long getMatricualRecID() {
		return matricualRecId;
	}
	public void setMatricualRecId(Long matricualRecId) {
		this.matricualRecId = matricualRecId;
	}
	
	
}
