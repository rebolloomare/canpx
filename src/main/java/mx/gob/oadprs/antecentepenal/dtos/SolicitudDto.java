/**
 * SolicitudDto.java Fecha de creación: 4 mar. 2022, 23:54:06 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import java.util.Date;
import java.util.UUID;
import mx.gob.oadprs.antecentepenal.model.Solicitud;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
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
	public SolicitudDto(UUID uuid, String nombres, String apellidoPaterno,
		String apellidoMaterno, Date fechaNacimiento, String curp, Date fechaSolicitud,
		Date fechaConfirmacionPago, int fechaDescargaConstancia, String ipSolicitud,
		int idEstatusSolicitud, int idRazonSolicitud, UUID idInstitucionesCertificadas,
		String folioSeguimiento, String correoElectronico) {
		super();
		this.uuid = uuid;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.curp = curp;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaConfirmacionPago = fechaConfirmacionPago;
		this.fechaDescargaConstancia = fechaDescargaConstancia;
		this.ipSolicitud = ipSolicitud;
		this.idEstatusSolicitud = idEstatusSolicitud;
		this.idRazonSolicitud = idRazonSolicitud;
		this.idInstitucionesCertificadas = idInstitucionesCertificadas;
		this.folioSeguimiento = folioSeguimiento;
		this.correoElectronico = correoElectronico;
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

	/**
	 * @return el atributo uuid
	 */
	public UUID getUuid() {
		return uuid;
	}

	/**
	 * @param uuid parametro uuid a actualizar
	 */
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return el atributo nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres parametro nombres a actualizar
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return el atributo apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * @param apellidoPaterno parametro apellidoPaterno a actualizar
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * @return el atributo apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * @param apellidoMaterno parametro apellidoMaterno a actualizar
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * @return el atributo fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento parametro fechaNacimiento a actualizar
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return el atributo curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * @param curp parametro curp a actualizar
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}

	/**
	 * @return el atributo fechaSolicitud
	 */
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	/**
	 * @param fechaSolicitud parametro fechaSolicitud a actualizar
	 */
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	/**
	 * @return el atributo fechaConfirmacionPago
	 */
	public Date getFechaConfirmacionPago() {
		return fechaConfirmacionPago;
	}

	/**
	 * @param fechaConfirmacionPago parametro fechaConfirmacionPago a actualizar
	 */
	public void setFechaConfirmacionPago(Date fechaConfirmacionPago) {
		this.fechaConfirmacionPago = fechaConfirmacionPago;
	}

	/**
	 * @return el atributo fechaDescargaConstancia
	 */
	public int getFechaDescargaConstancia() {
		return fechaDescargaConstancia;
	}

	/**
	 * @param fechaDescargaConstancia parametro fechaDescargaConstancia a actualizar
	 */
	public void setFechaDescargaConstancia(int fechaDescargaConstancia) {
		this.fechaDescargaConstancia = fechaDescargaConstancia;
	}

	/**
	 * @return el atributo ipSolicitud
	 */
	public String getIpSolicitud() {
		return ipSolicitud;
	}

	/**
	 * @param ipSolicitud parametro ipSolicitud a actualizar
	 */
	public void setIpSolicitud(String ipSolicitud) {
		this.ipSolicitud = ipSolicitud;
	}

	/**
	 * @return el atributo idEstatusSolicitud
	 */
	public int getIdEstatusSolicitud() {
		return idEstatusSolicitud;
	}

	/**
	 * @param idEstatusSolicitud parametro idEstatusSolicitud a actualizar
	 */
	public void setIdEstatusSolicitud(int idEstatusSolicitud) {
		this.idEstatusSolicitud = idEstatusSolicitud;
	}

	/**
	 * @return el atributo idRazonSolicitud
	 */
	public int getIdRazonSolicitud() {
		return idRazonSolicitud;
	}

	/**
	 * @param idRazonSolicitud parametro idRazonSolicitud a actualizar
	 */
	public void setIdRazonSolicitud(int idRazonSolicitud) {
		this.idRazonSolicitud = idRazonSolicitud;
	}

	/**
	 * @return el atributo idInstitucionesCertificadas
	 */
	public UUID getIdInstitucionesCertificadas() {
		return idInstitucionesCertificadas;
	}

	/**
	 * @param idInstitucionesCertificadas parametro idInstitucionesCertificadas a
	 *        actualizar
	 */
	public void setIdInstitucionesCertificadas(UUID idInstitucionesCertificadas) {
		this.idInstitucionesCertificadas = idInstitucionesCertificadas;
	}

	/**
	 * @return el atributo folioSeguimiento
	 */
	public String getFolioSeguimiento() {
		return folioSeguimiento;
	}

	/**
	 * @param folioSeguimiento parametro folioSeguimiento a actualizar
	 */
	public void setFolioSeguimiento(String folioSeguimiento) {
		this.folioSeguimiento = folioSeguimiento;
	}

	/**
	 * @return el atributo correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @param correoElectronico parametro correoElectronico a actualizar
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SolicitudDto [uuid=")
			.append(uuid)
			.append(", nombres=")
			.append(nombres)
			.append(", apellidoPaterno=")
			.append(apellidoPaterno)
			.append(", apellidoMaterno=")
			.append(apellidoMaterno)
			.append(", fechaNacimiento=")
			.append(fechaNacimiento)
			.append(", curp=")
			.append(curp)
			.append(", fechaSolicitud=")
			.append(fechaSolicitud)
			.append(", fechaConfirmacionPago=")
			.append(fechaConfirmacionPago)
			.append(", fechaDescargaConstancia=")
			.append(fechaDescargaConstancia)
			.append(", ipSolicitud=")
			.append(ipSolicitud)
			.append(", idEstatusSolicitud=")
			.append(idEstatusSolicitud)
			.append(", idRazonSolicitud=")
			.append(idRazonSolicitud)
			.append(", idInstitucionesCertificadas=")
			.append(idInstitucionesCertificadas)
			.append(", folioSeguimiento=")
			.append(folioSeguimiento)
			.append(", correoElectronico=")
			.append(correoElectronico)
			.append("]");
		return builder.toString();
	}

}
