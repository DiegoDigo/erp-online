package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.canal.Canal;

public class CanalTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigoErp;

	private String descricao;

	private Boolean ativo;

	private String autoServico;

	private String codigoGrupoCanal;

	private String descricaoComplementar;

	private String divisaoCanal;

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

	public CanalTO() {
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getAutoServico() {
		return autoServico;
	}

	public void setAutoServico(String autoServico) {
		this.autoServico = autoServico;
	}

	public String getCodigoGrupoCanal() {
		return codigoGrupoCanal;
	}

	public void setCodigoGrupoCanal(String codigoGrupoCanal) {
		this.codigoGrupoCanal = codigoGrupoCanal;
	}

	public String getDescricaoComplementar() {
		return descricaoComplementar;
	}

	public void setDescricaoComplementar(String descricaoComplementar) {
		this.descricaoComplementar = descricaoComplementar;
	}

	public String getDivisaoCanal() {
		return divisaoCanal;
	}

	public void setDivisaoCanal(String divisaoCanal) {
		this.divisaoCanal = divisaoCanal;
	}

	/**
	 * Construtor
	 * 
	 * @param canal
	 */
	public CanalTO(Canal canal) {
		this.setCodigoErp(canal.getCodigoErp());
		this.setDescricao(canal.getDescricao());
		this.setAtivo(canal.getAtivo());
		this.setAutoServico(canal.getAutoServico());
		this.setCodigoGrupoCanal(canal.getCodigoGrupoCanal());
		this.setDescricaoComplementar(canal.getDescricaoComplementar());
		this.setDivisaoCanal(canal.getDivisaoCanal());
	}
}