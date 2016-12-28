package br.com.control.vendas.cadastro.modelo.tipoCobranca;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TipoCobranca implements Serializable {

	private Boolean ativo;
	private String codigoErp;
	private String descricao;
	private Integer prazo;
	private Integer red;
	private Integer redF;

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

	public Integer getPrazo() {
		return prazo;
	}

	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}

	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

	public Integer getRedF() {
		return redF;
	}

	public void setRedF(Integer redF) {
		this.redF = redF;
	}

	public String getCodigoErp() {
		return codigoErp;
	}

	public void setCodigoErp(String codigoErp) {
		this.codigoErp = codigoErp;
	}

}
