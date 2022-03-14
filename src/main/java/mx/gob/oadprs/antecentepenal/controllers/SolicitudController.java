/**
 * SolicitudController.java Fecha de creación: 28 feb. 2022, 14:12:23 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
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
import mx.gob.oadprs.antecentepenal.dtos.SolicitudDto;
import mx.gob.oadprs.antecentepenal.model.Solicitud;
import mx.gob.oadprs.antecentepenal.services.SolicitudService;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@RestController
@RequestMapping("/solicitud")
@Tag(name = "Solicitudes", description = "API de Solicitudes")
public class SolicitudController {

	private static final Logger logger = LoggerFactory.getLogger(SolicitudController.class);

	@Autowired
	private SolicitudService solicitudService;

	@PostMapping("/registra")
	@Operation(summary = "Registro de Solicitud",
		description = "Registro de Solicitud de Antecedentes Penales",
		tags = { "SolicitudDto" })
	@ApiResponses(
		value = {
			@ApiResponse(responseCode = "201", description = "Solicitud creada",
				content = @Content(mediaType = "application/json",
					array = @ArraySchema(
						schema = @Schema(implementation = SolicitudDto.class)))),
			@ApiResponse(description = "Error en el Servidor", responseCode = "500",
				content = @Content) })
	public ResponseEntity<SolicitudDto> registraSolicitud(
		@Parameter(description = "La petición no puede estar vacia",
			required = true) @RequestBody SolicitudDto solicitudDto) {
		logger.info("SolicitudController:::::registraSolicitud");
		Solicitud solicitud = solicitudService.registraSolicitud(solicitudDto);
		logger.info("Solicitud Registrada con éxito");
		solicitudDto = new SolicitudDto(solicitud);
		return new ResponseEntity<SolicitudDto>(solicitudDto, HttpStatus.CREATED);
	}

}
