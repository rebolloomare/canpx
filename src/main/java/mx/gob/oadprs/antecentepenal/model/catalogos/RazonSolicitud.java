/**
 * RazonSolicitud.java Fecha de creación: 10 mar. 2022, 12:54:02 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import mx.gob.oadprs.antecentepenal.dtos.RazonSolicitudDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Entity
@Table(schema = "cat", name = "cat_razon_solicitud")
public class RazonSolicitud {

	@Id
	@Column(name = "idrazon_solicitud")
	private int idRazonSolicitud;

	@Column(length = 160)
	private String razon;

	@Column(name = "idestatus")
	private int idEstatus;

	@Column(name = "idinstituciones_certificadas")
	private UUID idInstitucionesCertificadas;

	@Column(length = 1)
	private char incizo;

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
	 * @param razon
	 * @param idEstatus
	 * @param idInstitucionesCertificadas
	 * @param incizo
	 */
	public RazonSolicitud(int idRazonSolicitud, String razon, int idEstatus,
		UUID idInstitucionesCertificadas, char incizo) {
		super();
		this.idRazonSolicitud = idRazonSolicitud;
		this.razon = razon;
		this.idEstatus = idEstatus;
		this.idInstitucionesCertificadas = idInstitucionesCertificadas;
		this.incizo = incizo;
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idRazonSolicitud
	 * @param razon
	 * @param idEstatus
	 * @param idInstitucionesCertificadas
	 * @param incizo
	 */
	public RazonSolicitud(RazonSolicitudDto razonSolicitudDto) {
		super();
		this.idRazonSolicitud = razonSolicitudDto.getIdRazonSolicitud();
		this.razon = razonSolicitudDto.getRazon();
		this.idEstatus = razonSolicitudDto.getIdEstatus();
		this.idInstitucionesCertificadas = razonSolicitudDto.getIdInstitucionesCertificadas();
		this.incizo = razonSolicitudDto.getIncizo();
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
	 * @return el atributo razon
	 */
	public String getRazon() {
		return razon;
	}

	/**
	 * @param razon parametro razon a actualizar
	 */
	public void setRazon(String razon) {
		this.razon = razon;
	}

	/**
	 * @return el atributo idEstatus
	 */
	public int getIdEstatus() {
		return idEstatus;
	}

	/**
	 * @param idEstatus parametro idEstatus a actualizar
	 */
	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
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
	 * @return el atributo incizo
	 */
	public char getIncizo() {
		return incizo;
	}

	/**
	 * @param incizo parametro incizo a actualizar
	 */
	public void setIncizo(char incizo) {
		this.incizo = incizo;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RazonSolicitud [idRazonSolicitud=")
			.append(idRazonSolicitud)
			.append(", razon=")
			.append(razon)
			.append(", idEstatus=")
			.append(idEstatus)
			.append(", idInstitucionesCertificadas=")
			.append(idInstitucionesCertificadas)
			.append(", incizo=")
			.append(incizo)
			.append("]");
		return builder.toString();
	}

}
