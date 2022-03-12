/**
 * Incidencias.java Fecha de creación: 10 mar. 2022, 12:41:20 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import mx.gob.oadprs.antecentepenal.model.catalogos.Incidencias;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class IncidenciasDto {

	private int idIncidencia;

	private String incidencia;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public IncidenciasDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idIncidencia
	 * @param idincidencia2
	 */
	public IncidenciasDto(int idIncidencia, String incidencia) {
		super();
		this.idIncidencia = idIncidencia;
		this.incidencia = incidencia;
	}

	public IncidenciasDto(Incidencias incidencias) {
		this.idIncidencia = incidencias.getIdIncidencia();
		this.incidencia = incidencias.getIncidencia();
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
		builder.append("IncidenciasDto [idIncidencia=")
			.append(idIncidencia)
			.append(", incidencia=")
			.append(incidencia)
			.append("]");
		return builder.toString();
	}

}
