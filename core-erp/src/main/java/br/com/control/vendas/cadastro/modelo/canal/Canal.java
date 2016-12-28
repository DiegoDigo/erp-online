package br.com.control.vendas.cadastro.modelo.canal;

import java.io.Serializable;

/**
 * @author rasa.lariguet
 *
 */
@SuppressWarnings("serial")
public class Canal implements Serializable{
	private Long recId;
	private Boolean ativo;
	private String autoServico;
	private String codigoErp;
	private String codigoGrupoCanal;
	private String descricao;
	private String descricaoComplementar;
	private String divisaoCanal;
	
	
	public Long getRecId() {
		return recId;
	}
	public void setRecId(Long redId) {
		this.recId = redId;
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
	public String getCodigoErp() {
		return codigoErp;
	}
	public void setCodigoErp(String codigoErp) {
		this.codigoErp = codigoErp;
	}

	public String getDescricaoComplementar() {
		return descricaoComplementar;
	}
	public void setDescricaoComplementar(String descricaoComplementar) {
		this.descricaoComplementar = descricaoComplementar;
	}
	public String getCodigoGrupoCanal() {
		return codigoGrupoCanal;
	}
	public void setCodigoGrupoCanal(String codigoGrupoCcanal) {
		this.codigoGrupoCanal = codigoGrupoCcanal;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDivisaoCanal() {
		return divisaoCanal;
	}
	public void setDivisaoCanal(String divisaoCanal) {
		this.divisaoCanal = divisaoCanal;
	}
	
}
