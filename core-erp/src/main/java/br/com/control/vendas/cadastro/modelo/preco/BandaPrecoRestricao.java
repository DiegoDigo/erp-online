package br.com.control.vendas.cadastro.modelo.preco;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BandaPrecoRestricao implements Serializable {

	private Long recId;
	private Boolean ativo;
	private Long CodigoBandaPrecoRecId;
	private Long CodigoVendedorRecId;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Long getCodigoBandaPrecoRecId() {
		return CodigoBandaPrecoRecId;
	}

	public void setCodigoBandaPrecoRecId(Long codigoBandaPrecoRecId) {
		CodigoBandaPrecoRecId = codigoBandaPrecoRecId;
	}

	public Long getCodigoVendedorRecId() {
		return CodigoVendedorRecId;
	}

	public void setCodigoVendedorRecId(Long codigoVendedorRecId) {
		CodigoVendedorRecId = codigoVendedorRecId;
	}

}
