package br.com.control.portal.integracao;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;

import br.com.control.portal.enums.CadastrosEnum;

/**
 * @author rasa.lariguet
 *
 *         Classe utilizada para identificar os serviços, deve ser enviado
 *         preenchido em todas as requisições;
 */
@Embeddable
public class Identificacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Enumerated(EnumType.STRING)
	private Sistema origem;

	@Enumerated(EnumType.STRING)
	private Sistema destino;

	private String usuarioOrigemServico;

	private Integer codigoEmpresa;

	@Enumerated(EnumType.STRING)
	private TipoOperacao tipoOperacao;

	private String servicoAcessado;

	private String matriculaAssociada;

	@Transient
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

	public String getUsuarioOrigemServico() {
		return usuarioOrigemServico;
	}

	public void setUsuarioOrigemServico(String usuarioOrigemServico) {
		this.usuarioOrigemServico = usuarioOrigemServico;
	}

	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
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

	public Integer getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(Integer codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
}
