/**
 * Incidencias.java Fecha de creación: 10 mar. 2022, 12:41:20 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.dtos.IncidenciasDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
@Entity
@Table(schema = "cat", name = "cat_incidencias")
public class Incidencias {

	@Id
	@Column(name = "idincidencia")
	private int idIncidencia;

	@Column(length = 40)
	private String incidencia;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idIncidencia
	 * @param idincidencia2
	 */
	public Incidencias(IncidenciasDto incidenciasDto) {
		super();
		this.idIncidencia = incidenciasDto.getIdIncidencia();
		this.incidencia = incidenciasDto.getIncidencia();
	}

}
