/**
 * InstitucionesCertificadas.java Fecha de creación: 10 mar. 2022, 12:43:57 Copyright (c)
 * 2022 XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.catalogos.InstitucionesCertificadas;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
public class InstitucionesCertificadasDto {

	private int idInstitucionesCertificadas;

	private String institucionesCertificadas;

	private int estatus;

	private String nombreCorto;

	private Integer idEstatus;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public InstitucionesCertificadasDto() {
		super();
	}

	public InstitucionesCertificadasDto(InstitucionesCertificadas institucionesCertificadas) {
		this.idInstitucionesCertificadas =
			institucionesCertificadas.getIdInstitucionesCertificadas();
		this.institucionesCertificadas =
			institucionesCertificadas.getInstitucionesCertificadas();
		this.idEstatus = institucionesCertificadas.getIdEstatus();
		this.estatus = institucionesCertificadas.getEstatus();
		this.nombreCorto = institucionesCertificadas.getNombreCorto();
	}

}
