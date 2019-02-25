package br.com.control.portal.mensageria.to;

import br.com.control.annotation.SequenciaParametrosProcedure;

import java.io.Serializable;
import java.math.BigDecimal;

public class PedidoComodatoItemTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long recId;

	@SequenciaParametrosProcedure(index = 1)
	private int codigoEmpresa;

	@SequenciaParametrosProcedure(index = 2)
	private long numeroPrePedidoGestao;

	@SequenciaParametrosProcedure(index = 3)
	private int sequenciaItem;

	@SequenciaParametrosProcedure(index = 4)
	private int codigoOcorrencia;

	@SequenciaParametrosProcedure(index = 5)
	private long codigoReduzidoProduto;

	@SequenciaParametrosProcedure(index = 6)
	private int quantidadeCaixa;

	@SequenciaParametrosProcedure(index = 7)
	private int quantidadeAvulsa;

	@SequenciaParametrosProcedure(index = 8)
	private int codigoTabelaPreco;

	@SequenciaParametrosProcedure(index = 9)
	private BigDecimal desconto;

	@SequenciaParametrosProcedure(index = 10)
	private BigDecimal valorLiquido;

	@SequenciaParametrosProcedure(index = 11)
	private BigDecimal valorBruto;

	@SequenciaParametrosProcedure(index = 12)
	private BigDecimal precoUnitarioCaixa;

	@SequenciaParametrosProcedure(index = 13)
	private BigDecimal precoUnitarioAvulso;

	@SequenciaParametrosProcedure(index = 14)
	private String ultimoItem;

	@SequenciaParametrosProcedure(index = 15, isRetornoProcedure = true)
	private int statusRetorno;

	@SequenciaParametrosProcedure(index = 16, isRetornoProcedure = true)
	private String msgRetorno;


	public long getRecId() {
		return recId;
	}

	public void setRecId(long recId) {
		this.recId = recId;
	}

	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public long getNumeroPrePedidoGestao() {
		return numeroPrePedidoGestao;
	}

	public void setNumeroPrePedidoGestao(long numeroPrePedidoGestao) {
		this.numeroPrePedidoGestao = numeroPrePedidoGestao;
	}

	public int getSequenciaItem() {
		return sequenciaItem;
	}

	public void setSequenciaItem(int sequenciaItem) {
		this.sequenciaItem = sequenciaItem;
	}

	public int getCodigoOcorrencia() {
		return codigoOcorrencia;
	}

	public void setCodigoOcorrencia(int codigoOcorrencia) {
		this.codigoOcorrencia = codigoOcorrencia;
	}

	public long getCodigoReduzidoProduto() {
		return codigoReduzidoProduto;
	}

	public void setCodigoReduzidoProduto(long codigoReduzidoProduto) {
		this.codigoReduzidoProduto = codigoReduzidoProduto;
	}

	public int getQuantidadeCaixa() {
		return quantidadeCaixa;
	}

	public void setQuantidadeCaixa(int quantidadeCaixa) {
		this.quantidadeCaixa = quantidadeCaixa;
	}

	public int getQuantidadeAvulsa() {
		return quantidadeAvulsa;
	}

	public void setQuantidadeAvulsa(int quantidadeAvulsa) {
		this.quantidadeAvulsa = quantidadeAvulsa;
	}

	public int getCodigoTabelaPreco() {
		return codigoTabelaPreco;
	}

	public void setCodigoTabelaPreco(int codigoTabelaPreco) {
		this.codigoTabelaPreco = codigoTabelaPreco;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	public BigDecimal getPrecoUnitarioCaixa() {
		return precoUnitarioCaixa;
	}

	public void setPrecoUnitarioCaixa(BigDecimal precoUnitarioCaixa) {
		this.precoUnitarioCaixa = precoUnitarioCaixa;
	}

	public BigDecimal getPrecoUnitarioAvulso() {
		return precoUnitarioAvulso;
	}

	public void setPrecoUnitarioAvulso(BigDecimal precoUnitarioAvulso) {
		this.precoUnitarioAvulso = precoUnitarioAvulso;
	}

	public String getUltimoItem() {
		return ultimoItem;
	}

	public void setUltimoItem(String ultimoItem) {
		this.ultimoItem = ultimoItem;
	}

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

	@Override
	public String toString() {
		return "PedidoComodatoItemTO [recId=" + recId + ", codigoEmpresa=" + codigoEmpresa + ", numeroPrePedidoGestao="
				+ numeroPrePedidoGestao + ", sequenciaItem=" + sequenciaItem + ", codigoOcorrencia=" + codigoOcorrencia
				+ ", codigoReduzidoProduto=" + codigoReduzidoProduto + ", quantidadeCaixa=" + quantidadeCaixa
				+ ", quantidadeAvulsa=" + quantidadeAvulsa + ", codigoTabelaPreco=" + codigoTabelaPreco + ", desconto="
				+ desconto + ", valorLiquido=" + valorLiquido + ", valorBruto=" + valorBruto + ", precoUnitarioCaixa="
				+ precoUnitarioCaixa + ", precoUnitarioAvulso=" + precoUnitarioAvulso + ", statusRetorno=" + statusRetorno + ", msgRetorno="
				+ msgRetorno + "]";
	}

	
	
	
}