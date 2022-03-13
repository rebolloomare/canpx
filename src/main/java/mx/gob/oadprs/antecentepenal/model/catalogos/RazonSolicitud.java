/**
 * RazonSolicitud.java Fecha de creación: 10 mar. 2022, 12:54:02 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.dtos.RazonSolicitudDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
@Entity
@Table(schema = "cat", name = "cat_razon_solicitud")
public class RazonSolicitud {

	@Id
	@Column(name = "idrazon_solicitud")
	private int idRazonSolicitud;

	@Column(name = "idestatus")
	private int idEstatus;

	@Column(name = "idinstituciones_certificadas")
	@NotNull
	private int idInstitucionesCertificadas;

	@Column(name = "id_inciso")
	@NotNull
	private int idInciso;

	@Column(name = "motivo_razon", length = 200)
	@NotNull
	private String motivoRazon;

	@Column(length = 1)
	private String incizo;

	@Column(length = 160)
	private String razon;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public RazonSolicitud() {
		super();
	}

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
	public RazonSolicitud(RazonSolicitudDto razonSolicitudDto) {
		super();
		this.idRazonSolicitud = razonSolicitudDto.getIdRazonSolicitud();
		this.idEstatus = razonSolicitudDto.getIdEstatus();
		this.idInstitucionesCertificadas = razonSolicitudDto.getIdInstitucionesCertificadas();
		this.idInciso = razonSolicitudDto.getIdInciso();
		this.motivoRazon = razonSolicitudDto.getMotivoRazon();
		this.incizo = razonSolicitudDto.getIncizo();
		this.razon = razonSolicitudDto.getRazon();
	}

}
