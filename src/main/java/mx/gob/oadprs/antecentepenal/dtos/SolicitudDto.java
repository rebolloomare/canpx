/**
 * SolicitudDto.java Fecha de creación: 4 mar. 2022, 23:54:06 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import java.util.Date;
import java.util.UUID;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.Solicitud;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
public class SolicitudDto {

	private UUID uuid;

	private String nombres;

	private String apellidoPaterno;

	private String apellidoMaterno;

	private Date fechaNacimiento;

	private String curp;

	private Date fechaSolicitud;

	private Date fechaConfirmacionPago;

	private int fechaDescargaConstancia;

	private String ipSolicitud;

	private int idEstatusSolicitud;

	private int idRazonSolicitud;

	private UUID idInstitucionesCertificadas;

	private String folioSeguimiento;

	private String correoElectronico;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public SolicitudDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param uuid
	 * @param nombres
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 * @param fechaNacimiento
	 * @param curp
	 * @param fechaSolicitud
	 * @param fechaConfirmacionPago
	 * @param fechaDescargaConstancia
	 * @param ipSolicitud
	 * @param idEstatusSolicitud
	 * @param idRazonSolicitud
	 * @param idInstitucionesCertificadas
	 * @param folioSeguimiento
	 * @param correoElectronico
	 */
	public SolicitudDto(Solicitud solicitud) {
		super();
		this.uuid = solicitud.getUuid();
		this.nombres = solicitud.getNombres();
		this.apellidoPaterno = solicitud.getApellidoPaterno();
		this.apellidoMaterno = solicitud.getApellidoMaterno();
		this.fechaNacimiento = solicitud.getFechaNacimiento();
		this.curp = solicitud.getCurp();
		this.fechaSolicitud = solicitud.getFechaSolicitud();
		this.fechaConfirmacionPago = solicitud.getFechaConfirmacionPago();
		this.fechaDescargaConstancia = solicitud.getFechaDescargaConstancia();
		this.ipSolicitud = solicitud.getIpSolicitud();
		this.idEstatusSolicitud = solicitud.getIdEstatusSolicitud();
		this.idRazonSolicitud = solicitud.getIdRazonSolicitud();
		this.idInstitucionesCertificadas = solicitud.getIdInstitucionesCertificadas();
		this.folioSeguimiento = solicitud.getFolioSeguimiento();
		this.correoElectronico = solicitud.getCorreoElectronico();
	}

}
