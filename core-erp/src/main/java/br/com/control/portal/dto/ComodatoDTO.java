package br.com.control.portal.dto;

public class ComodatoDTO {
	private Long recId;
	private String numeroCev;
	private Integer quantidade;
	private String codigoErp;

	public ComodatoDTO() {
	}

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getNumeroCev() {
		return numeroCev;
	}

	public void setNumeroCev(String numeroCev) {
		this.numeroCev = numeroCev;
	}

	public String getCodigoErp() {
		return codigoErp;
	}

	public void setCodigoErp(String codigoErp) {
		this.codigoErp = codigoErp;
	}
	
}
