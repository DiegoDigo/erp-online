package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class PedidoItemTO implements Serializable {
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
	private String combo;

	@SequenciaParametrosProcedure(index = 15)
	private int CARGA;
	@SequenciaParametrosProcedure(index = 16)
	private String ACAOMERCADO;
	@SequenciaParametrosProcedure(index = 17)
	private String TPVENDA;
	@SequenciaParametrosProcedure(index = 18)
	private String TIPO_RECOLHE;
	@SequenciaParametrosProcedure(index = 19)
	private String MOTIVO;
	@SequenciaParametrosProcedure(index = 20)
	private String FLAGDEV;
	@SequenciaParametrosProcedure(index = 21)
	private int NUMFAT;
	@SequenciaParametrosProcedure(index = 22)
	private String SERIE;
	@SequenciaParametrosProcedure(index = 23)
	private BigDecimal VALORDESC1;
	@SequenciaParametrosProcedure(index = 24)
	private BigDecimal VALORVERBA1;
	@SequenciaParametrosProcedure(index = 25)
	private BigDecimal VALORBON1;
	@SequenciaParametrosProcedure(index = 26)
	private String NUM_ATV_CEV;
	@SequenciaParametrosProcedure(index = 27)
	private int FLAG_BANDA;
	@SequenciaParametrosProcedure(index = 28)
	private int FLAG_ACAOMERC;
	@SequenciaParametrosProcedure(index = 29)
	private String VENALTBONI;
	@SequenciaParametrosProcedure(index = 30)
	private int ACAO_QTD_AUTO;
	@SequenciaParametrosProcedure(index = 31)
	private BigDecimal BONUS_GERADO;
	@SequenciaParametrosProcedure(index = 32)
	private BigDecimal BONUS_UTILIZADO;
	@SequenciaParametrosProcedure(index = 33)
	private int FAIXA_BANDA_ORIG;
	@SequenciaParametrosProcedure(index = 34)
	private BigDecimal VALOR_IMPBARREIR;
	@SequenciaParametrosProcedure(index = 35)
	private int PERFILTAB;
	@SequenciaParametrosProcedure(index = 36)
	private BigDecimal VAL_VERBA_UTILIZA;
	@SequenciaParametrosProcedure(index = 37)
	private int COD_VERBA_GERADA;
	@SequenciaParametrosProcedure(index = 38)
	private String APLICOU_VERBA;
	@SequenciaParametrosProcedure(index = 39)
	private int HORI;

	@SequenciaParametrosProcedure(index = 40, isRetornoProcedure = true)
	private int statusRetorno;

	@SequenciaParametrosProcedure(index = 41, isRetornoProcedure = true)
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

	public String getCombo() {
		return combo;
	}

	public void setCombo(String combo) {
		this.combo = combo;
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

}