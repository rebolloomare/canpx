/**
 * SolicitudService.java Fecha de creación: 2 mar. 2022, 11:28:09 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.services;

import java.util.List;
import mx.gob.oadprs.antecentepenal.dtos.SolicitudDto;
import mx.gob.oadprs.antecentepenal.model.Solicitud;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public interface SolicitudService {

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param solicitud
	 * @return
	 */
	Solicitud registraSolicitud(SolicitudDto solicitud);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param folio
	 * @return
	 */
	Solicitud obtieneSolicitudById(String folio);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<Solicitud> obtieneSolicitudes();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param folio
	 * @return
	 */
	String eliminarSolicitudById(String folio);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param folio
	 * @return
	 */
	Solicitud actualizaSolicitud(Solicitud solicitud);

}
