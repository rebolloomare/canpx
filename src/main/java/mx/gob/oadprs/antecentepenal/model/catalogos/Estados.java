/**
 * Estado.java Fecha de creación: 22 feb. 2022, 09:53:16 Copyright (c) 2022 XXXXXXX Todos
 * los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import mx.gob.oadprs.antecentepenal.dtos.EstadosDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Entity
@Table(schema = "cat", name = "cat_estados")
public class Estados {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idestados")
	private int id;

	@Column(length = 60)
	private String estado;

	@Column(name = "nombre_estado", length = 60)
	private String nombreEstado;

	@Column(name = "codigo_alpha2", length = 2)
	private String codigoAlpha2;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public Estados() {
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
	public Estados(int id, String estado, String nombreEstado, String codigoAlpha2) {
		super();
		this.id = id;
		this.estado = estado;
		this.nombreEstado = nombreEstado;
		this.codigoAlpha2 = codigoAlpha2;
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @param estado
	 * @param nombreEstado
	 * @param codigoAlpha2
	 */
	public Estados(EstadosDto estadosDto) {
		super();
		this.id = estadosDto.getId();
		this.estado = estadosDto.getEstado();
		this.nombreEstado = estadosDto.getNombreEstado();
		this.codigoAlpha2 = estadosDto.getCodigoAlpha2();
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
		builder.append("Estados [id=")
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
