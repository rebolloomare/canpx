/**
 * EstatusSolicitud.java Fecha de creación: 10 mar. 2022, 12:37:35 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.catalogos.EstatusSolicitud;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
public class EstatusSolicitudDto {

	private int idEstatusSolicitud;

	private String estatusSolicitud;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public EstatusSolicitudDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public EstatusSolicitudDto(EstatusSolicitud estatusSolicitud) {
		super();
		this.idEstatusSolicitud = estatusSolicitud.getIdEstatusSolicitud();
		this.estatusSolicitud = estatusSolicitud.getEstatusSolicitud();
	}

}
