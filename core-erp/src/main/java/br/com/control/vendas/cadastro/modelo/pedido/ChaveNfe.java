package br.com.control.vendas.cadastro.modelo.pedido;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ChaveNfe implements Serializable {

	private String notaFiscalNumero;
	private String serieFiscal;
	private String chaveEletronica;
	
	public String getNotaFiscalNumero() {
		return notaFiscalNumero;
	}
	public void setNotaFiscalNumero(String notaFiscalNumero) {
		this.notaFiscalNumero = notaFiscalNumero;
	}
	public String getSerieFiscal() {
		return serieFiscal;
	}
	public void setSerieFiscal(String serieFiscal) {
		this.serieFiscal = serieFiscal;
	}
	public String getChaveEletronica() {
		return chaveEletronica;
	}
	public void setChaveEletronica(String chaveEletronica) {
		this.chaveEletronica = chaveEletronica;
	}
}
