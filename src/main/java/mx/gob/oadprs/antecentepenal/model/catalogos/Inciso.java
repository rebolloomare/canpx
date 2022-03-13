/**
 * Inciso.java Fecha de creación: 12 mar. 2022, 18:55:57 Copyright (c) 2022 XXXXXXX Todos
 * los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.dtos.IncisoDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
@Entity
@Table(schema = "cat", name = "cat_inciso")
public class Inciso {

	@Column(name = "id_inciso")
	@NotNull
	private int idInciso;

	@Column(name = "inciso_letra", length = 2)
	@NotNull
	private String incisoLetra;

	@Column(length = 600)
	@NotNull
	private String parrafo;

	@NotNull
	private int estatus;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public Inciso() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idInciso
	 * @param incisoLetra
	 * @param parrafo
	 * @param estatus
	 */
	public Inciso(IncisoDto incisoDto) {
		super();
		this.idInciso = incisoDto.getIdInciso();
		this.incisoLetra = incisoDto.getIncisoLetra();
		this.parrafo = incisoDto.getParrafo();
		this.estatus = incisoDto.getEstatus();
	}

}
