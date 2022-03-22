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
import javax.validation.constraints.Email;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.dtos.SolicitudDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
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
	@Email
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

}
