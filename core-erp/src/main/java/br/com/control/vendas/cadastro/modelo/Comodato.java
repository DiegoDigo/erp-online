package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class Comodato implements Serializable {

	private String codigoClienteERP;
	private String codigoModelo;
	private String codigoOcorrencia;
	private String codigoSituacao;
	private Timestamp dataCev;
	private Timestamp dataUltimaAuditoria;
	private Timestamp dataVencimento;
	private String descricaoModelo;
	private Boolean fazInventario;
	private String nomeFabricante;
	private String numeroAtivo;
	private String numeroCev;
	private String numeroCevItem;
	private String patrimonioDois;
	private String codigoProdutoERP;
	private Integer quantidade;
	private Long tabelaPrecoRecId;
	private String tecnologiaUtilizada;
	private String tipoStatus;
	private float valorItem;

	
	public String getCodigoModelo() {
		return codigoModelo;
	}

	public void setCodigoModelo(String codigoModelo) {
		this.codigoModelo = codigoModelo;
	}

	public String getCodigoOcorrencia() {
		return codigoOcorrencia;
	}

	public void setCodigoOcorrencia(String codigoOcorrencia) {
		this.codigoOcorrencia = codigoOcorrencia;
	}

	public String getCodigoSituacao() {
		return codigoSituacao;
	}

	public void setCodigoSituacao(String codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public Timestamp getDataCev() {
		return dataCev;
	}

	public void setDataCev(Timestamp dataCev) {
		this.dataCev = dataCev;
	}

	public Timestamp getDataUltimaAuditoria() {
		return dataUltimaAuditoria;
	}

	public void setDataUltimaAuditoria(Timestamp dataUltimaAuditoria) {
		this.dataUltimaAuditoria = dataUltimaAuditoria;
	}

	public Timestamp getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Timestamp dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getDescricaoModelo() {
		return descricaoModelo;
	}

	public void setDescricaoModelo(String descricaoModelo) {
		this.descricaoModelo = descricaoModelo;
	}

	public Boolean getFazInventario() {
		return fazInventario;
	}

	public void setFazInventario(Boolean fazInventario) {
		this.fazInventario = fazInventario;
	}

	public String getNomeFabricante() {
		return nomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}

	public String getNumeroAtivo() {
		return numeroAtivo;
	}

	public void setNumeroAtivo(String numeroAtivo) {
		this.numeroAtivo = numeroAtivo;
	}

	public String getNumeroCev() {
		return numeroCev;
	}

	public void setNumeroCev(String numeroCev) {
		this.numeroCev = numeroCev;
	}

	public String getNumeroCevItem() {
		return numeroCevItem;
	}

	public void setNumeroCevItem(String numeroCevItem) {
		this.numeroCevItem = numeroCevItem;
	}

	public String getPatrimonioDois() {
		return patrimonioDois;
	}

	public void setPatrimonioDois(String patrimonioDois) {
		this.patrimonioDois = patrimonioDois;
	}

	

	public String getCodigoProdutoERP() {
		return codigoProdutoERP;
	}

	public void setCodigoProdutoERP(String codigoProdutoERP) {
		this.codigoProdutoERP = codigoProdutoERP;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Long getTabelaPrecoRecId() {
		return tabelaPrecoRecId;
	}

	public void setTabelaPrecoRecId(Long tabelaPrecoRecId) {
		this.tabelaPrecoRecId = tabelaPrecoRecId;
	}

	public String getTecnologiaUtilizada() {
		return tecnologiaUtilizada;
	}

	public void setTecnologiaUtilizada(String tecnologiaUtilizada) {
		this.tecnologiaUtilizada = tecnologiaUtilizada;
	}

	public String getTipoStatus() {
		return tipoStatus;
	}

	public void setTipoStatus(String tipoStatus) {
		this.tipoStatus = tipoStatus;
	}

	public float getValorItem() {
		return valorItem;
	}

	public void setValorItem(float valorItem) {
		this.valorItem = valorItem;
	}

	public String getCodigoClienteERP() {
		return codigoClienteERP;
	}

	public void setCodigoClienteERP(String codigoClienteERP) {
		this.codigoClienteERP = codigoClienteERP;
	}
	
	

}
