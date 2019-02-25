package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;

import br.com.control.portal.mensageria.to.ClienteTO;

@SuppressWarnings("serial")
public class Cliente implements Serializable {

	private String codigoErp;
	private Boolean abateIcms;
	private Boolean ativo;
	private float bonusDisponivel;
	private String classe;
	private String codigoTabpreco;
	private String contato;
	private String cpfCnpj;
	private Boolean desprezaTaxaFinanceira;
	private String diaSemana;
	private Integer diasEntrega;
	private String email;
	private Boolean ignoraBandaPreco;
	private float limiteCredito;
	private String motivoBloqClasse20;
	private String motivoBloqueioJuridico;
	private String numeroCliente;
	private Integer pasta;
	private String razaoSocial;
	private String regiaoCliente;
	private Integer registroAlterado;
	private Boolean restricaoComercial;
	private String inconformidadeCadastro;
	private String sigla;
	private String subCanal;
	private String telefoneDdd;
	private String telefoneTronco;
	private Integer usoVerbaRestritoProduto;
	private String codigoErpCanal;
	private String codigoErpCondicaoPagamento;
	private String codigoErpTipoCobranca;
	private int celular;
	 private Boolean disponivelPortal;

	public String getCodigoErp() {
		return codigoErp;
	}

	public void setCodigoErp(String codigoErp) {
		this.codigoErp = codigoErp;
	}

	public Boolean getAbateIcms() {
		return abateIcms;
	}

