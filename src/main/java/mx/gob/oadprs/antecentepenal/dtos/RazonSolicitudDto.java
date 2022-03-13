/**
 * RazonSolicitud.java Fecha de creación: 10 mar. 2022, 12:54:02 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.catalogos.RazonSolicitud;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
public class RazonSolicitudDto {

	private int idRazonSolicitud;

	private int idEstatus;

	private int idInstitucionesCertificadas;

	private int idInciso;

	private String motivoRazon;

	private String incizo;

	private String razon;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idRazonSolicitud
	 * @param idEstatus
	 * @param idInstitucionesCertificadas
	 * @param idInciso
	 * @param motivoRazon
	 * @param incizo
	 * @param razon
	 */
	public RazonSolicitudDto(RazonSolicitud razonSolicitud) {
		super();
		this.idRazonSolicitud = razonSolicitud.getIdRazonSolicitud();
		this.idEstatus = razonSolicitud.getIdEstatus();
		this.idInstitucionesCertificadas = razonSolicitud.getIdInstitucionesCertificadas();
		this.idInciso = razonSolicitud.getIdInciso();
		this.motivoRazon = razonSolicitud.getMotivoRazon();
		this.incizo = razonSolicitud.getIncizo();
		this.razon = razonSolicitud.getRazon();
	}

}
