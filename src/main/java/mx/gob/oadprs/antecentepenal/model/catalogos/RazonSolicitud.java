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

}
