/**
 * Sexo.java Fecha de creación: 22 feb. 2022, 09:54:30 Copyright (c) 2022 XXXXXXX Todos los
 * derechos reservados. Este software es información confidencial, propiedad de XXXXXXX.
 * Esta información confidencial no deberá ser divulgada y solo se podrá utilizar de
 * acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Entity
@Table(name = "cat_sexo")
public class Sexo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cat_sexo")
	private Long id;

	@NotBlank
	@NotNull
	@Size(min = 1, max = 20)
	private String nombre;

	@Size(min = 1, max = 50)
	private String descripcion;

	@NotNull
	private boolean activo = true;

	/**
	 * @return el atributo id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id parametro id a actualizar
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return el atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre parametro nombre a actualizar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el atributo descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion parametro descripcion a actualizar
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return el atributo activo
	 */
	public boolean isActivo() {
		return activo;
	}

	/**
	 * @param activo parametro activo a actualizar
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
