package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.sql.Timestamp;

import br.com.control.vendas.cadastro.modelo.Comodato;

@SuppressWarnings("serial")
public class ComodatoTO implements Serializable {

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

	
	public ComodatoTO() {
		
	}
	public ComodatoTO(Comodato comodatoBase) {
		super();
		this.codigoClienteERP = comodatoBase.getCodigoClienteERP();
		this.codigoModelo = comodatoBase.getCodigoModelo();
		this.codigoOcorrencia = comodatoBase.getCodigoOcorrencia();
		this.codigoSituacao = comodatoBase.getCodigoSituacao();
		this.dataCev = comodatoBase.getDataCev();
		this.dataUltimaAuditoria = comodatoBase.getDataUltimaAuditoria();
		this.dataVencimento = comodatoBase.getDataVencimento();
		this.descricaoModelo = comodatoBase.getDescricaoModelo();
		this.fazInventario = comodatoBase.getFazInventario();
		this.nomeFabricante = comodatoBase.getNomeFabricante();
		this.numeroAtivo = comodatoBase.getNumeroAtivo();
		this.numeroCev = comodatoBase.getNumeroCev();
		this.numeroCevItem = comodatoBase.getNumeroCevItem();
		this.patrimonioDois = comodatoBase.getPatrimonioDois();
		this.codigoProdutoERP = comodatoBase.getCodigoProdutoERP();
		this.quantidade = comodatoBase.getQuantidade();
		this.tabelaPrecoRecId = comodatoBase.getTabelaPrecoRecId();
		this.tecnologiaUtilizada = comodatoBase.getTecnologiaUtilizada();
		this.tipoStatus = comodatoBase.getTipoStatus();
		this.valorItem = comodatoBase.getValorItem();
	}

	

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
