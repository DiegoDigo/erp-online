package br.com.control.globobroker.model.envio;

import java.io.Serializable;

public class MovimentoFinanceiroGloboBroker implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long recId;
	
	private String cpfCnpj;
	private String numeroTitulo;
	private String numeroParcela;
	private int tipoTitulo;
	private int dataEmissao;
	private int dataVencimento;	
	private int dataPagamento;
	private float valorTitulo;
	private int bancoBaixa;
	private int tipoCobranca;
	private String nossoNumero;
	private String numeroPedidoJcontrol;
	
	public MovimentoFinanceiroGloboBroker() {
		
	}

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getNumeroTitulo() {
		return numeroTitulo;
	}

	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}

	public String getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(String numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public int getTipoTitulo() {
		return tipoTitulo;
	}

	public void setTipoTitulo(int tipoTitulo) {
		this.tipoTitulo = tipoTitulo;
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

	public int getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(int dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public float getValorTitulo() {
		return valorTitulo;
	}

	public void setValorTitulo(float valorTitulo) {
		this.valorTitulo = valorTitulo;
	}

	public int getBancoBaixa() {
		return bancoBaixa;
	}

	public void setBancoBaixa(int bancoBaixa) {
		this.bancoBaixa = bancoBaixa;
	}

	public int getTipoCobranca() {
		return tipoCobranca;
	}

	public void setTipoCobranca(int tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
	}

	public String getNossoNumero() {
		return nossoNumero;
	}

	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public String getNumeroPedidoJcontrol() {
		return numeroPedidoJcontrol;
	}

	public void setNumeroPedidoJcontrol(String numeroPedidoJcontrol) {
		this.numeroPedidoJcontrol = numeroPedidoJcontrol;
	}
}
