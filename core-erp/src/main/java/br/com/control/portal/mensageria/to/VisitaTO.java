package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.annotation.SequenciaParametrosProcedure;
import br.com.control.vendas.cadastro.modelo.cliente.Visita;

public class VisitaTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@SequenciaParametrosProcedure(index = 1)
	private int numeroDias;

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	private Integer numeroPasta;
	private String diasVisita;

	public Integer getNumeroPasta() {
		return numeroPasta;
	}

	public void setNumeroPasta(Integer numeroPasta) {
		this.numeroPasta = numeroPasta;
	}

	public String getDiasVisita() {
		return diasVisita;
	}

	public void setDiasVisita(String diasVisita) {
		this.diasVisita = diasVisita;
	}

	public VisitaTO() {
	}

	public VisitaTO(Visita visita) {
		this.setDiasVisita(visita.getDiaVisita());
		this.setNumeroPasta(visita.getNumeroPasta());
	}
}
