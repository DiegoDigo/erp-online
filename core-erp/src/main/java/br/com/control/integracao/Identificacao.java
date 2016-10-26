package br.com.control.integracao;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.control.autenticacao.modelo.Sistema;

/**
 * @author rasa.lariguet
 *
 *         Classe utilizada para identificar os serviços, deve ser enviado
 *         preenchido em todas as requisições;
 */
@Entity
public class Identificacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Sistema origem;

	private Sistema destino;

	private String usuarioOrigemServico;

	@Enumerated(EnumType.STRING)
	private TipoOperacao tipoOperacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Sistema getOrigem() {
		return origem;
	}

	public void setOrigem(Sistema origem) {
		this.origem = origem;
	}

	public Sistema getDestino() {
		return destino;
	}

	public void setDestino(Sistema destino) {
		this.destino = destino;
	}

	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public String getUsuarioOrigemServico() {
		return usuarioOrigemServico;
	}

	public void setUsuarioOrigemServico(String usuarioOrigemServico) {
		this.usuarioOrigemServico = usuarioOrigemServico;
	}

}
