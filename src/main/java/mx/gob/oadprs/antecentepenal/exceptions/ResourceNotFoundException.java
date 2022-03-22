/**
 * ResourceNotFoundException.java Fecha de creación: 14 mar. 2022, 23:47:09 Copyright (c)
 * 2022 XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Getter
@Setter
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * TODO [Agregar documentación del atributo]
	 */
	private static final long serialVersionUID = 1L;

	private String codigo;

	private String mensaje;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public ResourceNotFoundException() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param codigo
	 * @param mensaje
	 */
	public ResourceNotFoundException(String codigo, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param string
	 */
	public ResourceNotFoundException(String mensaje) {
		this.mensaje = mensaje;
	}

}
