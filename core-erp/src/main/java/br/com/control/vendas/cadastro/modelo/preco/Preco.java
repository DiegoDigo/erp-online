package br.com.control.vendas.cadastro.modelo.preco;

import java.io.Serializable;
import java.math.BigDecimal;


@SuppressWarnings("serial")
public class Preco implements Serializable{

	private Long recId;
	private float aliqPvv;
	private Boolean ativo;
	private String codigoTabpreco;
	private String daIcmO;
	private float desconto;
	private BigDecimal descontoMaximo;
	private float descontoVerba;
	private float despac;
	private String origemTabela;
	private Boolean participaBandaPreco;
	private float precoCustoCaixa;
	private float precoCustoUnitario;
	private float precoPvv;
	private Integer promocao;
	private Integer restricao;
	private float selo;
	private String tpCont;
	private String ufTabelaPreco;
	private float valIcms;
	private float valIpi;
	private BigDecimal valor;
	private Long produto;
	
	
	
	public Long getRecId() {
		return recId;
	}
	public void setRecId(Long recId) {
		this.recId = recId;
	}
	public float getAliqPvv() {
		return aliqPvv;
	}
	public void setAliqPvv(float aliqPvv) {
		this.aliqPvv = aliqPvv;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getCodigoTabpreco() {
		return codigoTabpreco;
	}
	public void setCodigoTabpreco(String codigoTabpreco) {
		this.codigoTabpreco = codigoTabpreco;
	}
	public String getDaIcmO() {
		return daIcmO;
	}
	public void setDaIcmO(String daIcmO) {
		this.daIcmO = daIcmO;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public BigDecimal getDescontoMaximo() {
		return descontoMaximo;
	}
	public void setDescontoMaximo(BigDecimal descontoMaximo) {
		this.descontoMaximo = descontoMaximo;
	}
	public float getDescontoVerba() {
		return descontoVerba;
	}
	public void setDescontoVerba(float descontoVerba) {
		this.descontoVerba = descontoVerba;
	}
	public float getDespac() {
		return despac;
	}
	public void setDespac(float despac) {
		this.despac = despac;
	}
	public String getOrigemTabela() {
		return origemTabela;
	}
	public void setOrigemTabela(String origemTabela) {
		this.origemTabela = origemTabela;
	}
	public Boolean getParticipaBandaPreco() {
		return participaBandaPreco;
	}
	public void setParticipaBandaPreco(Boolean participaBandaPreco) {
		this.participaBandaPreco = participaBandaPreco;
	}
	public float getPrecoCustoCaixa() {
		return precoCustoCaixa;
	}
	public void setPrecoCustoCaixa(float precoCustoCaixa) {
		this.precoCustoCaixa = precoCustoCaixa;
	}
	public float getPrecoCustoUnitario() {
		return precoCustoUnitario;
	}
	public void setPrecoCustoUnitario(float precoCustoUnitario) {
		this.precoCustoUnitario = precoCustoUnitario;
	}
	public float getPrecoPvv() {
		return precoPvv;
	}
	public void setPrecoPvv(float precoPvv) {
		this.precoPvv = precoPvv;
	}
	public Integer getPromocao() {
		return promocao;
	}
	public void setPromocao(Integer promocao) {
		this.promocao = promocao;
	}
	public Integer getRestricao() {
		return restricao;
	}
	public void setRestricao(Integer restricao) {
		this.restricao = restricao;
	}
	public float getSelo() {
		return selo;
	}
	public void setSelo(float selo) {
		this.selo = selo;
	}
	public String getTpCont() {
		return tpCont;
	}
	public void setTpCont(String tpCont) {
		this.tpCont = tpCont;
	}
	public String getUfTabelaPreco() {
		return ufTabelaPreco;
	}
	public void setUfTabelaPreco(String ufTabelaPreco) {
		this.ufTabelaPreco = ufTabelaPreco;
	}
	public float getValIcms() {
		return valIcms;
	}
	public void setValIcms(float valIcms) {
		this.valIcms = valIcms;
	}
	public float getValIpi() {
		return valIpi;
	}
	public void setValIpi(float valIpi) {
		this.valIpi = valIpi;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Long getProduto() {
		return produto;
	}
	public void setProduto(Long produto) {
		this.produto = produto;
	}
	
}
