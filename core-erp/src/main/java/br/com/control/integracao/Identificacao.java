package br.com.control.integracao;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.control.autenticacao.modelo.Sistema;

/**
 * @author rasa.lariguet
 *
 *         Classe utilizada para identificar os serviços, deve ser enviado
 *         preenchido em todas as requisições;
 */
@Embeddable
public class Identificacao {

	@Enumerated(EnumType.STRING)
	private Sistema origem;

	@Enumerated(EnumType.STRING)
	private Sistema destino;

	private String usuarioOrigemServico;

	@Enumerated(EnumType.STRING)
	private TipoOperacao tipoOperacao;
	
	private String servicoAcessado;

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

	public String getServicoAcessado() {
		return servicoAcessado;
	}

	public void setServicoAcessado(String servicoAcessado) {
		this.servicoAcessado = servicoAcessado;
	}

}
