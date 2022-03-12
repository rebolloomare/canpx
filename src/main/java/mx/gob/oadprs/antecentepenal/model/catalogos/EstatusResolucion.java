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
import mx.gob.oadprs.antecentepenal.dtos.EstatusResolucionDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
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
	 */
	public EstatusResolucion() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idEstatusResolucion
	 * @param estatusResolucion
	 */
	public EstatusResolucion(int idEstatusResolucion, String estatusResolucion) {
		super();
		this.idEstatusResolucion = idEstatusResolucion;
		this.estatusResolucion = estatusResolucion;
	}

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
		builder.append("EstatusResolucion [idEstatusResolucion=")
			.append(idEstatusResolucion)
			.append(", estatusResolucion=")
			.append(estatusResolucion)
			.append("]");
		return builder.toString();
	}

}
