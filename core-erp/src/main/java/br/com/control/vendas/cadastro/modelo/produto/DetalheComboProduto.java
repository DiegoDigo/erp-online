package br.com.control.vendas.cadastro.modelo.produto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DetalheComboProduto implements Serializable{
	
	public Long recId;
	public Integer quantidade;
	public Long codigoProdutoCodigo;
	public Long codigoProdutoComboCodigo;
	
	
	public Long getRecId() {
		return recId;
	}
	public void setRecId(Long recId) {
		this.recId = recId;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Long getCodigoProdutoCodigo() {
		return codigoProdutoCodigo;
	}
	public void setCodigoProdutoCodigo(Long codigoProdutoCodigo) {
		this.codigoProdutoCodigo = codigoProdutoCodigo;
	}
	public Long getCodigoProdutoComboCodigo() {
		return codigoProdutoComboCodigo;
	}
	public void setCodigoProdutoComboCodigo(Long codigoProdutoComboCodigo) {
		this.codigoProdutoComboCodigo = codigoProdutoComboCodigo;
	}
	
	
	
	
	
}
