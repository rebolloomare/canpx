/**
 * TipoResolucion.java Fecha de creación: 10 mar. 2022, 13:00:18 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import mx.gob.oadprs.antecentepenal.model.catalogos.TipoResolucion;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class TipoResolucionDto {

	private int idTipoResolucion;

	private String tipoResolucion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public TipoResolucionDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idTipoResolucion
	 * @param tipoResolucion
	 */
	public TipoResolucionDto(int idTipoResolucion, String tipoResolucion) {
		super();
		this.idTipoResolucion = idTipoResolucion;
		this.tipoResolucion = tipoResolucion;
	}

	public TipoResolucionDto(TipoResolucion tipoResolucion) {
		this.idTipoResolucion = tipoResolucion.getIdTipoResolucion();
		this.tipoResolucion = tipoResolucion.getTipoResolucion();
	}

	/**
	 * @return el atributo idTipoResolucion
	 */
	public int getIdTipoResolucion() {
		return idTipoResolucion;
	}

	/**
	 * @param idTipoResolucion parametro idTipoResolucion a actualizar
	 */
	public void setIdTipoResolucion(int idTipoResolucion) {
		this.idTipoResolucion = idTipoResolucion;
	}

	/**
	 * @return el atributo tipoResolucion
	 */
	public String getTipoResolucion() {
		return tipoResolucion;
	}

	/**
	 * @param tipoResolucion parametro tipoResolucion a actualizar
	 */
	public void setTipoResolucion(String tipoResolucion) {
		this.tipoResolucion = tipoResolucion;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TipoResolucionDto [idTipoResolucion=")
			.append(idTipoResolucion)
			.append(", tipoResolucion=")
			.append(tipoResolucion)
			.append("]");
		return builder.toString();
	}

}
