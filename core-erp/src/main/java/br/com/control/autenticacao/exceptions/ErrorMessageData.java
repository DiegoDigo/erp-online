package br.com.control.autenticacao.exceptions;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Classe que representa o objeto de retorno após a captura de uma exception.
 */
public class ErrorMessageData {

	private static final Logger LOG = Logger.getLogger(ErrorMessageData.class);

	private String timestamp = String.valueOf(new Date().getTime());
	private HttpStatus httpStatus;
	private String status;
	private String exception;
	private String path;
	private String error;
	private String message = "No Avaliable message";
	private StringBuilder description = new StringBuilder();

	public ErrorMessageData(Exception ex, HttpStatus httpStatus, String error, String path, String...descriptions) {
		this.exception = getErrorCode(ex);
		this.error = error;
		this.httpStatus = httpStatus;
		this.path = path;
		this.status = String.valueOf(httpStatus.value());
		if (HttpStatus.FORBIDDEN.value() != httpStatus.value()) {
			for (String d : descriptions) {
				this.description.append(d);
			}
		}
	}
	
	public ErrorMessageData(Exception ex, HttpStatus httpStatus, String error, String path, String message, String ...descriptions) {
		this.exception = getErrorCode(ex);
		this.error = error;
		this.httpStatus = httpStatus;
		this.message = message;
		this.path = path;
		this.status = String.valueOf(httpStatus.value());
		if (HttpStatus.FORBIDDEN.value() != httpStatus.value()) {			
			for (String d : descriptions) {
				this.description.append(d);
			}
		}
	}

	public ErrorMessageData(Throwable th, HttpStatus httpStatus, String error, String path, String...descriptions) {
		this.exception = getErrorCode(th);
		this.error = error;
		this.httpStatus = httpStatus;
		this.path = path;
		this.status = String.valueOf(httpStatus.value());
		for (String d : descriptions) {
			this.description.append(d);
		}
	}

	public ErrorMessageData(Throwable th, HttpStatus httpStatus, String error, String path, String message, String...descriptions) {
		this.exception = getErrorCode(th);
		this.error = error;
		this.httpStatus = httpStatus;
		this.path = path;
		this.message = message;
		this.status = String.valueOf(httpStatus.value());
		for (String d : descriptions) {
			this.description.append(d);
		}
	}


	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public StringBuilder getDescription() {
		return description;
	}

	public void setDescription(StringBuilder description) {
		this.description = description;
	}

	/**
	 * Recupera letras maiúsculas de uma string.
	 * 
	 * @param s string da qual as letras maiúsculas seram recuperadas.
	 * @return letras maiusculas recuperadas.
	 */
	private static StringBuilder getUpperLetters(String s) {
		StringBuilder code = new StringBuilder();
		for (byte b : s.getBytes()) {
			if (Character.isUpperCase((char) b)) {
				code.append((char) b);
			}
		}
		return code;
	}
	
	protected ResponseEntity<Object> getResponseEntity() {
		return new ResponseEntity<Object>(this, this.httpStatus);
	}

	/**
	 * Recupera a exception e a transforma em um código identificavel aos desenvolvedores mas não ao cliente, 
	 * de forma a não exibir o erro diretamente ao cliente, mas deixar uma dica do que pode estar ocorrendo.
	 * 
	 * Este código de retorno segue o padrão:
	 * <pre>
	 * (Letras maiusculas Exception)-(LetrasMaiusculas do Nome da classe):(Número da linha do arquivo onde ocorreu a exeção)
	 * </pre>
	 * 
	 * Por exemplo, se ocorrer um NullPointerException o arquivo UserController na linha 32 o código de erro de retorno será (NPE-UC:32).
	 * 
	 * @param ex Exception ocorrida
	 * @return código que representa a exception seguindo o padrão: (Letras maiusculas Exception)-(LetrasMaiusculas do Nome da classe):(Número da linha do arquivo onde ocorreu a exeção).
	 */
	private static String getErrorCode(Exception ex) {
		StringBuilder code = new StringBuilder();
		LOG.info(ex.getClass().getName());
		
		if (ex.getStackTrace().length > 0) {
			
			
			int i = 0;
			StackTraceElement stack = null; 
			do {
				stack = ex.getStackTrace()[i];
				code.setLength(0);
				code.append(getUpperLetters(ex.getClass().getName()));		
				code.append("-");
				code.append(getUpperLetters(stack.getClassName().substring(stack.getClassName().lastIndexOf('.'))));
				code.append(":");
				code.append(stack.getLineNumber());
				i++;
			} while(stack.getLineNumber() == -1 && i < 10);
		}
		return code.toString();
	}

	private static String getErrorCode(Throwable th) {
		StringBuilder code = new StringBuilder();
		LOG.info(th.getClass().getName());
		code.append(getUpperLetters(th.getClass().getName()));

		if (th.getStackTrace().length > 0) {
			StackTraceElement stack = th.getStackTrace()[0];
			code.append("-");
			code.append(getUpperLetters(stack.getClassName().substring(stack.getClassName().lastIndexOf('.'))));
			code.append(":");
			code.append(stack.getLineNumber());
		}
		return code.toString();
	}

}
