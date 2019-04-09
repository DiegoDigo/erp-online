package br.com.control.globobroker.model.envio;

import java.io.Serializable;

public class RespostaErpTerceiroTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean sucess;
	private String message;

	public Boolean getStatus() {
		return sucess;
	}

	public String getMessage() {
		return message;
	}

	public Boolean getSucess() {
		return sucess;
	}

	public void setSucess(Boolean sucess) {
		this.sucess = sucess;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RespostaErpTerceiroTO() {

	}

	public RespostaErpTerceiroTO(Boolean _sucess, String _message) {
		this.message = _message;
		this.sucess = _sucess;
	}
}
