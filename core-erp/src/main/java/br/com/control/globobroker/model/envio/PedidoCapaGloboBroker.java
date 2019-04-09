package br.com.control.globobroker.model.envio;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({ "cpfcnpj", "razaosocial", "nomefantasia", "inscestadual", "CEPFAT", "tipo_logFat", "logradouroFat",
		"num_logFat", "complementoFat", "bairroFat", "cidadeFat", "UFFat", "CEPCob", "tipo_logCob", "logradouroCob",
		"num_logCob", "complementoCob", "bairroCob", "cidadeCob", "UFCob", "CEPEnt", "tipo_logEnt", "logradouroEnt",
		"num_logEnt", "complementoEnt", "bairroEnt", "cidadeEnt", "UFEnt", "DDD", "contato", "telefone", "email",
		"cnae", "segmento", "condicaofaturamento", "NumeroPedidoJcontrol", "codigoVendedor", "tipoCobranca",
		"condicaoPagamento", "dataEmissao", "dataVencimentoPrimeiraParcela", "dataentrega", "valorDesconto",
		"valorAcrescimo", "valorLiquido", "placa", "atendente", "areaAtendente", "tipodepedido", "tipodefrete",
		"itensPedido" })
public class PedidoCapaGloboBroker implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("cpfcnpj")
	private String cpfcnpj;

	@JsonProperty("razaosocial")
	private String razaosocial;

	@JsonProperty("nomefantasia")
	private String nomefantasia;

	@JsonProperty("inscestadual")
	private String inscestadual;

	@JsonIgnore
	private String CEPFAT;

	@JsonProperty("tipo_logFat")
	private String tipo_logFat;

	@JsonProperty("logradouroFat")
	private String logradouroFat;

	@JsonProperty("num_logFat")
	private String num_logFat;

	@JsonProperty("complementoFat")
	private String complementoFat;

	@JsonProperty("bairroFat")
	private String bairroFat;

	@JsonProperty("cidadeFat")
	private String cidadeFat;

	@JsonIgnore
	private String UFFat;

	@JsonIgnore
	private String CEPCob;

	@JsonProperty("tipo_logCob")
	private String tipo_logCob;

	@JsonProperty("logradouroCob")
	private String logradouroCob;

	@JsonProperty("num_logCob")
	private String num_logCob;

	@JsonProperty("complementoCob")
	private String complementoCob;

	@JsonProperty("bairroCob")
	private String bairroCob;

	@JsonProperty("cidadeCob")
	private String cidadeCob;

	@JsonIgnore
	private String UFCob;

	@JsonIgnore
	private String CEPEnt;

	@JsonProperty("tipo_logEnt")
	private String tipo_logEnt;

	@JsonProperty("logradouroEnt")
	private String logradouroEnt;

	@JsonProperty("num_logEnt")
	private String num_logEnt;

	@JsonProperty("complementoEnt")
	private String complementoEnt;

	@JsonProperty("bairroEnt")
	private String bairroEnt;

	@JsonProperty("cidadeEnt")
	private String cidadeEnt;

	@JsonIgnore
	private String UFEnt;

	@JsonIgnore
	private String DDD;

	@JsonProperty("contato")
	private String contato;

	@JsonProperty("telefone")
	private String telefone;

	@JsonProperty("email")
	private String email;

	@JsonProperty("cnae")
	private String cnae;

	@JsonProperty("segmento")
	private String segmento;

	@JsonProperty("condicaofaturamento")
	private String condicaofaturamento;

	@JsonIgnore
	private String NumeroPedidoJcontrol;

	@JsonProperty("codigoVendedor")
	private String codigoVendedor;

	@JsonProperty("tipoCobranca")
	private String tipoCobranca;

	@JsonProperty("condicaoPagamento")
	private String condicaoPagamento;

	@JsonProperty("dataEmissao")
	private String dataEmissao;

	@JsonProperty("dataVencimentoPrimeiraParcela")
	private String dataVencimentoPrimeiraParcela;

	@JsonProperty("dataentrega")
	private String dataentrega;

	@JsonProperty("valorDesconto")
	private Double valorDesconto;

	@JsonProperty("valorAcrescimo")
	private Double valorAcrescimo;

	@JsonProperty("valorLiquido")
	private Double valorLiquido;

	@JsonProperty("placa")
	private String placa;

	@JsonProperty("atendente")
	private String atendente;

	@JsonProperty("areaAtendente")
	private String areaAtendente;

	@JsonProperty("tipodepedido")
	private String tipodepedido;

	@JsonProperty("tipodefrete")
	private String tipodefrete;

	private String usuarioErpTerceiro;

	private String senhaErpTerceiro;

	public String getUsuarioErpTerceiro() {
		return usuarioErpTerceiro;
	}

	public void setUsuarioErpTerceiro(String usuarioErpTerceiro) {
		this.usuarioErpTerceiro = usuarioErpTerceiro;
	}

	public String getSenhaErpTerceiro() {
		return senhaErpTerceiro;
	}

	public void setSenhaErpTerceiro(String senhaErpTerceiro) {
		this.senhaErpTerceiro = senhaErpTerceiro;
	}

	@JsonProperty("itensPedido")
	private List<PedidoItemGloboBroker> itensPedido;

	@JsonIgnore
	private String enderecoWebService;

	public String getEnderecoWebService() {
		return enderecoWebService;
	}

	public void setEnderecoWebService(String enderecoWebService) {
		this.enderecoWebService = enderecoWebService;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getNomefantasia() {
		return nomefantasia;
	}

	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

	public String getInscestadual() {
		return inscestadual;
	}

	public void setInscestadual(String inscestadual) {
		this.inscestadual = inscestadual;
	}

	public String getCEPFAT() {
		return CEPFAT;
	}

	public void setCEPFAT(String CEPFAT) {
		this.CEPFAT = CEPFAT;
	}

	public String getTipo_logFat() {
		return tipo_logFat;
	}

	public void setTipo_logFat(String tipo_logFat) {
		this.tipo_logFat = tipo_logFat;
	}

	public String getLogradouroFat() {
		return logradouroFat;
	}

	public void setLogradouroFat(String logradouroFat) {
		this.logradouroFat = logradouroFat;
	}

	public String getNum_logFat() {
		return num_logFat;
	}

	public void setNum_logFat(String num_logFat) {
		this.num_logFat = num_logFat;
	}

	public String getComplementoFat() {
		return complementoFat;
	}

	public void setComplementoFat(String complementoFat) {
		this.complementoFat = complementoFat;
	}

	public String getBairroFat() {
		return bairroFat;
	}

	public void setBairroFat(String bairroFat) {
		this.bairroFat = bairroFat;
	}

	public String getCidadeFat() {
		return cidadeFat;
	}

	public void setCidadeFat(String cidadeFat) {
		this.cidadeFat = cidadeFat;
	}

	public String getUFFat() {
		return UFFat;
	}

	public void setUFFat(String UFFat) {
		this.UFFat = UFFat;
	}

	public String getCEPCob() {
		return CEPCob;
	}

	public void setCEPCob(String CEPCob) {
		this.CEPCob = CEPCob;
	}

	public String getTipo_logCob() {
		return tipo_logCob;
	}

	public void setTipo_logCob(String tipo_logCob) {
		this.tipo_logCob = tipo_logCob;
	}

	public String getLogradouroCob() {
		return logradouroCob;
	}

	public void setLogradouroCob(String logradouroCob) {
		this.logradouroCob = logradouroCob;
	}

	public String getNum_logCob() {
		return num_logCob;
	}

	public void setNum_logCob(String num_logCob) {
		this.num_logCob = num_logCob;
	}

	public String getComplementoCob() {
		return complementoCob;
	}

	public void setComplementoCob(String complementoCob) {
		this.complementoCob = complementoCob;
	}

	public String getBairroCob() {
		return bairroCob;
	}

	public void setBairroCob(String bairroCob) {
		this.bairroCob = bairroCob;
	}

	public String getCidadeCob() {
		return cidadeCob;
	}

	public void setCidadeCob(String cidadeCob) {
		this.cidadeCob = cidadeCob;
	}

	public String getUFCob() {
		return UFCob;
	}

	public void setUFCob(String UFCob) {
		this.UFCob = UFCob;
	}

	public String getCEPEnt() {
		return CEPEnt;
	}

	public void setCEPEnt(String CEPEnt) {
		this.CEPEnt = CEPEnt;
	}

	public String getTipo_logEnt() {
		return tipo_logEnt;
	}

	public void setTipo_logEnt(String tipo_logEnt) {
		this.tipo_logEnt = tipo_logEnt;
	}

	public String getLogradouroEnt() {
		return logradouroEnt;
	}

	public void setLogradouroEnt(String logradouroEnt) {
		this.logradouroEnt = logradouroEnt;
	}

	public String getNum_logEnt() {
		return num_logEnt;
	}

	public void setNum_logEnt(String num_logEnt) {
		this.num_logEnt = num_logEnt;
	}

	public String getComplementoEnt() {
		return complementoEnt;
	}

	public void setComplementoEnt(String complementoEnt) {
		this.complementoEnt = complementoEnt;
	}

	public String getBairroEnt() {
		return bairroEnt;
	}

	public void setBairroEnt(String bairroEnt) {
		this.bairroEnt = bairroEnt;
	}

	public String getCidadeEnt() {
		return cidadeEnt;
	}

	public void setCidadeEnt(String cidadeEnt) {
		this.cidadeEnt = cidadeEnt;
	}

	public String getUFEnt() {
		return UFEnt;
	}

	public void setUFEnt(String UFEnt) {
		this.UFEnt = UFEnt;
	}

	public String getDDD() {
		return DDD;
	}

	public void setDDD(String DDD) {
		this.DDD = DDD;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnae() {
		return cnae;
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getCondicaofaturamento() {
		return condicaofaturamento;
	}

	public void setCondicaofaturamento(String condicaofaturamento) {
		this.condicaofaturamento = condicaofaturamento;
	}

	public String getNumeroPedidoJcontrol() {
		return NumeroPedidoJcontrol;
	}

	public void setNumeroPedidoJcontrol(String numeroPedidoJcontrol) {
		NumeroPedidoJcontrol = numeroPedidoJcontrol;
	}

	public String getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public String getTipoCobranca() {
		return tipoCobranca;
	}

	public void setTipoCobranca(String tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
	}

	public String getCondicaoPagamento() {
		return condicaoPagamento;
	}

	public void setCondicaoPagamento(String condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getDataVencimentoPrimeiraParcela() {
		return dataVencimentoPrimeiraParcela;
	}

	public void setDataVencimentoPrimeiraParcela(String dataVencimentoPrimeiraParcela) {
		this.dataVencimentoPrimeiraParcela = dataVencimentoPrimeiraParcela;
	}

	public String getDataentrega() {
		return dataentrega;
	}

	public void setDataentrega(String dataentrega) {
		this.dataentrega = dataentrega;
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Double getValorAcrescimo() {
		return valorAcrescimo;
	}

	public void setValorAcrescimo(Double valorAcrescimo) {
		this.valorAcrescimo = valorAcrescimo;
	}

	public Double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(Double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	public String getAreaAtendente() {
		return areaAtendente;
	}

	public void setAreaAtendente(String areaAtendente) {
		this.areaAtendente = areaAtendente;
	}

	public String getTipodepedido() {
		return tipodepedido;
	}

	public void setTipodepedido(String tipodepedido) {
		this.tipodepedido = tipodepedido;
	}

	public String getTipodefrete() {
		return tipodefrete;
	}

	public void setTipodefrete(String tipodefrete) {
		this.tipodefrete = tipodefrete;
	}

	public List<PedidoItemGloboBroker> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<PedidoItemGloboBroker> itensPedido) {
		this.itensPedido = itensPedido;
	}
}
