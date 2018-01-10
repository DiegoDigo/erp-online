package br.com.control.vendas.cadastro.modelo.produto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DetalheComboProduto implements Serializable{
	
	public Long recId;
	public Integer quantidadeAvulso;
	public Integer quantidadeCaixa;
	public String ocorrencia;
	public String codigoProdutoERP;
	public String codigoProdutoComboERP;
	 
	public String getOcorrencia() {
		return ocorrencia;
	}
	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	public Long getRecId() {
		return recId;
	}
	public void setRecId(Long recId) {
		this.recId = recId;
	}
	
	public Integer getQuantidadeAvulso() {
		return quantidadeAvulso;
	}
	public void setQuantidadeAvulso(Integer quantidadeAvulso) {
		this.quantidadeAvulso = quantidadeAvulso;
	}
	public Integer getQuantidadeCaixa() {
		return quantidadeCaixa;
	}
	public void setQuantidadeCaixa(Integer quantidadeCaixa) {
		this.quantidadeCaixa = quantidadeCaixa;
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
	
	
	
	
	
	
}
