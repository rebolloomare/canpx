/**
 * EstatusResolucion.java Fecha de creación: 10 mar. 2022, 12:26:01 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.catalogos.EstatusResolucion;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
public class EstatusResolucionDto {

	private int idEstatusResolucion;

	private String estatusResolucion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public EstatusResolucionDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public EstatusResolucionDto(EstatusResolucion estatusResolucion) {
		super();
		this.idEstatusResolucion = estatusResolucion.getIdEstatusResolucion();
		this.estatusResolucion = estatusResolucion.getEstatusResolucion();
	}

}
