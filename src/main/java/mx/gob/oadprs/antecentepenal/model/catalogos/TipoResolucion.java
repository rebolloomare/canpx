/**
 * TipoResolucion.java Fecha de creación: 10 mar. 2022, 13:00:18 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import mx.gob.oadprs.antecentepenal.dtos.TipoResolucionDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Entity
@Table(schema = "cat", name = "cat_tipo_resolucion")
public class TipoResolucion {

	@Id
	@Column(name = "idtipo_resolucion")
	private int idTipoResolucion;

	@Column(name = "tipo_resolucion", length = 30)
	private String tipoResolucion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public TipoResolucion() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idTipoResolucion
	 * @param tipoResolucion
	 */
	public TipoResolucion(int idTipoResolucion, String tipoResolucion) {
		super();
		this.idTipoResolucion = idTipoResolucion;
		this.tipoResolucion = tipoResolucion;
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idTipoResolucion
	 * @param tipoResolucion
	 */
	public TipoResolucion(TipoResolucionDto tipoResolucionDto) {
		super();
		this.idTipoResolucion = tipoResolucionDto.getIdTipoResolucion();
		this.tipoResolucion = tipoResolucionDto.getTipoResolucion();
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
		builder.append("TipoResolucion [idTipoResolucion=")
			.append(idTipoResolucion)
			.append(", tipoResolucion=")
			.append(tipoResolucion)
			.append("]");
		return builder.toString();
	}

}
