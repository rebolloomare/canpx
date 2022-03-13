/**
 * ParametrosDoc.java Fecha de creación: 10 mar. 2022, 12:51:13 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.dtos.ParametrosDocDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
@Entity
@Table(schema = "cat", name = "cat_parametros_doc")
public class ParametrosDoc {

	@Id
	@Column(name = "parametros_doc")
	private int parametrosDoc;

	@Column(name = "idtipo_resolucion")
	private int idTipoResolucion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param parametrosDoc
	 * @param idTipoResolucion
	 */
	public ParametrosDoc(ParametrosDocDto parametrosDocDto) {
		super();
		this.parametrosDoc = parametrosDocDto.getParametrosDoc();
		this.idTipoResolucion = parametrosDocDto.getIdTipoResolucion();
	}

}
