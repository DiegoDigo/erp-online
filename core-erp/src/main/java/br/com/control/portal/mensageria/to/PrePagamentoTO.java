package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.annotation.SequenciaParametrosProcedure;

/**
 * @author rasa.lariguet
 *
 */
public class PrePagamentoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@SequenciaParametrosProcedure(index = 1)
	private int codigoEmpresa;
	@SequenciaParametrosProcedure(index = 2)
	private int codigoClienteErp;
	@SequenciaParametrosProcedure(index = 3)
	private String numeroTitulo;
	@SequenciaParametrosProcedure(index = 4)
	private int tipoLancamento;
	@SequenciaParametrosProcedure(index = 5)
	private int dataEmissao;
	@SequenciaParametrosProcedure(index = 6)
	private int dataVencimento;
	@SequenciaParametrosProcedure(index = 7)
	private int dataPagamento;
	@SequenciaParametrosProcedure(index = 8)
	private float valorTitulo;
	@SequenciaParametrosProcedure(index = 9)
	private float valorPagamento;
	@SequenciaParametrosProcedure(index = 10)
	private float percentualJuros;
	@SequenciaParametrosProcedure(index = 11)
	private float valorJuros;
	@SequenciaParametrosProcedure(index = 12)
	private float percentualMora;
	@SequenciaParametrosProcedure(index = 13)
	private float valorMora;
	@SequenciaParametrosProcedure(index = 14)
	private float percentualDesconto;
	@SequenciaParametrosProcedure(index = 15)
	private float valorDesconto;
	@SequenciaParametrosProcedure(index = 16)
	private float percentualOperacao;
	@SequenciaParametrosProcedure(index = 17)
	private float valorOperacao;
	@SequenciaParametrosProcedure(index = 18)
	private String codigoOperacao;
	@SequenciaParametrosProcedure(index = 19)
	private String numeroBoleto;
	@SequenciaParametrosProcedure(index = 20, isRetornoProcedure = true)
	private int statusRetorno;
	@SequenciaParametrosProcedure(index = 21, isRetornoProcedure = true)
	private String msgRetorno = "";
	
	
	public int getStatusRetorno() {
		return statusRetorno;
	}
	public void setStatusRetorno(int statusRetorno) {
		this.statusRetorno = statusRetorno;
	}
	public String getMsgRetorno() {
		return msgRetorno;
	}
	public void setMsgRetorno(String msgRetorno) {
		this.msgRetorno = msgRetorno;
	}
	public int getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(int dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	public int getCodigoClienteErp() {
		return codigoClienteErp;
	}
	public void setCodigoClienteErp(int codigoClienteErp) {
		this.codigoClienteErp = codigoClienteErp;
	}
	public String getNumeroTitulo() {
		return numeroTitulo;
	}
	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}
	public int getTipoLancamento() {
		return tipoLancamento;
	}
	public void setTipoLancamento(int tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}
	public int getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(int dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public int getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(int dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public float getValorTitulo() {
		return valorTitulo;
	}
	public void setValorTitulo(float valorTitulo) {
		this.valorTitulo = valorTitulo;
	}
	public float getValorPagamento() {
		return valorPagamento;
	}
	public void setValorPagamento(float valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	public float getPercentualJuros() {
		return percentualJuros;
	}
	public void setPercentualJuros(float percentualJuros) {
		this.percentualJuros = percentualJuros;
	}
	public float getValorJuros() {
		return valorJuros;
	}
	public void setValorJuros(float valorJuros) {
		this.valorJuros = valorJuros;
	}
	public float getPercentualMora() {
		return percentualMora;
	}
	public void setPercentualMora(float percentualMora) {
		this.percentualMora = percentualMora;
	}
	public float getValorMora() {
		return valorMora;
	}
	public void setValorMora(float valorMora) {
		this.valorMora = valorMora;
	}
	public float getPercentualDesconto() {
		return percentualDesconto;
	}
	public void setPercentualDesconto(float percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}
	public float getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public float getPercentualOperacao() {
		return percentualOperacao;
	}
	public void setPercentualOperacao(float percentualOperacao) {
		this.percentualOperacao = percentualOperacao;
	}
	public float getValorOperacao() {
		return valorOperacao;
	}
	public void setValorOperacao(float valorOperacao) {
		this.valorOperacao = valorOperacao;
	}
	public String getCodigoOperacao() {
		return codigoOperacao;
	}
	public void setCodigoOperacao(String codigoOperacao) {
		this.codigoOperacao = codigoOperacao;
	}
	public String getNumeroBoleto() {
		return numeroBoleto;
	}
	public void setNumeroBoleto(String numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}
	@Override
	public String toString() {
		return "PrePagamentoTO [codigoEmpresa=" + codigoEmpresa + ", codigoClienteErp=" + codigoClienteErp
				+ ", numeroTitulo=" + numeroTitulo + ", tipoLancamento=" + tipoLancamento + ", dataEmissao="
				+ dataEmissao + ", dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento
				+ ", valorTitulo=" + valorTitulo + ", valorPagamento=" + valorPagamento + ", percentualJuros="
				+ percentualJuros + ", valorJuros=" + valorJuros + ", percentualMora=" + percentualMora + ", valorMora="
				+ valorMora + ", percentualDesconto=" + percentualDesconto + ", valorDesconto=" + valorDesconto
				+ ", percentualOperacao=" + percentualOperacao + ", valorOperacao=" + valorOperacao
				+ ", codigoOperacao=" + codigoOperacao + ", numeroBoleto=" + numeroBoleto + "]";
	}

	
	
}