package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.sql.Timestamp;

import br.com.control.vendas.cadastro.modelo.MovimentoFinanceiro;


public class MovimentoFinanceiroTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long recId;
	private Timestamp dataOperacao;
	private Timestamp dataVencimento;
	private String mod;
	private String numeroDocumento;
	private String tipoRegistro;
	private String codigoClienteERP;
	private String codigoProdutoERP;
	private String numeroPedido;
	private float valor;

	
	
	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
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

	public String getCodigoClienteERP() {
		return codigoClienteERP;
	}

	public void setCodigoClienteERP(String codigoClienteERP) {
		this.codigoClienteERP = codigoClienteERP;
	}

	public String getCodigoProdutoERP() {
		return codigoProdutoERP;
	}

	public void setCodigoProdutoERP(String codigoProdutoERP) {
		this.codigoProdutoERP = codigoProdutoERP;
	}

	public MovimentoFinanceiroTO() {

	}

	public MovimentoFinanceiroTO(MovimentoFinanceiro movimentoFinanceiro) {
		super();
		this.codigoClienteERP = movimentoFinanceiro.getCodigoClienteERP();
		this.codigoProdutoERP = movimentoFinanceiro.getCodigoProdutoERP();
		this.dataOperacao = movimentoFinanceiro.getDataOperacao();
		this.dataVencimento = movimentoFinanceiro.getDataVencimento();
		this.mod = movimentoFinanceiro.getMod();
		this.numeroDocumento = movimentoFinanceiro.getNumeroDocumento();
		this.tipoRegistro = movimentoFinanceiro.getTipoRegistro();
		this.valor = movimentoFinanceiro.getValor();
		this.numeroPedido = movimentoFinanceiro.getNumeroPedido();
	}

}
