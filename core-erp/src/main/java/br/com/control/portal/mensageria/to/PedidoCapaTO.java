package br.com.control.portal.mensageria.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class PedidoCapaTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long recId;

	@SequenciaParametrosProcedure(index = 1)
	private String cliente;
	@SequenciaParametrosProcedure(index = 2)
	private String tipoCobranca;
	@SequenciaParametrosProcedure(index = 3)
	private String condicaoPagamento;
	@SequenciaParametrosProcedure(index = 4)
	private BigDecimal valorDesconto;
	@SequenciaParametrosProcedure(index = 5)
	private float percTaxaFinanc;
	@SequenciaParametrosProcedure(index = 6)
	private String vendedor;
	@SequenciaParametrosProcedure(index = 7)
	private BigDecimal valorLiquido;
	@SequenciaParametrosProcedure(index = 8)
	private int dataVencimento;
	@SequenciaParametrosProcedure(index = 9)
	private int dataEmissao;
	@SequenciaParametrosProcedure(index = 10)
	private int horaEmissao;
	@SequenciaParametrosProcedure(index = 11)
	private String usuario;
	@SequenciaParametrosProcedure(index = 12, isRetornoProcedure = true)
	private long numeroPrePedidoGestao;

	private List<PedidoItemTO> itens = new ArrayList<>();

	public List<PedidoItemTO> getItens() {
		return itens;
	}

	public void setItens(List<PedidoItemTO> itens) {
		this.itens = itens;
	}

	private Long statusPedido;
	private Boolean ativo;
	private Timestamp dataHoraEmissao;
	private Timestamp dataHoraVenciamento;
	private int horaVencimento;
	private Date dataPrimeiraParcela;
	private String observacao;
	private Boolean pedidoAberto;
	private Boolean pedidoBloqueado;
	private Boolean pedidoTransmitido;
	private float percDesconto;
	private Boolean permiteErpAjustarPedido;
	private int qtdeAvulsa;
	private int qtdeCaixa;
	private int tipoEntrega;
	private BigDecimal valorBonificado;
	private BigDecimal valorBruto;
	private BigDecimal valorFinal;
	private BigDecimal valorVerba;

	public Long getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(Long statusPedido) {
		this.statusPedido = statusPedido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Timestamp getDataHoraVenciamento() {
		return dataHoraVenciamento;
	}

	public void setDataHoraVenciamento(Timestamp dataHoraVenciamento) {
		this.dataHoraVenciamento = dataHoraVenciamento;
	}

	public int getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(int dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public int getHoraVencimento() {
		return horaVencimento;
	}

	public void setHoraVencimento(int horaVencimento) {
		this.horaVencimento = horaVencimento;
	}

	public int getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(int dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public int getHoraEmissao() {
		return horaEmissao;
	}

	public void setHoraEmissao(int horaEmissao) {
		this.horaEmissao = horaEmissao;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public long getRecId() {
		return recId;
	}

	public void setRecId(long recId) {
		this.recId = recId;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Timestamp getDataHoraEmissao() {
		return dataHoraEmissao;
	}

	public void setDataHoraEmissao(Timestamp dataHoraEmissao) {
		this.dataHoraEmissao = dataHoraEmissao;
	}

	public Date getDataPrimeiraParcela() {
		return dataPrimeiraParcela;
	}

	public void setDataPrimeiraParcela(Date dataPrimeiraParcela) {
		this.dataPrimeiraParcela = dataPrimeiraParcela;
	}

	public long getNumeroPrePedidoGestao() {
		return numeroPrePedidoGestao;
	}

	public void setNumeroPrePedidoGestao(long numeroPrePedidoGestao) {
		this.numeroPrePedidoGestao = numeroPrePedidoGestao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getPedidoAberto() {
		return pedidoAberto;
	}

	public void setPedidoAberto(Boolean pedidoAberto) {
		this.pedidoAberto = pedidoAberto;
	}

	public Boolean getPedidoBloqueado() {
		return pedidoBloqueado;
	}

	public void setPedidoBloqueado(Boolean pedidoBloqueado) {
		this.pedidoBloqueado = pedidoBloqueado;
	}

	public Boolean getPedidoTransmitido() {
		return pedidoTransmitido;
	}

	public void setPedidoTransmitido(Boolean pedidoTransmitido) {
		this.pedidoTransmitido = pedidoTransmitido;
	}

	public float getPercDesconto() {
		return percDesconto;
	}

	public void setPercDesconto(float percDesconto) {
		this.percDesconto = percDesconto;
	}

	public float getPercTaxaFinanc() {
		return percTaxaFinanc;
	}

	public void setPercTaxaFinanc(float percTaxaFinanc) {
		this.percTaxaFinanc = percTaxaFinanc;
	}

	public Boolean getPermiteErpAjustarPedido() {
		return permiteErpAjustarPedido;
	}

	public void setPermiteErpAjustarPedido(Boolean permiteErpAjustarPedido) {
		this.permiteErpAjustarPedido = permiteErpAjustarPedido;
	}

	public int getQtdeAvulsa() {
		return qtdeAvulsa;
	}

	public void setQtdeAvulsa(int qtdeAvulsa) {
		this.qtdeAvulsa = qtdeAvulsa;
	}

	public int getQtdeCaixa() {
		return qtdeCaixa;
	}

	public void setQtdeCaixa(int qtdeCaixa) {
		this.qtdeCaixa = qtdeCaixa;
	}

	public int getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(int tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	public BigDecimal getValorBonificado() {
		return valorBonificado;
	}

	public void setValorBonificado(BigDecimal valorBonificado) {
		this.valorBonificado = valorBonificado;
	}

	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public BigDecimal getValorVerba() {
		return valorVerba;
	}

	public void setValorVerba(BigDecimal valorVerba) {
		this.valorVerba = valorVerba;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCondicaoPagamento() {
		return condicaoPagamento;
	}

	public void setCondicaoPagamento(String condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}

	public String getTipoCobranca() {
		return tipoCobranca;
	}

	public void setTipoCobranca(String tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
	}

}