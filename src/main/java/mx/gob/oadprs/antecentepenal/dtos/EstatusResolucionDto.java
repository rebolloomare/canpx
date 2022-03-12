/**
 * EstatusResolucion.java Fecha de creación: 10 mar. 2022, 12:26:01 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import mx.gob.oadprs.antecentepenal.model.catalogos.EstatusResolucion;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class EstatusResolucionDto {

	private int idEstatusResolucion;

	private String estatusResolucion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public EstatusResolucionDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public EstatusResolucionDto(EstatusResolucion estatusResolucion) {
		super();
		this.idEstatusResolucion = estatusResolucion.getIdEstatusResolucion();
		this.estatusResolucion = estatusResolucion.getEstatusResolucion();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idEstatusResolucion
	 * @param estatusResolucion
	 */
	public EstatusResolucionDto(int idEstatusResolucion, String estatusResolucion) {
		super();
		this.idEstatusResolucion = idEstatusResolucion;
		this.estatusResolucion = estatusResolucion;
	}

	/**
	 * @return el atributo idEstatusResolucion
	 */
	public int getIdEstatusResolucion() {
		return idEstatusResolucion;
	}

	/**
	 * @param idEstatusResolucion parametro idEstatusResolucion a actualizar
	 */
	public void setIdEstatusResolucion(int idEstatusResolucion) {
		this.idEstatusResolucion = idEstatusResolucion;
	}

	/**
	 * @return el atributo estatusResolucion
	 */
	public String getEstatusResolucion() {
		return estatusResolucion;
	}

	/**
	 * @param estatusResolucion parametro estatusResolucion a actualizar
	 */
	public void setEstatusResolucion(String estatusResolucion) {
		this.estatusResolucion = estatusResolucion;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EstatusResolucionDto [idEstatusResolucion=")
			.append(idEstatusResolucion)
			.append(", estatusResolucion=")
			.append(estatusResolucion)
			.append("]");
		return builder.toString();
	}

}
