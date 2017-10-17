package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.annotation.SequenciaParametrosProcedure;

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

}
