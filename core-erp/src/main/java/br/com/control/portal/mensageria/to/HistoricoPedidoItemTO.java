package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;

public class HistoricoPedidoItemTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String numeroItemPedido;
	private float precoProduto;
	private float precoItemTotal;
	private Integer quantidadeAvulsa;
	private Integer quantidadeCaixa;
	private String codigoOcorrenciaErp;
	private String codigoPrecoErp;
	private String codigoProdutoErp;
	private String historicoPedidoCapaErp;
	private String descricaoProduto;
	private String descricaoOcorrencia;
	
	public float getPrecoItemTotal() {
		return precoItemTotal;
	}

	public void setPrecoItemTotal(float precoItemTotal) {
		this.precoItemTotal = precoItemTotal;
	}

	public String getNumeroItemPedido() {
		return numeroItemPedido;
	}

	public void setNumeroItemPedido(String numeroItemPedido) {
		this.numeroItemPedido = numeroItemPedido;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Integer getQuantidadeAvulsa() {
		return quantidadeAvulsa;
	}

	public void setQuantidadeAvulsa(Integer quantidadeAvulsa) {
		this.quantidadeAvulsa = quantidadeAvulsa;
	}

	public Integer getQuantidadeCaixa() {
		return quantidadeCaixa;
	}

	public void setQuantidadeCaixa(Integer quantidadeCaixa) {
		this.quantidadeCaixa = quantidadeCaixa;
	}

	

	public String getCodigoOcorrenciaErp() {
		return codigoOcorrenciaErp;
	}

	public void setCodigoOcorrenciaErp(String codigoOcorrenciaErp) {
		this.codigoOcorrenciaErp = codigoOcorrenciaErp;
	}

	public String getCodigoPrecoErp() {
		return codigoPrecoErp;
	}

	public void setCodigoPrecoErp(String codigoPrecoErp) {
		this.codigoPrecoErp = codigoPrecoErp;
	}

	public String getCodigoProdutoErp() {
		return codigoProdutoErp;
	}

	public void setCodigoProdutoErp(String codigoProdutoErp) {
		this.codigoProdutoErp = codigoProdutoErp;
	}

	public String getHistoricoPedidoCapaErp() {
		return historicoPedidoCapaErp;
	}

	public void setHistoricoPedidoCapaErp(String historicoPedidoCapaErp) {
		this.historicoPedidoCapaErp = historicoPedidoCapaErp;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getDescricaoOcorrencia() {
		return descricaoOcorrencia;
	}

	public void setDescricaoOcorrencia(String descricaoOcorrencia) {
		this.descricaoOcorrencia = descricaoOcorrencia;
	}

	public HistoricoPedidoItemTO(HistoricoPedidoItem historicoPedidoItem) {
		this.numeroItemPedido = historicoPedidoItem.getNumeroItemPedido();
		this.quantidadeAvulsa = historicoPedidoItem.getQuantidadeAvulsa();
		this.quantidadeCaixa = historicoPedidoItem.getQuantidadeCaixa();
		this.codigoOcorrenciaErp = historicoPedidoItem.getCodigoOcorrenciaErp();
		this.codigoPrecoErp = historicoPedidoItem.getCodigoPrecoErp();
		this.codigoProdutoErp = historicoPedidoItem.getCodigoProdutoErp();
		this.precoItemTotal = historicoPedidoItem.getPrecoItemTotal();
		this.historicoPedidoCapaErp = historicoPedidoItem.getHistoricoPedidoCapaErp();
		this.descricaoOcorrencia = historicoPedidoItem.getDescricaoOcorrencia();
		this.descricaoProduto = historicoPedidoItem.getDescricaoProduto();
	}
}
