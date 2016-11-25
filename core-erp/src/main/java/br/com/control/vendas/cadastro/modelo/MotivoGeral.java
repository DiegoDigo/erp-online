package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MotivoGeral implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String codigoMotivoGeral;
	private String descricao;
	private String descricaoReduzida;
	private Boolean influiVenda;
	private Boolean permiteVenda;
	private Long tipoMotivoGeral;

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

	public String getCodigoMotivoGeral() {
		return codigoMotivoGeral;
	}

	public void setCodigoMotivoGeral(String codigoMotivoGeral) {
		this.codigoMotivoGeral = codigoMotivoGeral;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricaoReduzida() {
		return descricaoReduzida;
	}

	public void setDescricaoReduzida(String descricaoReduzida) {
		this.descricaoReduzida = descricaoReduzida;
	}

	public Boolean getInfluiVenda() {
		return influiVenda;
	}

	public void setInfluiVenda(Boolean influiVenda) {
		this.influiVenda = influiVenda;
	}

	public Boolean getPermiteVenda() {
		return permiteVenda;
	}

	public void setPermiteVenda(Boolean permiteVenda) {
		this.permiteVenda = permiteVenda;
	}

	public Long getTipoMotivoGeral() {
		return tipoMotivoGeral;
	}

	public void setTipoMotivoGeral(Long tipoMotivoGeral) {
		this.tipoMotivoGeral = tipoMotivoGeral;
	}

}
