/**
 * InstitucionesCertificadas.java Fecha de creación: 10 mar. 2022, 12:43:57 Copyright (c)
 * 2022 XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.dtos.InstitucionesCertificadasDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
@Entity
@Table(schema = "cat", name = "cat_instituciones_certificadas")
public class InstitucionesCertificadas {

	@Id
	@Column(name = "idinstituciones_certificadas")
	private int idInstitucionesCertificadas;

	@Column(name = "instituciones_certificadas", length = 100)
	@NotNull
	private String institucionesCertificadas;

	@NotNull
	private int estatus;

	@Column(name = "nombre_corto", length = 50)
	@NotNull
	private String nombreCorto;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public InstitucionesCertificadas() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idInstitucionesCertificadas
	 * @param institucionesCertificadas
	 * @param idEstatus
	 * @param nombreCorto
	 */
	public InstitucionesCertificadas(
		InstitucionesCertificadasDto institucionesCertificadasDto) {
		super();
		this.idInstitucionesCertificadas =
			institucionesCertificadasDto.getIdInstitucionesCertificadas();
		this.institucionesCertificadas =
			institucionesCertificadasDto.getInstitucionesCertificadas();
		this.nombreCorto = institucionesCertificadasDto.getNombreCorto();
	}

}
