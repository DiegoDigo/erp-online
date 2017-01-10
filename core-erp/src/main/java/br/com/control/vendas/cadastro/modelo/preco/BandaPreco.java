package br.com.control.vendas.cadastro.modelo.preco;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BandaPreco implements Serializable {

	private Long recId;
	private Boolean ativo;
	private String codigoBandaPreco;
	private String codigoFameb;
	private String codigoGrupoAnaliseCli;
	private String codigoGrupoCanalCli;
	private String codigoPastaCli;
	private String descricao;
	private String origemBanda;
	private String regiaoCliente;
	private Integer unidade;
	private String codigoCanalERP;
	private String codigoCategoriaProdutoERP;
	private String codigoFamiliaProdutoERP;
	private String codigoGrupoProdutoERP;
	private String codigoMarcaProdutoERP;
	private String codigoProdutoERP;
	private String codigoCondicaoPagamentoERP;
	
	public String getCodigoCondicaoPagamentoERP() {
		return codigoCondicaoPagamentoERP;
	}
	public void setCodigoCondicaoPagamentoERP(String codigoCondicaoPagamentoERP) {
		this.codigoCondicaoPagamentoERP = codigoCondicaoPagamentoERP;
	}
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
	public String getCodigoBandaPreco() {
		return codigoBandaPreco;
	}
	public void setCodigoBandaPreco(String codigoBandaPreco) {
		this.codigoBandaPreco = codigoBandaPreco;
	}
	public String getCodigoFameb() {
		return codigoFameb;
	}
	public void setCodigoFameb(String codigoFameb) {
		this.codigoFameb = codigoFameb;
	}
	public String getCodigoGrupoAnaliseCli() {
		return codigoGrupoAnaliseCli;
	}
	public void setCodigoGrupoAnaliseCli(String codigoGrupoAnaliseCli) {
		this.codigoGrupoAnaliseCli = codigoGrupoAnaliseCli;
	}
	public String getCodigoGrupoCanalCli() {
		return codigoGrupoCanalCli;
	}
	public void setCodigoGrupoCanalCli(String codigoGrupoCanalCli) {
		this.codigoGrupoCanalCli = codigoGrupoCanalCli;
	}
	public String getCodigoPastaCli() {
		return codigoPastaCli;
	}
	public void setCodigoPastaCli(String codigoPastaCli) {
		this.codigoPastaCli = codigoPastaCli;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getOrigemBanda() {
		return origemBanda;
	}
	public void setOrigemBanda(String origemBanda) {
		this.origemBanda = origemBanda;
	}
	public String getRegiaoCliente() {
		return regiaoCliente;
	}
	public void setRegiaoCliente(String regiaoCliente) {
		this.regiaoCliente = regiaoCliente;
	}
	public Integer getUnidade() {
		return unidade;
	}
	public void setUnidade(Integer unidade) {
		this.unidade = unidade;
	}
	public String getCodigoCanalERP() {
		return codigoCanalERP;
	}
	public void setCodigoCanalERP(String codigoCanalERP) {
		this.codigoCanalERP = codigoCanalERP;
	}
	public String getCodigoCategoriaProdutoERP() {
		return codigoCategoriaProdutoERP;
	}
	public void setCodigoCategoriaProdutoERP(String codigoCategoriaProdutoERP) {
		this.codigoCategoriaProdutoERP = codigoCategoriaProdutoERP;
	}
	public String getCodigoFamiliaProdutoERP() {
		return codigoFamiliaProdutoERP;
	}
	public void setCodigoFamiliaProdutoERP(String codigoFamiliaProdutoERP) {
		this.codigoFamiliaProdutoERP = codigoFamiliaProdutoERP;
	}
	public String getCodigoGrupoProdutoERP() {
		return codigoGrupoProdutoERP;
	}
	public void setCodigoGrupoProdutoERP(String codigoGrupoProdutoERP) {
		this.codigoGrupoProdutoERP = codigoGrupoProdutoERP;
	}
	public String getCodigoMarcaProdutoERP() {
		return codigoMarcaProdutoERP;
	}
	public void setCodigoMarcaProdutoERP(String codigoMarcaProdutoERP) {
		this.codigoMarcaProdutoERP = codigoMarcaProdutoERP;
	}
	public String getCodigoProdutoERP() {
		return codigoProdutoERP;
	}
	public void setCodigoProdutoERP(String codigoProdutoERP) {
		this.codigoProdutoERP = codigoProdutoERP;
	}
	
	
}
