package br.com.control.globobroker.model.envio;

import java.io.Serializable;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class MovimentoFinanceiroGloboBroker implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long recId;
	
	@SequenciaParametrosProcedure(index = 1)
	private String cpfCnpj;

	@SequenciaParametrosProcedure(index = 2)
	private String numeroTitulo;
	@SequenciaParametrosProcedure(index = 3)
	private String numeroParcela;
	@SequenciaParametrosProcedure(index = 4)
	private int tipoTitulo;
	@SequenciaParametrosProcedure(index = 5)
	private int dataEmissao;
	@SequenciaParametrosProcedure(index = 6)
	private int dataVencimento;	
	@SequenciaParametrosProcedure(index = 7)
	private int dataPagamento;
	@SequenciaParametrosProcedure(index = 8)
	private float valorTitulo;
	@SequenciaParametrosProcedure(index = 9)
	private int bancoBaixa;
	@SequenciaParametrosProcedure(index = 10)
	private int tipoCobranca;
	@SequenciaParametrosProcedure(index = 11)
	private String nossoNumero;
	
	@SequenciaParametrosProcedure(index = 12, isRetornoProcedure=true)
	private String codigoErro = "";
	@SequenciaParametrosProcedure(index = 13, isRetornoProcedure=true)
	private String mensagemRetorno = "";
	
	
	private String numeroPedidoJcontrol;
	private TipoMovimentoEnum tipoMovimento;

	
	
	public MovimentoFinanceiroGloboBroker() {
		
	}
	
	public boolean isTituloBaixado() {
		return this.tipoMovimento == TipoMovimentoEnum.BAIXADO;
	}

	public boolean isTituloAberto() {
		return this.tipoMovimento == TipoMovimentoEnum.ABERTO;
	}
	
	public Long getRecId() {
		return recId;
	}

	public TipoMovimentoEnum getTipoMovimento() {
		return tipoMovimento;
	}



	public void setTipoMovimento(TipoMovimentoEnum tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
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
