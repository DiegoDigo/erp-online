package br.com.control.globobroker.model.envio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoteGloboBroker {
	
	@JsonProperty("numeroLote")
	private String numero;
	@JsonProperty("qtde")
	private String quantidade;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
}
