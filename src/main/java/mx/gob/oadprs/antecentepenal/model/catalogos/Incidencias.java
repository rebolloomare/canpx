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
import mx.gob.oadprs.antecentepenal.dtos.IncidenciasDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
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
	 */
	public Incidencias() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idIncidencia
	 * @param incidencia
	 */
	public Incidencias(int idIncidencia, String incidencia) {
		super();
		this.idIncidencia = idIncidencia;
		this.incidencia = incidencia;
	}

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

	/**
	 * @return el atributo idIncidencia
	 */
	public int getIdIncidencia() {
		return idIncidencia;
	}

	/**
	 * @param idIncidencia parametro idIncidencia a actualizar
	 */
	public void setIdIncidencia(int idIncidencia) {
		this.idIncidencia = idIncidencia;
	}

	/**
	 * @return el atributo idincidencia
	 */
	public String getIncidencia() {
		return incidencia;
	}

	/**
	 * @param idincidencia parametro idincidencia a actualizar
	 */
	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Incidencias [idIncidencia=")
			.append(idIncidencia)
			.append(", incidencia=")
			.append(incidencia)
			.append("]");
		return builder.toString();
	}

}
