package br.com.control.vendas.cadastro.modelo;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class MovimentoFinanceiro implements Serializable {

	private Long recId;
	private Long cadastroClienteRecId;
	private Long codigoProduto;
	private Timestamp dataOperacao;
	private Timestamp dataVencimento;
	private String mod;
	private String numeroDocumento;
	private String tipoRegistro;
	private float valor;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public Long getCadastroClienteRecId() {
		return cadastroClienteRecId;
	}

	public void setCadastroClienteRecId(Long cadastroClienteRecId) {
		this.cadastroClienteRecId = cadastroClienteRecId;
	}

	public Long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public Timestamp getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(Timestamp dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public Timestamp getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Timestamp dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
