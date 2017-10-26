package br.com.control.vendas.cadastro.modelo.cliente;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class Visita implements Serializable {

	private Integer numeroPasta;
	private Timestamp diaVisita;

	public Integer getNumeroPasta() {
		return numeroPasta;
	}

	public void setNumeroPasta(Integer numeroPasta) {
		this.numeroPasta = numeroPasta;
	}

	public Timestamp getDiaVisita() {
		return diaVisita;
	}

	public void setDiaVisita(Timestamp diaVisita) {
		this.diaVisita = diaVisita;
	}

}
