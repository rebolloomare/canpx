/**
 * PagoDto.java Fecha de creación: 9 mar. 2022, 23:45:25 Copyright (c) 2022 XXXXXXX Todos
 * los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import lombok.Data;
import mx.gob.oadprs.antecentepenal.model.Pagos;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Data
public class PagosDto {

	private UUID idPago;

	private UUID idSolicitudConstancia;

	private String lineaCaptura;

	private String homoclave;

	private BigDecimal costoTramite;

	private String noConfirmacionPago;

	private String referenciaPago;

	private Date fechaPago;

	private String digitosTarjetaPago;

	private int tipoTarjeta;

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
	public PagosDto(Pagos pagos) {
		super();
		this.idPago = pagos.getIdPago();
		this.idSolicitudConstancia = pagos.getIdSolicitudConstancia();
		this.lineaCaptura = pagos.getLineaCaptura();
		this.homoclave = pagos.getHomoclave();
		this.costoTramite = pagos.getCostoTramite();
		this.noConfirmacionPago = pagos.getNoConfirmacionPago();
		this.referenciaPago = pagos.getReferenciaPago();
		this.fechaPago = pagos.getFechaPago();
		this.digitosTarjetaPago = pagos.getDigitosTarjetaPago();
		this.tipoTarjeta = pagos.getTipoTarjeta();
		this.bancoEmisorTarjeta = pagos.getBancoEmisorTarjeta();
	}

}
