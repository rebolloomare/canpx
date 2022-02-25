/**
 * EstadoService.java Fecha de creación: 22 feb. 2022, 11:06:43 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.services;

import java.util.List;
import mx.gob.oadprs.antecentepenal.model.catalog.Estado;
import mx.gob.oadprs.antecentepenal.model.catalog.Sexo;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public interface CatalogosService {

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<Estado> estadosList();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<Sexo> sexoList();

}
