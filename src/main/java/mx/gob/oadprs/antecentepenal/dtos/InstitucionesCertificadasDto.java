/**
 * InstitucionesCertificadas.java Fecha de creación: 10 mar. 2022, 12:43:57 Copyright (c)
 * 2022 XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import java.util.UUID;
import mx.gob.oadprs.antecentepenal.model.catalogos.InstitucionesCertificadas;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class InstitucionesCertificadasDto {

	private UUID idInstitucionesCertificadas;

	private String institucionesCertificadas;

	private int idEstatus;

	private String nombreCorto;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public InstitucionesCertificadasDto() {
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
	public InstitucionesCertificadasDto(UUID idInstitucionesCertificadas,
		String institucionesCertificadas, int idEstatus, String nombreCorto) {
		super();
		this.idInstitucionesCertificadas = idInstitucionesCertificadas;
		this.institucionesCertificadas = institucionesCertificadas;
		this.idEstatus = idEstatus;
		this.nombreCorto = nombreCorto;
	}

	public InstitucionesCertificadasDto(InstitucionesCertificadas institucionesCertificadas) {
		this.idInstitucionesCertificadas =
			institucionesCertificadas.getIdInstitucionesCertificadas();
		this.institucionesCertificadas =
			institucionesCertificadas.getInstitucionesCertificadas();
		this.idEstatus = institucionesCertificadas.getIdEstatus();
		this.nombreCorto = institucionesCertificadas.getNombreCorto();
	}

	/**
	 * @return el atributo idInstitucionesCertificadas
	 */
	public UUID getIdInstitucionesCertificadas() {
		return idInstitucionesCertificadas;
	}

	/**
	 * @param idInstitucionesCertificadas parametro idInstitucionesCertificadas a
	 *        actualizar
	 */
	public void setIdInstitucionesCertificadas(UUID idInstitucionesCertificadas) {
		this.idInstitucionesCertificadas = idInstitucionesCertificadas;
	}

	/**
	 * @return el atributo institucionesCertificadas
	 */
	public String getInstitucionesCertificadas() {
		return institucionesCertificadas;
	}

	/**
	 * @param institucionesCertificadas parametro institucionesCertificadas a actualizar
	 */
	public void setInstitucionesCertificadas(String institucionesCertificadas) {
		this.institucionesCertificadas = institucionesCertificadas;
	}

	/**
	 * @return el atributo idEstatus
	 */
	public int getIdEstatus() {
		return idEstatus;
	}

	/**
	 * @param idEstatus parametro idEstatus a actualizar
	 */
	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
	}

	/**
	 * @return el atributo nombreCorto
	 */
	public String getNombreCorto() {
		return nombreCorto;
	}

	/**
	 * @param nombreCorto parametro nombreCorto a actualizar
	 */
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InstitucionesCertificadasDto [idInstitucionesCertificadas=")
			.append(idInstitucionesCertificadas)
			.append(", institucionesCertificadas=")
			.append(institucionesCertificadas)
			.append(", idEstatus=")
			.append(idEstatus)
			.append(", nombreCorto=")
			.append(nombreCorto)
			.append("]");
		return builder.toString();
	}

}
