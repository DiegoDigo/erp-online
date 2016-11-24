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
	private Long codigoCanalRecId;
	private Long codigoCategoriaProdutoRecId;
	private Long codigoFamiliaProdutoRecId;
	private Long codigoGrupoProdutoRecId;
	private Long codigoMarcaProdutoRecId;
	private Long codigoProdutoRecId;

	public Long getCodigoGrupoProdutoRecId() {
		return codigoGrupoProdutoRecId;
	}

	public void setCodigoGrupoProdutoRecId(Long codigoGrupoProdutoRecId) {
		this.codigoGrupoProdutoRecId = codigoGrupoProdutoRecId;
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

	public Long getCodigoCanalRecId() {
		return codigoCanalRecId;
	}

	public void setCodigoCanalRecId(Long codigoCanalRecId) {
		this.codigoCanalRecId = codigoCanalRecId;
	}

	public Long getCodigoCategoriaProdutoRecId() {
		return codigoCategoriaProdutoRecId;
	}

	public void setCodigoCategoriaProdutoRecId(Long codigoCategoriaProdutoRecId) {
		this.codigoCategoriaProdutoRecId = codigoCategoriaProdutoRecId;
	}

	public Long getCodigoFamiliaProdutoRecId() {
		return codigoFamiliaProdutoRecId;
	}

	public void setCodigoFamiliaProdutoRecId(Long codigoFamiliaProdutoRecId) {
		this.codigoFamiliaProdutoRecId = codigoFamiliaProdutoRecId;
	}

	public Long getCodigoMarcaProdutoRecId() {
		return codigoMarcaProdutoRecId;
	}

	public void setCodigoMarcaProdutoRecId(Long codigoMarcaProdutoRecId) {
		this.codigoMarcaProdutoRecId = codigoMarcaProdutoRecId;
	}

	public Long getCodigoProdutoRecId() {
		return codigoProdutoRecId;
	}

	public void setCodigoProdutoRecId(Long codigoProdutoRecId) {
		this.codigoProdutoRecId = codigoProdutoRecId;
	}

}
