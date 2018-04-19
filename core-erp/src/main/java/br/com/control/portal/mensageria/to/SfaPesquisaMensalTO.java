package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class SfaPesquisaMensalTO  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@SequenciaParametrosProcedure(index = 1)
	private String codigoVendedor;
	@SequenciaParametrosProcedure(index = 2)
	private String regiaoCliente; 		
	@SequenciaParametrosProcedure(index = 3)
	private String numeroCliente; 
	@SequenciaParametrosProcedure(index = 4)
	private String codigoPesquisa; 	
	@SequenciaParametrosProcedure(index = 5)
	private String codigoProduto; 		
	@SequenciaParametrosProcedure(index = 6)
	private String codigoConcorrente;	
	@SequenciaParametrosProcedure(index = 7)
	private String codigoMotivo; 	
	@SequenciaParametrosProcedure(index = 8)
	private String dataInclusao;	
	@SequenciaParametrosProcedure(index = 9)
	private String qtdCompra;	
	@SequenciaParametrosProcedure(index = 10)
	private BigDecimal precoCompra;
	@SequenciaParametrosProcedure(index = 11)
	private BigDecimal precoVenda;	
	@SequenciaParametrosProcedure(index = 12, isRetornoProcedure = true)
	private int statusRetorno;
	@SequenciaParametrosProcedure(index = 13, isRetornoProcedure = true)
	private String msgRetorno = "";
	
	@Override
	public String toString() {		
		return "PesquisaMensalSfa : [ codigoVendedor: "+ codigoVendedor +
				" regiaoCliente: "+ regiaoCliente + " numeroCliente: "+ numeroCliente +
				" codigoPesquisa: " + codigoPesquisa +" codigoProduto: "+ codigoProduto +
				" codigoConcorrente: " + codigoConcorrente +
				" codigoMotivo: "+ codigoMotivo +" dataInclusao:" +dataInclusao+ " qtdCompra: "+ qtdCompra +
				" precoCompra: "+ precoCompra +" precoVenda: "+precoVenda +" ]";
	}	
	
	
	public String getMsgRetorno() {
		return msgRetorno;
	}
	public void setMsgRetorno(String msgRetorno) {
		this.msgRetorno = msgRetorno;
	}
	public String getCodigoVendedor() {
		return codigoVendedor;
	}
	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}
	public String getRegiaoCliente() {
		return regiaoCliente;
	}
	public void setRegiaoCliente(String regiaoCliente) {
		this.regiaoCliente = regiaoCliente;
	}
	public String getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public String getCodigoPesquisa() {
		return codigoPesquisa;
	}
	public void setCodigoPesquisa(String codigoPesquisa) {
		this.codigoPesquisa = codigoPesquisa;
	}
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getCodigoConcorrente() {
		return codigoConcorrente;
	}
	public void setCodigoConcorrente(String codigoConcorrente) {
		this.codigoConcorrente = codigoConcorrente;
	}
	public String getCodigoMotivo() {
		return codigoMotivo;
	}
	public void setCodigoMotivo(String codigoMotivo) {
		this.codigoMotivo = codigoMotivo;
	}
	public String getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(String dataInclusao) {		
		this.dataInclusao = dataInclusao;
	}
	public String getQtdCompra() {
		return qtdCompra;
	}
	public void setQtdCompra(String qtdCompra) {
		this.qtdCompra = qtdCompra;
	}
	public BigDecimal getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(BigDecimal precoCompra) {
		this.precoCompra = precoCompra;
	}
	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}


	public int getStatusRetorno() {
		return statusRetorno;
	}


	public void setStatusRetorno(int statusRetorno) {
		this.statusRetorno = statusRetorno;
	}


	
	
}
