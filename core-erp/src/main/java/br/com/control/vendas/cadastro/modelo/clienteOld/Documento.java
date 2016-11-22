package br.com.control.vendas.cadastro.modelo.clienteOld;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Documento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TipoDocumento tipoDocumento;
	
	private String valorDocumento;
	
	@ManyToOne
	private Cliente cliente;
	
	@Enumerated(EnumType.STRING)
	private Estado orgaoEmissor;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getValorDocumento() {
		return valorDocumento;
	}

	public void setValorDocumento(String valorDocumento) {
		this.valorDocumento = valorDocumento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Estado getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(Estado orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

}
