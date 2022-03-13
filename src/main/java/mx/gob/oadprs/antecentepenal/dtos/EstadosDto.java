/**
 * Estado.java Fecha de creación: 22 feb. 2022, 09:53:16 Copyright (c) 2022 XXXXXXX Todos
 * los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.catalogos.Estados;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
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

	public EstadosDto(Estados estado) {
		this.id = estado.getId();
		this.estado = estado.getEstado();
		this.nombreEstado = estado.getNombreEstado();
		this.codigoAlpha2 = estado.getCodigoAlpha2();
	}

}
