/**
 * Solicitud.java Fecha de creación: 7 mar. 2022, 23:28:53 Copyright (c) 2022 XXXXXXX Todos
 * los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import mx.gob.oadprs.antecentepenal.dtos.SolicitudDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Entity
@Table(schema = "tx", name = "tx_solicitudes")
public class Solicitud {

	@Id
	@Column(name = "idsolicitud_constancia")
	private UUID uuid;

	@Column(length = 60)
	private String nombres;

	@Column(name = "apellido_paterno", length = 60)
	private String apellidoPaterno;

	@Column(name = "apellido_materno", length = 60)
	private String apellidoMaterno;

	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(length = 20)
	private String curp;

	@Column(name = "fecha_solicitud")
	private Date fechaSolicitud;

	@Column(name = "fecha_confirmacion_pago")
	private Date fechaConfirmacionPago;

	@Column(name = "fecha_descarga_constancia")
	private int fechaDescargaConstancia;

	@Column(name = "ip_solicitud", length = 16)
	private String ipSolicitud;

	@Column(name = "idestatus_solicitud")
	private int idEstatusSolicitud;

	@Column(name = "idrazon_solicitud")
	private int idRazonSolicitud;

	@Column(name = "idinstituciones_certificadas")
	private UUID idInstitucionesCertificadas;

	@Column(name = "folio_seguimiento", length = 20)
	private String folioSeguimiento;

	@Column(name = "correo_electronico", length = 120)
	private String correoElectronico;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public Solicitud() {
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
	public Solicitud(SolicitudDto solicitudDto) {
		super();
		this.uuid = solicitudDto.getUuid();
		this.nombres = solicitudDto.getNombres();
		this.apellidoPaterno = solicitudDto.getApellidoPaterno();
		this.apellidoMaterno = solicitudDto.getApellidoMaterno();
		this.fechaNacimiento = solicitudDto.getFechaNacimiento();
		this.curp = solicitudDto.getCurp();
		this.fechaSolicitud = solicitudDto.getFechaSolicitud();
		this.fechaConfirmacionPago = solicitudDto.getFechaConfirmacionPago();
		this.fechaDescargaConstancia = solicitudDto.getFechaDescargaConstancia();
		this.ipSolicitud = solicitudDto.getIpSolicitud();
		this.idEstatusSolicitud = solicitudDto.getIdEstatusSolicitud();
		this.idRazonSolicitud = solicitudDto.getIdRazonSolicitud();
		this.idInstitucionesCertificadas = solicitudDto.getIdInstitucionesCertificadas();
		this.folioSeguimiento = solicitudDto.getFolioSeguimiento();
		this.correoElectronico = solicitudDto.getCorreoElectronico();
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
	public Solicitud(UUID uuid, String nombres, String apellidoPaterno, String apellidoMaterno,
		Date fechaNacimiento, String curp, Date fechaSolicitud, Date fechaConfirmacionPago,
		int fechaDescargaConstancia, String ipSolicitud, int idEstatusSolicitud,
		int idRazonSolicitud, UUID idInstitucionesCertificadas, String folioSeguimiento,
		String correoElectronico) {
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
		builder.append("Solicitudes [uuid=")
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