	public void setAbateIcms(Boolean abateIcms) {
		this.abateIcms = abateIcms;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public float getBonusDisponivel() {
		return bonusDisponivel;
	}

	public void setBonusDisponivel(float bonusDisponivel) {
		this.bonusDisponivel = bonusDisponivel;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getCodigoTabpreco() {
		return codigoTabpreco;
	}

	public void setCodigoTabpreco(String codigoTabpreco) {
		this.codigoTabpreco = codigoTabpreco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Boolean getDesprezaTaxaFinanceira() {
		return desprezaTaxaFinanceira;
	}

	public void setDesprezaTaxaFinanceira(Boolean desprezaTaxaFinanceira) {
		this.desprezaTaxaFinanceira = desprezaTaxaFinanceira;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public Integer getDiasEntrega() {
		return diasEntrega;
	}

	public void setDiasEntrega(Integer diasEntrega) {
		this.diasEntrega = diasEntrega;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIgnoraBandaPreco() {
		return ignoraBandaPreco;
	}

	public void setIgnoraBandaPreco(Boolean ignoraBandaPreco) {
		this.ignoraBandaPreco = ignoraBandaPreco;
	}

	public float getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getMotivoBloqClasse20() {
		return motivoBloqClasse20;
	}

	public void setMotivoBloqClasse20(String motivoBloqClasse20) {
		this.motivoBloqClasse20 = motivoBloqClasse20;
	}

	public String getMotivoBloqueioJuridico() {
		return motivoBloqueioJuridico;
	}

	public void setMotivoBloqueioJuridico(String motivoBloqueioJuridico) {
		this.motivoBloqueioJuridico = motivoBloqueioJuridico;
	}

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public Integer getPasta() {
		return pasta;
	}

	public void setPasta(Integer pasta) {
		this.pasta = pasta;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getRegiaoCliente() {
		return regiaoCliente;
	}

	public void setRegiaoCliente(String regiaoCliente) {
		this.regiaoCliente = regiaoCliente;
	}

	public Integer getRegistroAlterado() {
		return registroAlterado;
	}

	public void setRegistroAlterado(Integer registroAlterado) {
		this.registroAlterado = registroAlterado;
	}

	public Boolean getRestricaoComercial() {
		return restricaoComercial;
	}

	public void setRestricaoComercial(Boolean restricaoComercial) {
		this.restricaoComercial = restricaoComercial;
	}

	public String getInconformidadeCadastro() {
		return inconformidadeCadastro;
	}

	public void setInconformidadeCadastro(String inconformidadeCadastro) {
		this.inconformidadeCadastro = inconformidadeCadastro;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getSubCanal() {
		return subCanal;
	}

	public void setSubCanal(String subCanal) {
		this.subCanal = subCanal;
	}

	public String getTelefoneDdd() {
		return telefoneDdd;
	}

	public void setTelefoneDdd(String telefoneDdd) {
		this.telefoneDdd = telefoneDdd;
	}

	public String getTelefoneTronco() {
		return telefoneTronco;
	}

	public void setTelefoneTronco(String telefoneTronco) {
		this.telefoneTronco = telefoneTronco;
	}

	public Integer getUsoVerbaRestritoProduto() {
		return usoVerbaRestritoProduto;
	}

	public void setUsoVerbaRestritoProduto(Integer usoVerbaRestritoProduto) {
		this.usoVerbaRestritoProduto = usoVerbaRestritoProduto;
	}

	public String getCodigoErpCanal() {
		return codigoErpCanal;
	}

	public void setCodigoErpCanal(String codigoErpCanal) {
		this.codigoErpCanal = codigoErpCanal;
	}

	public String getCodigoErpCondicaoPagamento() {
		return codigoErpCondicaoPagamento;
	}

	public void setCodigoErpCondicaoPagamento(String codigoErpCondicaoPagamento) {
		this.codigoErpCondicaoPagamento = codigoErpCondicaoPagamento;
	}

	public String getCodigoErpTipoCobranca() {
		return codigoErpTipoCobranca;
	}

	public void setCodigoErpTipoCobranca(String codigoErpTipoCobranca) {
		this.codigoErpTipoCobranca = codigoErpTipoCobranca;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public Cliente() {

	}

	public Cliente(ClienteTO cliente) {
		this.codigoErp = cliente.getCodigoErp();
		this.abateIcms = cliente.getAbateIcms();
		this.ativo = cliente.getAtivo();
		this.bonusDisponivel = cliente.getBonusDisponivel();
		this.classe = String.valueOf(cliente.getClasse());
		this.codigoTabpreco = String.valueOf(cliente.getCodigoTabpreco());
		this.contato = cliente.getContato();
		this.cpfCnpj = cliente.getCpfCnpj();
		this.desprezaTaxaFinanceira = cliente.getDesprezaTaxaFinanceira();
		this.diaSemana = cliente.getDiaSemana();
		this.diasEntrega = cliente.getDiasEntrega();
		this.email = cliente.getEmail();
		this.ignoraBandaPreco = cliente.getIgnoraBandaPreco();
		this.limiteCredito = cliente.getLimiteCredito();
		this.motivoBloqClasse20 = cliente.getMotivoBloqClasse20();
		this.motivoBloqueioJuridico = cliente.getMotivoBloqueioJuridico();
		this.numeroCliente = cliente.getNumeroCliente();
		this.pasta = cliente.getPasta();
		this.razaoSocial = cliente.getRazaoSocial();
		this.regiaoCliente = cliente.getRegiaoCliente();
		this.registroAlterado = cliente.getRegistroAlterado();
		this.restricaoComercial = cliente.getRestricaoComercial();
		this.inconformidadeCadastro = cliente.getInconformidadeCadastro();
		this.sigla = cliente.getSigla();
		this.subCanal = String.valueOf(cliente.getSubCanal());
		this.telefoneDdd = String.valueOf(cliente.getTelefoneDdd());
		this.telefoneTronco = String.valueOf(cliente.getTelefoneTronco());
		this.usoVerbaRestritoProduto = cliente.getUsoVerbaRestritoProduto();
		this.codigoErpCanal = cliente.getCodigoErpCanal();
		this.codigoErpCondicaoPagamento = cliente.getCodigoErpCondicaoPagamento();
		this.codigoErpTipoCobranca = cliente.getCodigoErpTipoCobranca();
		this.celular = cliente.getCelular();
	}

	public Boolean getDisponivelPortal() {
		return disponivelPortal;
	}

	public void setDisponivelPortal(Boolean disponivelPortal) {
		this.disponivelPortal = disponivelPortal;
	 }

	@Override
	public String toString() {
		return "Cliente [codigoErp=" + codigoErp + ", abateIcms=" + abateIcms + ", ativo=" + ativo
				+ ", bonusDisponivel=" + bonusDisponivel + ", classe=" + classe + ", codigoTabpreco=" + codigoTabpreco
				+ ", contato=" + contato + ", cpfCnpj=" + cpfCnpj + ", desprezaTaxaFinanceira=" + desprezaTaxaFinanceira
				+ ", diaSemana=" + diaSemana + ", diasEntrega=" + diasEntrega + ", email=" + email
				+ ", ignoraBandaPreco=" + ignoraBandaPreco + ", limiteCredito=" + limiteCredito
				+ ", motivoBloqClasse20=" + motivoBloqClasse20 + ", motivoBloqueioJuridico=" + motivoBloqueioJuridico
				+ ", numeroCliente=" + numeroCliente + ", pasta=" + pasta + ", razaoSocial=" + razaoSocial
				+ ", regiaoCliente=" + regiaoCliente + ", registroAlterado=" + registroAlterado
				+ ", restricaoComercial=" + restricaoComercial + ", inconformidadeCadastro=" + inconformidadeCadastro
				+ ", sigla=" + sigla + ", subCanal=" + subCanal + ", telefoneDdd=" + telefoneDdd + ", telefoneTronco="
				+ telefoneTronco + ", usoVerbaRestritoProduto=" + usoVerbaRestritoProduto + ", codigoErpCanal="
				+ codigoErpCanal + ", codigoErpCondicaoPagamento=" + codigoErpCondicaoPagamento
				+ ", codigoErpTipoCobranca=" + codigoErpTipoCobranca + ", disponivelPortal=" + disponivelPortal + "]";
	}
	
	
}
