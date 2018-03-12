package br.com.control.vendas.cadastro.modelo.produto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Paroco implements Serializable {

	private String codigoTabelaPreco;

	private String codigoClienteErp;

	private String codigoEmpresaErp;

	private int usaBandaPreco;
	
	private String senhaLiberacaoPedido;
	
	
	public int getUsaBandaPreco() {
		return usaBandaPreco;
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
