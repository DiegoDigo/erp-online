package br.com.control.vendas.cadastro.modelo.cliente;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Documento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TipoDocumento tipoDocumento;
	
	private String valorDocumento;
	
	@Enumerated(EnumType.STRING)
	private Estado orgaoEmissor;

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
