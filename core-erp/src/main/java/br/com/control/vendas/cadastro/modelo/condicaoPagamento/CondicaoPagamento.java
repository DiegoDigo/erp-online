package br.com.control.vendas.cadastro.modelo.condicaoPagamento;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CondicaoPagamento implements Serializable{

	private Boolean ativo;
	private String codigoErp;
	private String descricao;
	private Boolean informaPrimeiraParcela;
	private Integer numeroDias;
	private Integer prazo;
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	

	public String getCodigoErp() {
		return codigoErp;
	}
	public void setCodigoErp(String codigoErp) {
		this.codigoErp = codigoErp;
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
