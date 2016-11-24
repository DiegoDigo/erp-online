package br.com.control.vendas.cadastro.modelo.pedido;

import java.io.Serializable;
import java.math.BigDecimal;

@SuppressWarnings("serial")
public class PedidoItem implements Serializable {

	private Long recId;
	private String codigoMotivoOcorrencia;
	private Boolean itemAlteradoBandaPreco;
	private float percDesconto;
	private Boolean permiteAlterarQtdBonificada;
	private BigDecimal precoUn;
	private Integer qtdeAvulsa;
	private Integer qtdeCaixa;
	private BigDecimal valorBonificado;
	private BigDecimal valorBruto;
	private BigDecimal valorDesconto;
	private BigDecimal valorLiquido;
	private BigDecimal valorVerba;
	private Long codigoBandaPrecoRecId;
	private Long codigoOcorrenciaRecId;
	private Long codigoPedidoRecId;
	private Long codigoTabelaPrecoRecId;
	private Long codigoProdutoRecId;
	private Long codigoRestricaoComercialRecId;

	public Long getRecId() {
		return recId;
	}

	public void setRecId(Long recId) {
		this.recId = recId;
	}

	public String getCodigoMotivoOcorrencia() {
		return codigoMotivoOcorrencia;
	}

	public void setCodigoMotivoOcorrencia(String codigoMotivoOcorrencia) {
		this.codigoMotivoOcorrencia = codigoMotivoOcorrencia;
	}

	public Boolean getItemAlteradoBandaPreco() {
		return itemAlteradoBandaPreco;
	}

	public void setItemAlteradoBandaPreco(Boolean itemAlteradoBandaPreco) {
		this.itemAlteradoBandaPreco = itemAlteradoBandaPreco;
	}

	public float getPercDesconto() {
		return percDesconto;
	}

	public void setPercDesconto(float percDesconto) {
		this.percDesconto = percDesconto;
	}

	public Boolean getPermiteAlterarQtdBonificada() {
		return permiteAlterarQtdBonificada;
	}

	public void setPermiteAlterarQtdBonificada(Boolean permiteAlterarQtdBonificada) {
		this.permiteAlterarQtdBonificada = permiteAlterarQtdBonificada;
	}

	public BigDecimal getPrecoUn() {
		return precoUn;
	}

	public void setPrecoUn(BigDecimal precoUn) {
		this.precoUn = precoUn;
	}

	public Integer getQtdeAvulsa() {
		return qtdeAvulsa;
	}

	public void setQtdeAvulsa(Integer qtdeAvulsa) {
		this.qtdeAvulsa = qtdeAvulsa;
	}

	public Integer getQtdeCaixa() {
		return qtdeCaixa;
	}

	public void setQtdeCaixa(Integer qtdeCaixa) {
		this.qtdeCaixa = qtdeCaixa;
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

	public Long getCodigoBandaPrecoRecId() {
		return codigoBandaPrecoRecId;
	}

	public void setCodigoBandaPrecoRecId(Long codigoBandaPrecoRecId) {
		this.codigoBandaPrecoRecId = codigoBandaPrecoRecId;
	}

	public Long getCodigoOcorrenciaRecId() {
		return codigoOcorrenciaRecId;
	}

	public void setCodigoOcorrenciaRecId(Long codigoOcorrenciaRecId) {
		this.codigoOcorrenciaRecId = codigoOcorrenciaRecId;
	}

	public Long getCodigoPedidoRecId() {
		return codigoPedidoRecId;
	}

	public void setCodigoPedidoRecId(Long codigoPedidoRecId) {
		this.codigoPedidoRecId = codigoPedidoRecId;
	}

	public Long getCodigoTabelaPrecoRecId() {
		return codigoTabelaPrecoRecId;
	}

	public void setCodigoTabelaPrecoRecId(Long codigoTabelaPrecoRecId) {
		this.codigoTabelaPrecoRecId = codigoTabelaPrecoRecId;
	}

	public Long getCodigoProdutoRecId() {
		return codigoProdutoRecId;
	}

	public void setCodigoProdutoRecId(Long codigoProdutoRecId) {
		this.codigoProdutoRecId = codigoProdutoRecId;
	}

	public Long getCodigoRestricaoComercialRecId() {
		return codigoRestricaoComercialRecId;
	}

	public void setCodigoRestricaoComercialRecId(Long codigoRestricaoComercialRecId) {
		this.codigoRestricaoComercialRecId = codigoRestricaoComercialRecId;
	}

}
