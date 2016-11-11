package br.com.control.portal.mensageria;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public Pessoa(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	private int id;
	private String nome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}
}
