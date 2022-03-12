/**
 * EstatusSolicitud.java Fecha de creación: 10 mar. 2022, 12:37:35 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import mx.gob.oadprs.antecentepenal.model.catalogos.EstatusSolicitud;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class EstatusSolicitudDto {

	private int idEstatusSolicitud;

	private String estatusSolicitud;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public EstatusSolicitudDto() {
		super();
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idEstatusSolicitud
	 * @param estatusSolicitud
	 */
	public EstatusSolicitudDto(int idEstatusSolicitud, String estatusSolicitud) {
		super();
		this.idEstatusSolicitud = idEstatusSolicitud;
		this.estatusSolicitud = estatusSolicitud;
	}

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public EstatusSolicitudDto(EstatusSolicitud estatusSolicitud) {
		super();
		this.idEstatusSolicitud = estatusSolicitud.getIdEstatusSolicitud();
		this.estatusSolicitud = estatusSolicitud.getEstatusSolicitud();
	}

	/**
	 * @return el atributo idEstatusSolicitud
	 */
	public int getIdEstatusSolicitud() {
		return idEstatusSolicitud;
	}

	/**
	 * @param idEstatusSolicitud parametro idEstatusSolicitud a actualizar
	 */
	public void setIdEstatusSolicitud(int idEstatusSolicitud) {
		this.idEstatusSolicitud = idEstatusSolicitud;
	}

	/**
	 * @return el atributo estatusSolicitud
	 */
	public String getEstatusSolicitud() {
		return estatusSolicitud;
	}

	/**
	 * @param estatusSolicitud parametro estatusSolicitud a actualizar
	 */
	public void setEstatusSolicitud(String estatusSolicitud) {
		this.estatusSolicitud = estatusSolicitud;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EstatusSolicitudDto [idEstatusSolicitud=")
			.append(idEstatusSolicitud)
			.append(", estatusSolicitud=")
			.append(estatusSolicitud)
			.append("]");
		return builder.toString();
	}

}
