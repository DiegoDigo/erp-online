package br.com.control.vendas.cadastro.modelo.ocorrencia;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SisTipoOCorrencia implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String descricao;
	private String tipoOcorrencia;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoOcorrencia() {
		return tipoOcorrencia;
	}

	public void setTipoOcorrencia(String tipoOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
	}

}
