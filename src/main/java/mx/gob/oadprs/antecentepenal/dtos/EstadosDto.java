/**
 * Estado.java Fecha de creación: 22 feb. 2022, 09:53:16 Copyright (c) 2022 XXXXXXX Todos
 * los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import mx.gob.oadprs.antecentepenal.model.catalogos.Estados;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class EstadosDto {

	private int id;

	private String estado;

	private String nombreEstado;

	private String codigoAlpha2;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public EstadosDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @param estado
	 * @param nombreEstado
	 * @param codigoAlpha2
	 */
	public EstadosDto(int id, String estado, String nombreEstado, String codigoAlpha2) {
		super();
		this.id = id;
		this.estado = estado;
		this.nombreEstado = nombreEstado;
		this.codigoAlpha2 = codigoAlpha2;
	}

	public EstadosDto(Estados estado) {
		this.id = estado.getId();
		this.estado = estado.getEstado();
		this.nombreEstado = estado.getNombreEstado();
		this.codigoAlpha2 = estado.getCodigoAlpha2();
	}

	/**
	 * @return el atributo id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id parametro id a actualizar
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return el atributo estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado parametro estado a actualizar
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return el atributo nombreEstado
	 */
	public String getNombreEstado() {
		return nombreEstado;
	}

	/**
	 * @param nombreEstado parametro nombreEstado a actualizar
	 */
	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

	/**
	 * @return el atributo codigoAlpha2
	 */
	public String getCodigoAlpha2() {
		return codigoAlpha2;
	}

	/**
	 * @param codigoAlpha2 parametro codigoAlpha2 a actualizar
	 */
	public void setCodigoAlpha2(String codigoAlpha2) {
		this.codigoAlpha2 = codigoAlpha2;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EstadosDto [id=")
			.append(id)
			.append(", estado=")
			.append(estado)
			.append(", nombreEstado=")
			.append(nombreEstado)
			.append(", codigoAlpha2=")
			.append(codigoAlpha2)
			.append("]");
		return builder.toString();
	}

}
