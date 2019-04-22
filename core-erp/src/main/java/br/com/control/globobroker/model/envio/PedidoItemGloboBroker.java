package br.com.control.globobroker.model.envio;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({ "recId", "sequenciaItem", "codigoOcorrencia", "codigoProduto", "quantidadeInteira", "ValorInteiro", "ValorProdutoInteiro",
"quantidadeUnitaria", "Valorunitario", "ValorProdutoUnitario", "valorDesconto", "valorLiquido"})
public class PedidoItemGloboBroker implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("recId")
	private String recId;

	@JsonProperty("sequenciaItem")
	private String sequenciaItem;

	@JsonProperty("codigoOcorrencia")
	private String codigoOcorrencia;

	@JsonProperty("codigoProduto")
	private String codigoProduto;

	@JsonProperty("quantidadeInteira")
	private Integer quantidadeInteira;

	@JsonProperty("ValorInteiro")
	private Double ValorInteiro;

	@JsonProperty("ValorProdutoInteiro")
	private Double ValorProdutoInteiro;

	@JsonProperty("quantidadeUnitaria")
	private Integer quantidadeUnitaria;

	@JsonProperty("Valorunitario")
	private Double Valorunitario;

	@JsonProperty("ValorProdutoUnitario")
	private Double ValorProdutoUnitario;

	@JsonProperty("valorDesconto")
	private Double valorDesconto;

	@JsonProperty("valorLiquido")
	private Double valorLiquido;

	private String tipoDePedido;
	
	@JsonProperty("lotes")
	private List<LoteGloboBroker> lotes;
	
	private String numeroPedidoJcontrol;
	
	public boolean isItemDoPedido(PedidoCapaGloboBroker pedidoCapa) {
		return this.numeroPedidoJcontrol.equals(pedidoCapa.getNumeroPedidoJcontrol());
	}

	public String getRecId() {
		return recId;
	}

	public void setRecId(String recId) {
		this.recId = recId;
	}

	public String getSequenciaItem() {
		return sequenciaItem;
	}

	public void setSequenciaItem(String sequenciaItem) {
		this.sequenciaItem = sequenciaItem;
	}

	public String getCodigoOcorrencia() {
		return codigoOcorrencia;
	}

	public void setCodigoOcorrencia(String codigoOcorrencia) {
		this.codigoOcorrencia = codigoOcorrencia;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public Integer getQuantidadeInteira() {
		return quantidadeInteira;
	}

	public void setQuantidadeInteira(Integer quantidadeInteira) {
		this.quantidadeInteira = quantidadeInteira;
	}

	public Double getValorInteiro() {
		return ValorInteiro;
	}

	public void setValorInteiro(Double valorInteiro) {
		ValorInteiro = valorInteiro;
	}

	public Double getValorProdutoInteiro() {
		return ValorProdutoInteiro;
	}

	public void setValorProdutoInteiro(Double valorProdutoInteiro) {
		ValorProdutoInteiro = valorProdutoInteiro;
	}

	public Integer getQuantidadeUnitaria() {
		return quantidadeUnitaria;
	}

	public void setQuantidadeUnitaria(Integer quantidadeUnitaria) {
		this.quantidadeUnitaria = quantidadeUnitaria;
	}

	public Double getValorunitario() {
		return Valorunitario;
	}

	public void setValorunitario(Double valorunitario) {
		Valorunitario = valorunitario;
	}

	public Double getValorProdutoUnitario() {
		return ValorProdutoUnitario;
	}

	public void setValorProdutoUnitario(Double valorProdutoUnitario) {
		ValorProdutoUnitario = valorProdutoUnitario;
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(Double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public List<LoteGloboBroker> getLotes() {
		return lotes;
	}

	public void setLotes(List<LoteGloboBroker> lotes) {
		this.lotes = lotes;
	}

	public String getNumeroPedidoJcontrol() {
		return numeroPedidoJcontrol;
	}

	public void setNumeroPedidoJcontrol(String numeroPedidoJcontrol) {
		this.numeroPedidoJcontrol = numeroPedidoJcontrol;
	}

	public String getTipoDePedido() {
		return tipoDePedido;
	}

	public void setTipoDePedido(String tipoDePedido) {
		this.tipoDePedido = tipoDePedido;
	}
	
	
}
