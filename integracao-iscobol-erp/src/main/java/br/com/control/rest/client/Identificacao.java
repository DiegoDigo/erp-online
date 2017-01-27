package br.com.control.rest.client;

import javax.persistence.Transient;

import br.com.control.portal.enums.CadastrosEnum;

/**
 * @author rasa.lariguet
 *
 *         Classe utilizada para identificar os serviços, deve ser enviado
 *         preenchido em todas as requisições;
 */

public class Identificacao {

	
	private Sistema origem;

	private Sistema destino;

	private String usuarioOrigemServico;
	
	private TipoOperacao tipoOperacao;
	
	private String servicoAcessado;

	private String matriculaAssociada;
	
	private CadastrosEnum cadastroASincronizar;

	
	public CadastrosEnum getCadastroASincronizar() {
		return cadastroASincronizar;
	}

	public void setCadastroASincronizar(CadastrosEnum cadastroASincronizar) {
		this.cadastroASincronizar = cadastroASincronizar;
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

	public String getServicoAcessado() {
		return servicoAcessado;
	}

	public void setServicoAcessado(String servicoAcessado) {
		this.servicoAcessado = servicoAcessado;
	}

	public String getMatriculaAssociada() {
		return matriculaAssociada;
	}

	public void setMatriculaAssociada(String matriculaAssociada) {
		this.matriculaAssociada = matriculaAssociada;
	}

}
