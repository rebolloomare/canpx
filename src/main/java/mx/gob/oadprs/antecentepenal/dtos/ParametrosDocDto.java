/**
 * ParametrosDoc.java Fecha de creación: 10 mar. 2022, 12:51:13 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import mx.gob.oadprs.antecentepenal.model.catalogos.ParametrosDoc;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class ParametrosDocDto {

	private int parametrosDoc;

	private int idTipoResolucion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public ParametrosDocDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param parametrosDoc
	 * @param idTipoResolucion
	 */
	public ParametrosDocDto(int parametrosDoc, int idTipoResolucion) {
		super();
		this.parametrosDoc = parametrosDoc;
		this.idTipoResolucion = idTipoResolucion;
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param parametrosDoc
	 */
	public ParametrosDocDto(ParametrosDoc parametrosDoc) {
		this.parametrosDoc = parametrosDoc.getParametrosDoc();
		this.idTipoResolucion = parametrosDoc.getIdTipoResolucion();
	}

	/**
	 * @return el atributo parametrosDoc
	 */
	public int getParametrosDoc() {
		return parametrosDoc;
	}

	/**
	 * @param parametrosDoc parametro parametrosDoc a actualizar
	 */
	public void setParametrosDoc(int parametrosDoc) {
		this.parametrosDoc = parametrosDoc;
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

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParametrosDocDto [parametrosDoc=")
			.append(parametrosDoc)
			.append(", idTipoResolucion=")
			.append(idTipoResolucion)
			.append("]");
		return builder.toString();
	}

}
