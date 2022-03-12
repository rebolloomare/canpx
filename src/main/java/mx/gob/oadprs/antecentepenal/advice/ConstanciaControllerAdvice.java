/**
 * ConstanciaControllerAdvice.java Fecha de creación: 9 mar. 2022, 17:33:09 Copyright (c)
 * 2022 XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.advice;

import java.util.NoSuchElementException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import mx.gob.oadprs.antecentepenal.exceptions.EmptyInputException;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@ControllerAdvice
public class ConstanciaControllerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException) {
		return new ResponseEntity<String>("Datos vacíos, favor de revisar",
			HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(
		NoSuchElementException noSuchElementException) {
		return new ResponseEntity<String>(
			"No existen valores en Base de Datos con este criterio", HttpStatus.NOT_FOUND);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
	 * #handleHttpRequestMethodNotSupported(org.springframework.web.
	 * HttpRequestMethodNotSupportedException, org.springframework.http.HttpHeaders,
	 * org.springframework.http.HttpStatus,
	 * org.springframework.web.context.request.WebRequest)
	 */
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(
		HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status,
		WebRequest request) {
		return new ResponseEntity<Object>("Favor de cambiar el método HTTP de tu petición",
			HttpStatus.METHOD_NOT_ALLOWED);
	}

}
