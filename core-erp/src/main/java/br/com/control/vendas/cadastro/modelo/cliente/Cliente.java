package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.canal.Canal;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;
import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;



@SuppressWarnings("serial")
public class Cliente implements Serializable{
	
	private Long recId;
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
	private Canal canalVenda;
	private CondicaoPagamento condicaoPagamento;
	private TipoCobranca tipoCobranca;
	public Long getRecId() {
		return recId;
	}
	public void setRecId(Long recId) {
		this.recId = recId;
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
	public Canal getCanalVenda() {
		return canalVenda;
	}
	public void setCanalVenda(Canal canalVenda) {
		this.canalVenda = canalVenda;
	}
	public CondicaoPagamento getCondicaoPagamento() {
		return condicaoPagamento;
	}
	public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}
	public TipoCobranca getTipoCobranca() {
		return tipoCobranca;
	}
	public void setTipoCobranca(TipoCobranca tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
	}
	
	

	
		
}
