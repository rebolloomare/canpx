/**
 * SolicitudController.java Fecha de creación: 28 feb. 2022, 14:12:23 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
public class SolicitudController {

	private static final Logger logger = LoggerFactory.getLogger(SolicitudController.class);

	@Autowired
	private SolicitudService solicitudService;

	@PostMapping("/registra")
	public ResponseEntity<SolicitudDto> registraSolicitud(
		@RequestBody SolicitudDto solicitudDto) {
		logger.info("SolicitudController:::::registraSolicitud");
		Solicitud solicitud = solicitudService.registraSolicitud(solicitudDto);
		logger.info("Solicitud Registrada con éxito");
		solicitudDto = new SolicitudDto(solicitud);
		return new ResponseEntity<SolicitudDto>(solicitudDto, HttpStatus.CREATED);
	}

	@GetMapping("/consulta/{folio}")
	public ResponseEntity<SolicitudDto> obtieneSolicitudByFolio(@PathVariable String folio) {
		logger.info("SolicitudController:::::::obtieneSolicitudById");
		Solicitud solicitud = solicitudService.obtieneSolicitudById(folio);

		logger.info("Datos solicitud: " + solicitud.toString());
		SolicitudDto solicitudDto = new SolicitudDto(solicitud);

		return new ResponseEntity<SolicitudDto>(solicitudDto, HttpStatus.OK);
	}

	@GetMapping("/consulta")
	public ResponseEntity<List<SolicitudDto>> obtieneSolicitudes() {
		logger.info("SolicitudController:::::::obtieneSolicitudes");
		List<SolicitudDto> listaSolicitudesDto = new ArrayList<>();
		List<Solicitud> listaSolicitudes = solicitudService.obtieneSolicitudes();
		logger.info("elementos en la lista de solicitudes: " + listaSolicitudes.size());
		listaSolicitudesDto =
			listaSolicitudes.stream().map(SolicitudDto::new).collect(Collectors.toList());
		return new ResponseEntity<List<SolicitudDto>>(listaSolicitudesDto, HttpStatus.OK);
	}

	@DeleteMapping("/elimina/{folio}")
	public ResponseEntity<String> eliminaSolicitud(@PathVariable String folio) {
		logger.info("SolicitudController:::::::eliminarSolicitudById");
		folio = solicitudService.eliminarSolicitudById(folio);
		logger.info("Folio eliminado: " + folio);
		return new ResponseEntity<String>(folio, HttpStatus.ACCEPTED);
	}

	@PutMapping("/actualiza")
	public ResponseEntity<SolicitudDto> actualizaSolicitud(
		@RequestBody SolicitudDto solicitudDto) {
		logger.info("SolicitudController:::::::actualizaSolicitud");
		Solicitud solicitud = new Solicitud(solicitudDto);
		solicitudDto = new SolicitudDto(solicitudService.actualizaSolicitud(solicitud));
		logger.info("Solicitud actualizada: " + solicitud.toString());
		return new ResponseEntity<SolicitudDto>(solicitudDto, HttpStatus.CREATED);
	}

}
