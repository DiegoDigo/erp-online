package br.com.control.portal.mensageria;

import java.io.Serializable;
import java.math.BigDecimal;

public class PedidoItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long recId;
	
	private String codigoMotivoOcorrencia;
	
	private Boolean itemAlteradoBandaPreco = false;
	
	private float percDesconto = 0;
	
	private Boolean permiteAlterarQtdBonificada = false;
	
	private BigDecimal precoUn = BigDecimal.ZERO;
	
	private Integer qtdeAvulsa = 0;
	
	private BigDecimal valorBonificado = BigDecimal.ZERO;
	
	private BigDecimal valorBruto = BigDecimal.ZERO;
	
	private BigDecimal valorDesconto = BigDecimal.ZERO;
	
	private BigDecimal valorLiquido = BigDecimal.ZERO;
	
	private BigDecimal valorVerba = BigDecimal.ZERO;
		
	private BigDecimal precoAvulsoUn = BigDecimal.ZERO;
	
	private Integer qtdeCaixa = 0;

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

	public BigDecimal getPrecoAvulsoUn() {
		return precoAvulsoUn;
	}

	public void setPrecoAvulsoUn(BigDecimal precoAvulsoUn) {
		this.precoAvulsoUn = precoAvulsoUn;
	}

	public Integer getQtdeCaixa() {
		return qtdeCaixa;
	}

	public void setQtdeCaixa(Integer qtdeCaixa) {
		this.qtdeCaixa = qtdeCaixa;
	}
}
