package br.com.control.globobroker.model.envio;

import java.io.Serializable;

import br.com.control.annotation.SequenciaParametrosProcedure;

public class ConfirmarEnvioErpTerceiroTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@SequenciaParametrosProcedure(index = 1)
	private long numeroPedidoJcontrol;

	@SequenciaParametrosProcedure(index = 2)
	private String numeroPedidoErpTerc;

	@SequenciaParametrosProcedure(index = 3)
	private String mensagemErro;

	@SequenciaParametrosProcedure(index = 4, isRetornoProcedure = true)
	private int statusRetorno = 0;

	@SequenciaParametrosProcedure(index = 5, isRetornoProcedure = true)
	private String msgRetorno = "";

	public long getNumeroPedidoJcontrol() {
		return numeroPedidoJcontrol;
	}

	public void setNumeroPedidoJcontrol(long numeroPedidoJcontrol) {
		this.numeroPedidoJcontrol = numeroPedidoJcontrol;
	}

	public String getNumeroPedidoErpTerc() {
		return numeroPedidoErpTerc;
	}

	public void setNumeroPedidoErpTerc(String numeroPedidoErpTerc) {
		this.numeroPedidoErpTerc = numeroPedidoErpTerc;
	}

	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	public int getStatusRetorno() {
		return statusRetorno;
	}

	public void setStatusRetorno(int statusRetorno) {
		this.statusRetorno = statusRetorno;
	}

	public String getMsgRetorno() {
		return msgRetorno;
	}

	public void setMsgRetorno(String msgRetorno) {
		this.msgRetorno = msgRetorno;
	}

}
