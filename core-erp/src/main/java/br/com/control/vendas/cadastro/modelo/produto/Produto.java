package br.com.control.vendas.cadastro.modelo.produto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Produto implements Serializable {

	private Long recId;
	private Boolean ativo;
	private Boolean bonificaUnidade;
	private Integer classFiscal;
	private String codigoEanFab;
	private String codigoErp;
	private String descricao;
	private String descricaoRed;
	private Boolean ipiPauta;
	private String linha;
	private String litragem;
	private float percentualBonusGera;
	private float percentualBonusUsa;
	private Boolean permiteBonificacao;
	private float peso;
	private float pesoEmb;
	private Integer qtdMinVendaAv;
	private Integer qtdMinVendaCx;
	private Integer quantidadeCx;
	private String tipoBanda;
	private String tipoProduto;
	private Integer utilizaBandaPrecoTipo;
	private float valorMinimoBonus;
	private Integer vendaMultiMinAv;
	private Integer vendaMultiMinCx;
	private Boolean vendeAvulso;
	private Integer visibilidadePortal;
	private Long codigoErpCategoria;
	private Long codigoErpFamilia;
	private Long codigoErpGrupo;
	private Long codigoErpMarca;

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

	public Boolean getBonificaUnidade() {
		return bonificaUnidade;
	}

	public void setBonificaUnidade(Boolean bonificaUnidade) {
		this.bonificaUnidade = bonificaUnidade;
	}

	public Integer getClassFiscal() {
		return classFiscal;
	}

	public void setClassFiscal(Integer classFiscal) {
		this.classFiscal = classFiscal;
	}
	
	public Boolean getIpiPauta() {
		return ipiPauta;
	}

	public void setIpiPauta(Boolean ipiPauta) {
		this.ipiPauta = ipiPauta;
	}

	public String getCodigoEanFab() {
		return codigoEanFab;
	}

	public void setCodigoEanFab(String codigoEanFab) {
		this.codigoEanFab = codigoEanFab;
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

	public String getDescricaoRed() {
		return descricaoRed;
	}

	public void setDescricaoRed(String descricaoRed) {
		this.descricaoRed = descricaoRed;
	}


	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public String getLitragem() {
		return litragem;
	}

	public void setLitragem(String litragem) {
		this.litragem = litragem;
	}

	public float getPercentualBonusGera() {
		return percentualBonusGera;
	}

	public void setPercentualBonusGera(float percentualBonusGera) {
		this.percentualBonusGera = percentualBonusGera;
	}

	public float getPercentualBonusUsa() {
		return percentualBonusUsa;
	}

	public void setPercentualBonusUsa(float percentualBonusUsa) {
		this.percentualBonusUsa = percentualBonusUsa;
	}

	public Boolean getPermiteBonificacao() {
		return permiteBonificacao;
	}

	public void setPermiteBonificacao(Boolean permiteBonificacao) {
		this.permiteBonificacao = permiteBonificacao;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getPesoEmb() {
		return pesoEmb;
	}

	public void setPesoEmb(float pesoEmb) {
		this.pesoEmb = pesoEmb;
	}

	public Integer getQtdMinVendaAv() {
		return qtdMinVendaAv;
	}

	public void setQtdMinVendaAv(Integer qtdMinVendaAv) {
		this.qtdMinVendaAv = qtdMinVendaAv;
	}

	public Integer getQtdMinVendaCx() {
		return qtdMinVendaCx;
	}

	public void setQtdMinVendaCx(Integer qtdMinVendaCx) {
		this.qtdMinVendaCx = qtdMinVendaCx;
	}

	public Integer getQuantidadeCx() {
		return quantidadeCx;
	}

	public void setQuantidadeCx(Integer quantidadeCx) {
		this.quantidadeCx = quantidadeCx;
	}

	public String getTipoBanda() {
		return tipoBanda;
	}

	public void setTipoBanda(String tipoBanda) {
		this.tipoBanda = tipoBanda;
	}


	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public Integer getUtilizaBandaPrecoTipo() {
		return utilizaBandaPrecoTipo;
	}

	public void setUtilizaBandaPrecoTipo(Integer utilizaBandaPrecoTipo) {
		this.utilizaBandaPrecoTipo = utilizaBandaPrecoTipo;
	}

	public float getValorMinimoBonus() {
		return valorMinimoBonus;
	}

	public void setValorMinimoBonus(float valorMinimoBonus) {
		this.valorMinimoBonus = valorMinimoBonus;
	}

	public Integer getVendaMultiMinAv() {
		return vendaMultiMinAv;
	}

	public void setVendaMultiMinAv(Integer vendaMultiMinAv) {
		this.vendaMultiMinAv = vendaMultiMinAv;
	}

	public Integer getVendaMultiMinCx() {
		return vendaMultiMinCx;
	}

	public void setVendaMultiMinCx(Integer vendaMultiMinCx) {
		this.vendaMultiMinCx = vendaMultiMinCx;
	}

	public Boolean getVendeAvulso() {
		return vendeAvulso;
	}

	public void setVendeAvulso(Boolean vendeAvulso) {
		this.vendeAvulso = vendeAvulso;
	}

	public Integer getVisibilidadePortal() {
		return visibilidadePortal;
	}

	public void setVisibilidadePortal(Integer visibilidadePortal) {
		this.visibilidadePortal = visibilidadePortal;
	}

	public Long getCodigoErpCategoria() {
		return codigoErpCategoria;
	}

	public void setCodigoErpCategoria(Long codigoErpCategoria) {
		this.codigoErpCategoria = codigoErpCategoria;
	}

	public Long getCodigoErpFamilia() {
		return codigoErpFamilia;
	}

	public void setCodigoErpFamilia(Long codigoErpFamilia) {
		this.codigoErpFamilia = codigoErpFamilia;
	}

	public Long getCodigoErpGrupo() {
		return codigoErpGrupo;
	}

	public void setCodigoErpGrupo(Long codigoErpGrupo) {
		this.codigoErpGrupo = codigoErpGrupo;
	}

	public Long getCodigoErpMarca() {
		return codigoErpMarca;
	}

	public void setCodigoErpMarca(Long codigoErpMarca) {
		this.codigoErpMarca = codigoErpMarca;
	}

}
