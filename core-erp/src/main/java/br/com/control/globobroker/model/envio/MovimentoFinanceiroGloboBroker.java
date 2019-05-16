package br.com.control.globobroker.model.envio;

import java.io.Serializable;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class MovimentoFinanceiroGloboBroker implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long recId;
	
	@SequenciaParametrosProcedure(index = 1)
	private String cpfCnpj;
	@SequenciaParametrosProcedure(index = 2)
	private String numeroParcela;
	@SequenciaParametrosProcedure(index = 3)
	private int dataVencimento;
	@SequenciaParametrosProcedure(index = 4)
	private int dataPagamento;
	@SequenciaParametrosProcedure(index = 5)
	private float valorTitulo;
	@SequenciaParametrosProcedure(index = 6)
	private int bancoBaixa;
	@SequenciaParametrosProcedure(index = 7)
	private String numeroPedidoJcontrol;
	@SequenciaParametrosProcedure(index = 8, isRetornoProcedure=true)
	private String codigoErro = "";
	@SequenciaParametrosProcedure(index = 9, isRetornoProcedure=true)
	private String mensagemRetorno = "";

	public MovimentoFinanceiroGloboBroker() {
		
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(String numeroParcela) {
		this.numeroParcela = numeroParcela;
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
	

	public String getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(String codigoErro) {
		this.codigoErro = codigoErro;
	}

	public String getMensagemRetorno() {
		return mensagemRetorno;
	}

	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}

	public String getNumeroPedidoJcontrol() {
		return numeroPedidoJcontrol;
	}

	public void setNumeroPedidoJcontrol(String numeroPedidoJcontrol) {
		this.numeroPedidoJcontrol = numeroPedidoJcontrol;
	}
}
