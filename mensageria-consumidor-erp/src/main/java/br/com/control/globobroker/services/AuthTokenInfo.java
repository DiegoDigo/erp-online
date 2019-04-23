package br.com.control.globobroker.services;

import java.io.Serializable;

public class AuthTokenInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String success;
    private String token;
    private String validadeToken;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getValidadeToken() {
        return validadeToken;
    }

    public void setValidadeToken(String validadeToken) {
        this.validadeToken = validadeToken;
    }
}
