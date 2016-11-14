package br.com.control.portal.mensageria;

import java.io.Serializable;

public class MatriculaEmpresa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer matricula;


	public Integer getMatricula() {
		return matricula;
	}


	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
}
