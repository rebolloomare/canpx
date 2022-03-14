/**
 * PagoController.java Fecha de creación: 9 mar. 2022, 19:42:40 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import mx.gob.oadprs.antecentepenal.dtos.PagosDto;
import mx.gob.oadprs.antecentepenal.model.Pagos;
import mx.gob.oadprs.antecentepenal.services.PagoService;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@RestController
@RequestMapping("/pago")
@Tag(name = "Pagos", description = "API de Pagos")
public class PagoController {

	private static Logger logger = LoggerFactory.getLogger(PagoController.class);

	@Autowired
	private PagoService pagoService;

	@PostMapping("/registra")
	@Operation(summary = "Registro de Pago",
		description = "Registro de Pago de Solicitud de Antecedentes Penales",
		tags = { "PagosDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "201", description = "Pago creado",
			content = @Content(mediaType = "application/json",
				array = @ArraySchema(schema = @Schema(implementation = PagosDto.class)))),
		@ApiResponse(description = "Error en el Servidor", responseCode = "500",
			content = @Content) })
	public ResponseEntity<PagosDto> registraPago(
		@Parameter(description = "La petición no puede estar vacia",
			required = true) @RequestBody PagosDto pagoDto) {
		logger.info("PagoController::::::::registraPago");
		Pagos pago = pagoService.registraPago(pagoDto);
		logger.info("Pago Registrado exitosamente");
		pagoDto = new PagosDto(pago);
		return new ResponseEntity<PagosDto>(pagoDto, HttpStatus.CREATED);
	}

}
