package br.com.control.portal.filter;

import java.util.List;

import org.springframework.data.domain.Page;

public class ResultadoPaginado<T> {
	
	private List<T> resultado;
	
	private int paginaAtual;
	private int itensPorPaginas;
	private int totalDePaginas;
	private long totalDeElementos;
	private boolean isPrimeiraPagina;
	private boolean isUltimaPagina;
	
	

	public ResultadoPaginado(Page<T> consultaPaginada) {
		this.resultado = consultaPaginada.getContent();
		this.paginaAtual = consultaPaginada.getNumber();
		this.itensPorPaginas = consultaPaginada.getNumberOfElements();
		this.totalDePaginas = consultaPaginada.getTotalPages();
		this.totalDeElementos = consultaPaginada.getTotalElements();
		this.isPrimeiraPagina = consultaPaginada.isFirst();
		this.isUltimaPagina = consultaPaginada.isLast();
	}

	public ResultadoPaginado() {
	}

	public List<T> getResultado() {
		return resultado;
	}

	public void setResultado(List<T> resultado) {
		this.resultado = resultado;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public int getItensPorPaginas() {
		return itensPorPaginas;
	}

	public void setItensPorPaginas(int itensPorPaginas) {
		this.itensPorPaginas = itensPorPaginas;
	}

	public int getTotalDePaginas() {
		return totalDePaginas;
	}

	public void setTotalDePaginas(int totalDePaginas) {
		this.totalDePaginas = totalDePaginas;
	}

	public long getTotalDeElementos() {
		return totalDeElementos;
	}

	public void setTotalDeElementos(long totalDeElementos) {
		this.totalDeElementos = totalDeElementos;
	}

	public boolean isPrimeiraPagina() {
		return isPrimeiraPagina;
	}

	public void setPrimeiraPagina(boolean isPrimeiraPagina) {
		this.isPrimeiraPagina = isPrimeiraPagina;
	}

	public boolean isUltimaPagina() {
		return isUltimaPagina;
	}

	public void setUltimaPagina(boolean isUltimaPagina) {
		this.isUltimaPagina = isUltimaPagina;
	}
	
}
