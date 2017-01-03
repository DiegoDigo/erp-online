package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MotivoGeral implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String codigoMotivoGeralERP;
	private String descricao;
	private String descricaoReduzida;
	private Boolean influiVenda;
	private Boolean permiteVenda;
	private String codigoTipoMotivoGeralERP;

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

	

	public String getCodigoMotivoGeralERP() {
		return codigoMotivoGeralERP;
	}

	public void setCodigoMotivoGeralERP(String codigoMotivoGeralERP) {
		this.codigoMotivoGeralERP = codigoMotivoGeralERP;
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

	public String getCodigoTipoMotivoGeralERP() {
		return codigoTipoMotivoGeralERP;
	}

	public void setCodigoTipoMotivoGeralERP(String codigoTipoMotivoGeralERP) {
		this.codigoTipoMotivoGeralERP = codigoTipoMotivoGeralERP;
	}

	

	

}
