/**
 * Pago.java Fecha de creación: 9 mar. 2022, 23:45:54 Copyright (c) 2022 XXXXXXX Todos los
 * derechos reservados. Este software es información confidencial, propiedad de XXXXXXX.
 * Esta información confidencial no deberá ser divulgada y solo se podrá utilizar de
 * acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.dtos.PagosDto;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
@Entity
@Table(schema = "tx", name = "tx_pagos")
public class Pagos {

	@Id
	@Column(name = "idpago")
	private UUID idPago;

	@Column(name = "idsolicitud_constancia")
	private UUID idSolicitudConstancia;

	@Column(name = "linea_captura", length = 30)
	private String lineaCaptura;

	@Column(length = 10)
	private String homoclave;

	@Column(name = "costo_tramite", precision = 6, scale = 2)
	private BigDecimal costoTramite;

	@Column(name = "nro_confirmacion_pago", length = 30)
	private String noConfirmacionPago;

	@Column(name = "referencia_pago", length = 30)
	private String referenciaPago;

	@Column(name = "fecha_pago")
	private Date fechaPago;

	@Column(name = "digitos_tarjeta_pago", length = 18)
	private String digitosTarjetaPago;

	@Column(name = "tipo_tarjeta")
	private int tipoTarjeta;

	@Column(name = "banco_emisor_tarjeta", length = 40)
	private String bancoEmisorTarjeta;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param idPago
	 * @param idSolicitudConstancia
	 * @param lineaCaptura
	 * @param homoclave
	 * @param costoTramite
	 * @param noConfirmacionPago
	 * @param referenciaPago
	 * @param fechaPago
	 * @param digitosTarjetaPago
	 * @param tipoTarjeta
	 * @param bancoEmisorTarjeta
	 */
	public Pagos(PagosDto pagosDto) {
		super();
		this.idPago = pagosDto.getIdPago();
		this.idSolicitudConstancia = pagosDto.getIdSolicitudConstancia();
		this.lineaCaptura = pagosDto.getLineaCaptura();
		this.homoclave = pagosDto.getHomoclave();
		this.costoTramite = pagosDto.getCostoTramite();
		this.noConfirmacionPago = pagosDto.getNoConfirmacionPago();
		this.referenciaPago = pagosDto.getReferenciaPago();
		this.fechaPago = pagosDto.getFechaPago();
		this.digitosTarjetaPago = pagosDto.getDigitosTarjetaPago();
		this.tipoTarjeta = pagosDto.getTipoTarjeta();
		this.bancoEmisorTarjeta = pagosDto.getBancoEmisorTarjeta();
	}

}
