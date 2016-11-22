package br.com.control.vendas.cadastro.modelo.clienteOld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TipoLogradouro {



	@JsonProperty("Alameda")
	AL("AL", "Alameda", "Tipo de logradouro alameda"),

	@JsonProperty("Avenida")
	AV("AV", "Avenida", "Tipo de logradouro avenida"),
	
	@JsonProperty("Beco")
	BC("BC", "Beco", "Tipo de logradouro beco"),

	@JsonProperty("Corredor")
	COR("COR", "Corredor", "Tipo de logradouro corredor"),

	@JsonProperty("Estrada")
	EST("EST", "Estrada", "Tipo de logradouro estrada"),
	
	@JsonProperty("Largo")
	LG("LG", "Largo", "Tipo de logradouro largo"),                    
	                    
	@JsonProperty("Praca")
	PC("PC", "Praca", "Tipo de logradouro praça"),

	@JsonProperty("Rodovia")
	ROD("ROD", "Rodovia", "Tipo de logradouro rodovia"),

	@JsonProperty("Rua")
	RUA("RUA", "Rua", "Tipo de logradouro rua"),
	
	@JsonProperty("Travessa")
	TV("TV", "Travessa", "Tipo de logradouro travessa"),
	
	@JsonProperty("Viaduto")
	VD("VD", "Viaduto", "Tipo de logradouro viaduto"),
	
	@JsonProperty("Via")
	VIA("VIA", "Via", "Tipo de logradouro via"),
	
	@JsonProperty("Viela")
	VIELA("VIELA", "Viela", "Tipo de logradouro viela");                    

	private final String sigla;
	private final String nome;
	private final String descricao;

	private TipoLogradouro(String sigla, String nome, String descricao) {
		this.sigla = sigla;
		this.nome = nome;
		this.descricao = descricao;
	}

	public static List<String> recuperaNomes(){
		List<String> tiposLogradouros = new ArrayList<>();
		for (TipoLogradouro tipoLogradouro : Arrays.asList(TipoLogradouro.values())) {
			tiposLogradouros.add(tipoLogradouro.getNome());
		}
		return tiposLogradouros;
	}
	
	public final String getDescricao(){
		return descricao;
	}

	public String getNome(){
		return nome;
	}

	public String getSigla(){
		return sigla;
	}

	@Override
	public String toString(){
		return this.sigla;
	}
}