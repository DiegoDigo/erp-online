package br.com.control.autenticacao.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Classe que captura exceções tratando-as a partir da sua identificação,
 * retornando uma mensagem de erro padrão para cada tipo específico de problema.
 */
@ControllerAdvice
public class ExceptionHandlerRest extends ResponseEntityExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerRest.class);

	@ExceptionHandler(value = { RuntimeException.class, })
	protected ResponseEntity<Object> handleConflict(RuntimeException ex, HttpServletRequest request) {
		logger.error("RuntimeException", ex);
		return new ErrorMessageData(ex, //
				HttpStatus.INTERNAL_SERVER_ERROR, //
				"Erro de execucao", //
				request.getRequestURI()).getResponseEntity();
	}

	@ExceptionHandler(value = { IdentificacaoException.class, })
	protected ResponseEntity<Object> handleConflict(UnsatisfiedServletRequestParameterException ex, HttpServletRequest request) {
		logger.error("Identificação Inválida");
		return new ErrorMessageData(ex, HttpStatus.NOT_ACCEPTABLE, "Erro na Identificação", //
				request.getRequestURI()).getResponseEntity();
	}

}
