package br.com.control.portal.mensageria.to;

import java.io.Serializable;

import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;


public class DetalheComboProdutoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer quantidadeCaixa;
	private Integer quantidadeAvulso;
	private String ocorrencia;
	public String codigoProdutoERP;
	public String codigoProdutoComboERP;

	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public String getCodigoProdutoERP() {
		return codigoProdutoERP;
	}

	public void setCodigoProdutoERP(String codigoProdutoERP) {
		this.codigoProdutoERP = codigoProdutoERP;
	}

	public String getCodigoProdutoComboERP() {
		return codigoProdutoComboERP;
	}

	public void setCodigoProdutoComboERP(String codigoProdutoComboERP) {
		this.codigoProdutoComboERP = codigoProdutoComboERP;
	}	


	public Integer getQuantidadeCaixa() {
		return quantidadeCaixa;
	}

	public void setQuantidadeCaixa(Integer quantidadeCaixa) {
		this.quantidadeCaixa = quantidadeCaixa;
	}

	public Integer getQuantidadeAvulso() {
		return quantidadeAvulso;
	}

	public void setQuantidadeAvulso(Integer quantidadeAvulso) {
		this.quantidadeAvulso = quantidadeAvulso;
	}

	
	
	
	public DetalheComboProdutoTO() {
	}

	public DetalheComboProdutoTO(DetalheComboProduto combo) {
		this.quantidadeCaixa = combo.getQuantidadeCaixa();
		this.quantidadeAvulso = combo.getQuantidadeAvulso();
		this.codigoProdutoComboERP = combo.getCodigoProdutoComboERP();
		this.codigoProdutoERP = combo.getCodigoProdutoERP();
		this.ocorrencia = combo.getOcorrencia();
	}

}