/**
 * InstitucionesCertificadas.java Fecha de creación: 10 mar. 2022, 12:43:57 Copyright (c)
 * 2022 XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model.catalogos;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
	private UUID idInstitucionesCertificadas;

	@Column(name = "instituciones_certificadas", length = 600)
	private String institucionesCertificadas;

	@Column(name = "idestatus")
	private int idEstatus;

	@Column(name = "nombre_corto", length = 60)
	private String nombreCorto;

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
		this.idEstatus = institucionesCertificadasDto.getIdEstatus();
		this.nombreCorto = institucionesCertificadasDto.getNombreCorto();
	}

}
