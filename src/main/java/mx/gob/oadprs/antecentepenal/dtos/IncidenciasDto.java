/**
 * Incidencias.java Fecha de creación: 10 mar. 2022, 12:41:20 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.catalogos.Incidencias;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
public class IncidenciasDto {

	private int idIncidencia;

	private String incidencia;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public IncidenciasDto() {
		super();
	}

	public IncidenciasDto(Incidencias incidencias) {
		this.idIncidencia = incidencias.getIdIncidencia();
		this.incidencia = incidencias.getIncidencia();
	}

}
