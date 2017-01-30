package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;

public class CondicaoPagamentoTO implements Serializable {

	private static final long serialVersionUID = 1L;

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

	/**
	 * Construtor
	 * 
	 * @param marca
	 */
	public CondicaoPagamentoTO(CondicaoPagamento condicao) {
		this.setCodigoErp(condicao.getCodigoErp());
		this.setDescricao(condicao.getDescricao());
		this.setAtivo(condicao.getAtivo());
		this.setInformaPrimeiraParcela(condicao.getInformaPrimeiraParcela());
		this.setNumeroDias(condicao.getNumeroDias());
		this.setPrazo(condicao.getNumeroDias());
	}

}