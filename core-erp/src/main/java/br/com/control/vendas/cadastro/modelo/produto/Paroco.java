package br.com.control.vendas.cadastro.modelo.produto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Paroco implements Serializable {

	private String codigoTabelaPreco;

	private String codigoClienteErp;

	private String codigoEmpresaErp;

	private int usaBandaPreco;
	
	private String senhaLiberacaoPedido;
	
    private int restricaFinanceira;
    
    private int restricaoComercial;
    
    private int bandaFamFamc;
    
    private int bandaRegPasta;
    
    private int bandaVendedorSupervisorGerente;
    
    private int bandaCanCgrpCan;
	
	
	public int getUsaBandaPreco() {
		return usaBandaPreco;
	}

	public int getRestricaFinanceira() {
		return restricaFinanceira;
	}

	public void setRestricaFinanceira(int restricaFinanceira) {
		this.restricaFinanceira = restricaFinanceira;
	}

	public int getRestricaoComercial() {
		return restricaoComercial;
	}

	public void setRestricaoComercial(int restricaoComercial) {
		this.restricaoComercial = restricaoComercial;
	}

	public int getBandaFamFamc() {
		return bandaFamFamc;
	}

	public void setBandaFamFamc(int bandaFamFamc) {
		this.bandaFamFamc = bandaFamFamc;
	}

	public int getBandaRegPasta() {
		return bandaRegPasta;
	}

	public void setBandaRegPasta(int bandaRegPasta) {
		this.bandaRegPasta = bandaRegPasta;
	}

	public int getBandaVendedorSupervisorGerente() {
		return bandaVendedorSupervisorGerente;
	}

	public void setBandaVendedorSupervisorGerente(int bandaVendedorSupervisorGerente) {
		this.bandaVendedorSupervisorGerente = bandaVendedorSupervisorGerente;
	}

	public int getBandaCanCgrpCan() {
		return bandaCanCgrpCan;
	}

	public void setBandaCanCgrpCan(int bandaCanCgrpCan) {
		this.bandaCanCgrpCan = bandaCanCgrpCan;
	}

	public void setUsaBandaPreco(int usaBandaPreco) {
		this.usaBandaPreco = usaBandaPreco;
	}

	public String getSenhaLiberacaoPedido() {
		return senhaLiberacaoPedido;
	}

	public void setSenhaLiberacaoPedido(String senhaLiberacaoPedido) {
		this.senhaLiberacaoPedido = senhaLiberacaoPedido;
	}

	public String getCodigoTabelaPreco() {
		return codigoTabelaPreco;
	}

	public void setCodigoTabelaPreco(String codigoTabelaPreco) {
		this.codigoTabelaPreco = codigoTabelaPreco;
	}

	public String getCodigoClienteErp() {
		return codigoClienteErp;
	}

	public void setCodigoClienteErp(String codigoClienteErp) {
		this.codigoClienteErp = codigoClienteErp;
	}

	public String getCodigoEmpresaErp() {
		return codigoEmpresaErp;
	}

	public void setCodigoEmpresaErp(String codigoEmpresaErp) {
		this.codigoEmpresaErp = codigoEmpresaErp;
	}
}
