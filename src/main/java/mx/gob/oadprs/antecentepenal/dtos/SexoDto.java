/**
 * Sexo.java Fecha de creación: 22 feb. 2022, 09:54:30 Copyright (c) 2022 XXXXXXX Todos los
 * derechos reservados. Este software es información confidencial, propiedad de XXXXXXX.
 * Esta información confidencial no deberá ser divulgada y solo se podrá utilizar de
 * acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import mx.gob.oadprs.antecentepenal.model.catalog.Sexo;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class SexoDto {

	private Long id;

	private String nombre;

	private String descripcion;

	private boolean activo = true;

	public SexoDto(Sexo sexo) {
		this.id = sexo.getId();
		this.nombre = sexo.getNombre();
		this.descripcion = sexo.getDescripcion();
		this.activo = sexo.isActivo();
	}

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
