/**
 * PagoDto.java Fecha de creación: 9 mar. 2022, 23:45:25 Copyright (c) 2022 XXXXXXX Todos
 * los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import mx.gob.oadprs.antecentepenal.model.Pagos;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class PagosDto {

	private int folio;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public PagosDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param folio
	 */
	public PagosDto(Pagos pago) {
		super();
		this.folio = pago.getFolio();
	}

	/**
	 * @return el atributo folio
	 */
	public int getFolio() {
		return folio;
	}

	/**
	 * @param folio parametro folio a actualizar
	 */
	public void setFolio(int folio) {
		this.folio = folio;
	}

}
