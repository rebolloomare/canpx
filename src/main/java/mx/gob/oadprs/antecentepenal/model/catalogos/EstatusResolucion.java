/**
 * EstatusResolucion.java Fecha de creación: 10 mar. 2022, 12:26:01 Copyright (c) 2022
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
import mx.gob.oadprs.antecentepenal.dtos.EstatusResolucionDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
@Entity
@Table(schema = "cat", name = "cat_estatus_resolucion")
public class EstatusResolucion {

	@Id
	@Column(name = "idestatus_resolucion")
	private int idEstatusResolucion;

	@Column(name = "estatus_resolucion", length = 30)
	private String estatusResolucion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idEstatusResolucion
	 * @param estatusResolucion
	 */
	public EstatusResolucion(EstatusResolucionDto estatusResolucionDto) {
		super();
		this.idEstatusResolucion = estatusResolucionDto.getIdEstatusResolucion();
		this.estatusResolucion = estatusResolucionDto.getEstatusResolucion();
	}

}
