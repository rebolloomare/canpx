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
import lombok.Data;
import mx.gob.oadprs.antecentepenal.dtos.EstadosDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
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
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public Estados() {
		super();
	}

}
