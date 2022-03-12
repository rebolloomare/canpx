/**
 * Pago.java Fecha de creación: 9 mar. 2022, 23:45:54 Copyright (c) 2022 XXXXXXX Todos los
 * derechos reservados. Este software es información confidencial, propiedad de XXXXXXX.
 * Esta información confidencial no deberá ser divulgada y solo se podrá utilizar de
 * acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import mx.gob.oadprs.antecentepenal.dtos.PagosDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Entity
public class Pagos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int folio;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public Pagos() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public Pagos(PagosDto pagoDto) {
		this.folio = pagoDto.getFolio();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param folio
	 */
	public Pagos(int folio) {
		super();
		this.folio = folio;
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

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pagos [folio=").append(folio).append("]");
		return builder.toString();
	}

}
