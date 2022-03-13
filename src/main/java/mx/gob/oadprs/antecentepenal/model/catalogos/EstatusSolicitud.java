/**
 * EstatusSolicitud.java Fecha de creación: 10 mar. 2022, 12:37:35 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.dtos.EstatusSolicitudDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
@Entity
@Table(schema = "cat", name = "cat_estatus_solicitud")
public class EstatusSolicitud {

	@Id
	@Column(name = "idestatus_solicitud")
	private int idEstatusSolicitud;

	@Column(name = "estatus_solicitud", length = 30)
	private String estatusSolicitud;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public EstatusSolicitud() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idEstatusSolicitud
	 * @param estatusSolicitud
	 */
	public EstatusSolicitud(EstatusSolicitudDto estatusSolicitudDto) {
		super();
		this.idEstatusSolicitud = estatusSolicitudDto.getIdEstatusSolicitud();
		this.estatusSolicitud = estatusSolicitudDto.getEstatusSolicitud();
	}

}
