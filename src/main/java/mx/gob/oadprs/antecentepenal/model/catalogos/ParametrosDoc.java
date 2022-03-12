/**
 * ParametrosDoc.java Fecha de creación: 10 mar. 2022, 12:51:13 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import mx.gob.oadprs.antecentepenal.dtos.ParametrosDocDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Entity
@Table(schema = "cat", name = "cat_parametros_doc")
public class ParametrosDoc {

	@Id
	@Column(name = "parametros_doc")
	private int parametrosDoc;

	@Column(name = "idtipo_resolucion")
	private int idTipoResolucion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public ParametrosDoc() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param parametrosDoc
	 * @param idTipoResolucion
	 */
	public ParametrosDoc(int parametrosDoc, int idTipoResolucion) {
		super();
		this.parametrosDoc = parametrosDoc;
		this.idTipoResolucion = idTipoResolucion;
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param parametrosDoc
	 * @param idTipoResolucion
	 */
	public ParametrosDoc(ParametrosDocDto parametrosDocDto) {
		super();
		this.parametrosDoc = parametrosDocDto.getParametrosDoc();
		this.idTipoResolucion = parametrosDocDto.getIdTipoResolucion();
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
		builder.append("ParametrosDoc [parametrosDoc=")
			.append(parametrosDoc)
			.append(", idTipoResolucion=")
			.append(idTipoResolucion)
			.append("]");
		return builder.toString();
	}

}
