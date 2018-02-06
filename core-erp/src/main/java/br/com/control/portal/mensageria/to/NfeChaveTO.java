package br.com.control.portal.mensageria.to;

import java.io.Serializable;

public class NfeChaveTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeroNFE;
	private String chaveNFE;
	public String getNumeroNFE() {
		return numeroNFE;
	}
	public void setNumeroNFE(String numeroNFE) {
		this.numeroNFE = numeroNFE;
	}
	public String getChaveNFE() {
		return chaveNFE;
	}
	public void setChaveNFE(String chaveNFE) {
		this.chaveNFE = chaveNFE;
	}
	
}