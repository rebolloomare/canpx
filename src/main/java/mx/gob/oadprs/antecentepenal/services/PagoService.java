/**
 * PagoService.java Fecha de creación: 9 mar. 2022, 23:49:06 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.services;

import java.util.List;
import mx.gob.oadprs.antecentepenal.dtos.PagosDto;
import mx.gob.oadprs.antecentepenal.model.Pagos;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public interface PagoService {

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param pagoDto
	 * @return
	 */
	Pagos registraPago(PagosDto pagoDto);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param folio
	 * @return
	 */
	Pagos obtienePagoById(String folio);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<Pagos> obtienePagos();

}
