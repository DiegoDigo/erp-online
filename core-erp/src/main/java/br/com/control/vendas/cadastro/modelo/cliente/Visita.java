package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Visita implements Serializable {

	private Integer numeroPasta;
	private String diaVisita;

	public Integer getNumeroPasta() {
		return numeroPasta;
	}

	public void setNumeroPasta(Integer numeroPasta) {
		this.numeroPasta = numeroPasta;
	}

	public String getDiaVisita() {
		return diaVisita;
	}

	public void setDiaVisita(String diaVisita) {
		this.diaVisita = diaVisita;
	}

}
