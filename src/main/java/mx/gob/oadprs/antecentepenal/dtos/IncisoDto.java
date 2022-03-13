/**
 * IncisoDto.java Fecha de creación: 12 mar. 2022, 19:00:33 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import javax.validation.constraints.NotNull;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.catalogos.Inciso;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
public class IncisoDto {

	@NotNull
	private int idInciso;

	@NotNull
	private String incisoLetra;

	@NotNull
	private String parrafo;

	@NotNull
	private int estatus;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public IncisoDto() {
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
	public IncisoDto(Inciso inciso) {
		super();
		this.idInciso = inciso.getIdInciso();
		this.incisoLetra = inciso.getIncisoLetra();
		this.parrafo = inciso.getParrafo();
		this.estatus = inciso.getEstatus();
	}

}
