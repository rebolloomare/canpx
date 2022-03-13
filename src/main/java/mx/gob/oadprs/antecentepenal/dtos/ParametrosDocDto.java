/**
 * ParametrosDoc.java Fecha de creación: 10 mar. 2022, 12:51:13 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.catalogos.ParametrosDoc;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
public class ParametrosDocDto {

	private int parametrosDoc;

	private int idTipoResolucion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public ParametrosDocDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param parametrosDoc
	 */
	public ParametrosDocDto(ParametrosDoc parametrosDoc) {
		this.parametrosDoc = parametrosDoc.getParametrosDoc();
		this.idTipoResolucion = parametrosDoc.getIdTipoResolucion();
	}

}
