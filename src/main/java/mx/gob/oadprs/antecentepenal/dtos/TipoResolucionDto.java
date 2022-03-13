/**
 * TipoResolucion.java Fecha de creación: 10 mar. 2022, 13:00:18 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.catalogos.TipoResolucion;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
public class TipoResolucionDto {

	private int idTipoResolucion;

	private String tipoResolucion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public TipoResolucionDto() {
		super();
	}

	public TipoResolucionDto(TipoResolucion tipoResolucion) {
		this.idTipoResolucion = tipoResolucion.getIdTipoResolucion();
		this.tipoResolucion = tipoResolucion.getTipoResolucion();
	}

}
