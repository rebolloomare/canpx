/**
 * CatalogosController.java Fecha de creación: 22 feb. 2022, 10:54:38 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.controllers;

import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
import mx.gob.oadprs.antecentepenal.dtos.EstadosDto;
import mx.gob.oadprs.antecentepenal.dtos.EstatusResolucionDto;
import mx.gob.oadprs.antecentepenal.dtos.EstatusSolicitudDto;
import mx.gob.oadprs.antecentepenal.dtos.IncidenciasDto;
import mx.gob.oadprs.antecentepenal.dtos.InstitucionesCertificadasDto;
import mx.gob.oadprs.antecentepenal.dtos.ParametrosDocDto;
import mx.gob.oadprs.antecentepenal.dtos.RazonSolicitudDto;
import mx.gob.oadprs.antecentepenal.dtos.TipoResolucionDto;
import mx.gob.oadprs.antecentepenal.model.catalogos.Estados;
import mx.gob.oadprs.antecentepenal.model.catalogos.EstatusResolucion;
import mx.gob.oadprs.antecentepenal.model.catalogos.EstatusSolicitud;
import mx.gob.oadprs.antecentepenal.model.catalogos.Incidencias;
import mx.gob.oadprs.antecentepenal.model.catalogos.InstitucionesCertificadas;
import mx.gob.oadprs.antecentepenal.model.catalogos.ParametrosDoc;
import mx.gob.oadprs.antecentepenal.model.catalogos.RazonSolicitud;
import mx.gob.oadprs.antecentepenal.model.catalogos.TipoResolucion;
import mx.gob.oadprs.antecentepenal.services.CatalogosService;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@RestController
@RequestMapping("/catalogo")
@Tag(name = "Catalogos", description = "API de Catalogos")
public class CatalogosController {

	private static final Logger logger = LoggerFactory.getLogger(CatalogosController.class);

	@Autowired
	private CatalogosService catalogosService;

	@GetMapping("/estados")
	@Operation(summary = "Obtiene la lista de Estados",
		description = "Obtiene la lista completa de Estados de la República",
		tags = { "EstadosDto" })
	@ApiResponses(
		value = {
			@ApiResponse(responseCode = "200", description = "Operación exitosa",
				content = @Content(mediaType = "application/json",
					array = @ArraySchema(
						schema = @Schema(implementation = EstadosDto.class)))),
			@ApiResponse(responseCode = "404", description = "No se encontraron registros",
				content = @Content),
			@ApiResponse(description = "Error en el Servidor", responseCode = "500",
				content = @Content) })
	public ResponseEntity<List<EstadosDto>> obtieneListaEstados() {
		logger.info("CatalogosController:::::getEstados");
		List<Estados> listaEstados = catalogosService.estadosList();
		logger.info("Obtiene la lista de estados con: ", listaEstados.size());
		List<EstadosDto> listaEstadosDto =
			listaEstados.stream().map(EstadosDto::new).collect(Collectors.toList());
		return new ResponseEntity<List<EstadosDto>>(listaEstadosDto, HttpStatus.OK);
	}

	@GetMapping("/estado/{id}")
	@Operation(summary = "Encontrar estado por Id", description = "Obtiene estado por Id",
		tags = { "EstadosDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				schema = @Schema(implementation = EstadosDto.class))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros") })
	public ResponseEntity<EstadosDto> obtieneEstado(@Parameter(
		description = "Id no puede estar vacio.", required = true) @PathVariable int id) {
		logger.info("CatalogosController::::::::::getEstado");
		Estados estado = catalogosService.obtieneEstado(id);
		logger.info("Obtiene el estado: " + estado.getNombreEstado() + " por id: " + id);
		EstadosDto estadoDto = new EstadosDto(estado);
		return new ResponseEntity<EstadosDto>(estadoDto, HttpStatus.OK);
	}

	@GetMapping("/estatusResolucion")
	@Operation(summary = "Obtiene la lista de estatus de resolución",
		description = "Obtiene la lista completa de estatus de resolución",
		tags = { "EstatusResolucionDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				array = @ArraySchema(
					schema = @Schema(implementation = EstatusResolucionDto.class)))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros",
			content = @Content),
		@ApiResponse(description = "Error en el Servidor", responseCode = "500",
			content = @Content) })
	public ResponseEntity<List<EstatusResolucionDto>> obtieneListaEstatusResolucion() {
		logger.info("CatalogosController::::::::::obtieneListaEstatusResolucion");
		List<EstatusResolucion> listaEstatusResolucion =
			catalogosService.obtieneListaEstatusResolucion();
		logger.info("Obtiene la lista de estatus de resolucion de la solicitud con : "
			+ listaEstatusResolucion.size());
		List<EstatusResolucionDto> listaEstatusResolucionDto = listaEstatusResolucion.stream()
			.map(EstatusResolucionDto::new)
			.collect(Collectors.toList());
		return new ResponseEntity<List<EstatusResolucionDto>>(listaEstatusResolucionDto,
			HttpStatus.OK);
	}

	@GetMapping("/estatusResolucion/{id}")
	@Operation(summary = "Encontrar estatus de resolución por Id",
		description = "Obtiene estatus de resolución por Id",
		tags = { "EstatusResolucionDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				schema = @Schema(implementation = EstatusResolucionDto.class))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros") })
	public ResponseEntity<EstatusResolucionDto> obtieneEstatusResolucion(@Parameter(
		description = "Id no puede estar vacio.", required = true) @PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneEstatusResolucion");
		EstatusResolucion estatusResolucion = catalogosService.obtieneEstatusResolucion(id);
		logger.info("Obtiene el estatus de la solicitud: "
			+ estatusResolucion.getIdEstatusResolucion() + " por id: " + id);
		EstatusResolucionDto estatusResolucionDto =
			new EstatusResolucionDto(estatusResolucion);
		return new ResponseEntity<EstatusResolucionDto>(estatusResolucionDto, HttpStatus.OK);
	}

	@GetMapping("/estatusSolicitud")
	@Operation(summary = "Obtiene la lista de estatus de la solicitud",
		description = "Obtiene la lista completa de estatus de la solicitud",
		tags = { "EstatusSolicitudDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				array = @ArraySchema(
					schema = @Schema(implementation = EstatusSolicitudDto.class)))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros",
			content = @Content),
		@ApiResponse(description = "Error en el Servidor", responseCode = "500",
			content = @Content) })
	public ResponseEntity<List<EstatusSolicitudDto>> obtieneListaEstatusSolicitud() {
		logger.info("CatalogosController::::::::::obtieneListaEstatusSolicitud");
		List<EstatusSolicitud> listaEstatusSolicitud =
			catalogosService.obtieneListaEstatusSolicitud();
		logger.info("Obtiene la lista de estatus de la solicitud con : "
			+ listaEstatusSolicitud.size());
		List<EstatusSolicitudDto> listaEstatusSolicitudDto = listaEstatusSolicitud.stream()
			.map(EstatusSolicitudDto::new)
			.collect(Collectors.toList());
		return new ResponseEntity<List<EstatusSolicitudDto>>(listaEstatusSolicitudDto,
			HttpStatus.OK);
	}

	@GetMapping("/estatusSolicitud/{id}")
	@Operation(summary = "Encontrar estatus de solicitud por Id",
		description = "Obtiene estatus de solicitud por Id", tags = { "EstatusSolicitudDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				schema = @Schema(implementation = EstatusSolicitudDto.class))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros") })
	public ResponseEntity<EstatusSolicitudDto> obtieneEstatusSolicitud(@Parameter(
		description = "Id no puede estar vacio.", required = true) @PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneEstatusSolicitud");
		EstatusSolicitud estatusSolicitud = catalogosService.obtieneEstatusSolicitud(id);
		logger.info("Obtiene el estatus de la solicitud: "
			+ estatusSolicitud.getIdEstatusSolicitud() + " por id: " + id);
		EstatusSolicitudDto estatusSolicitudDto = new EstatusSolicitudDto(estatusSolicitud);
		return new ResponseEntity<EstatusSolicitudDto>(estatusSolicitudDto, HttpStatus.OK);
	}

	@GetMapping("/incidencias")
	@Operation(summary = "Obtiene la lista de incidencias",
		description = "Obtiene la lista completa de incidencias", tags = { "IncidenciasDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				array = @ArraySchema(
					schema = @Schema(implementation = IncidenciasDto.class)))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros",
			content = @Content),
		@ApiResponse(description = "Error en el Servidor", responseCode = "500",
			content = @Content) })
	public ResponseEntity<List<IncidenciasDto>> obtieneListaIncidencias() {
		logger.info("CatalogosController::::::::::obtieneListaIncidencias");
		List<Incidencias> listaIncidencias = catalogosService.obtieneListaIncidencias();
		logger.info("Obtiene la lista de Incidencias con : " + listaIncidencias.size());
		List<IncidenciasDto> listaIncidenciasDto =
			listaIncidencias.stream().map(IncidenciasDto::new).collect(Collectors.toList());
		return new ResponseEntity<List<IncidenciasDto>>(listaIncidenciasDto, HttpStatus.OK);
	}

	@GetMapping("/incidencia/{id}")
	@Operation(summary = "Encontrar Incidencia por Id",
		description = "Obtiene incidencia por Id", tags = { "IncidenciasDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				schema = @Schema(implementation = IncidenciasDto.class))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros") })
	public ResponseEntity<IncidenciasDto> obtieneIncidencia(@Parameter(
		description = "Id no puede estar vacio.", required = true) @PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneEstatusSolicitud");
		Incidencias incidencias = catalogosService.obtieneIncidencia(id);
		logger.info(
			"Obtiene la Incidencia : " + incidencias.getIdIncidencia() + " por id: " + id);
		IncidenciasDto incidenciasDto = new IncidenciasDto(incidencias);
		return new ResponseEntity<IncidenciasDto>(incidenciasDto, HttpStatus.OK);
	}

	@GetMapping("/institucionesCertificadas")
	@Operation(summary = "Obtiene la lista de instituciones certificadas",
		description = "Obtiene la lista completa de instituciones certificadas",
		tags = { "InstitucionesCertificadasDto" })
	@ApiResponses(
		value = {
			@ApiResponse(responseCode = "200", description = "Operación exitosa",
				content = @Content(mediaType = "application/json", array = @ArraySchema(
					schema = @Schema(implementation = InstitucionesCertificadasDto.class)))),
			@ApiResponse(responseCode = "404", description = "No se encontraron registros",
				content = @Content),
			@ApiResponse(description = "Error en el Servidor", responseCode = "500",
				content = @Content) })
	public ResponseEntity<List<InstitucionesCertificadasDto>> obtieneListaInstitucionesCertificadas() {
		logger.info("CatalogosController::::::::::obtieneListaInstitucionesCertificadas");
		List<InstitucionesCertificadas> listaInstitucionesCertificadas =
			catalogosService.obtieneListaInstitucionesCertificadas();
		logger.info("Obtiene la lista de Instituciones Certificadas con : "
			+ listaInstitucionesCertificadas.size());
		List<InstitucionesCertificadasDto> listaInstitucionesCertificadasDto =
			listaInstitucionesCertificadas.stream()
				.map(InstitucionesCertificadasDto::new)
				.collect(Collectors.toList());
		return new ResponseEntity<List<InstitucionesCertificadasDto>>(
			listaInstitucionesCertificadasDto, HttpStatus.OK);
	}

	@GetMapping("/institucionCertificada/{id}")
	@Operation(summary = "Encontrar Institución Certificada por Id",
		description = "Obtiene Institución Certificada por Id",
		tags = { "InstitucionesCertificadasDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				schema = @Schema(implementation = InstitucionesCertificadasDto.class))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros") })
	public ResponseEntity<InstitucionesCertificadasDto> obtieneInstitucionCertificada(
		@Parameter(description = "Id no puede estar vacio.",
			required = true) @PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneInstitucionCertificada");
		InstitucionesCertificadas institucionCertificada =
			catalogosService.obtieneInstitucionCertificada(id);
		logger.info("Obtiene obtiene Institucion Certificada : "
			+ institucionCertificada.getInstitucionesCertificadas() + " por id: " + id);
		InstitucionesCertificadasDto institucionCertificadaDto =
			new InstitucionesCertificadasDto(institucionCertificada);
		return new ResponseEntity<InstitucionesCertificadasDto>(institucionCertificadaDto,
			HttpStatus.OK);
	}

	@GetMapping("/parametrosDoc")
	@Operation(summary = "Obtiene la lista de parámetros",
		description = "Obtiene la lista completa de parámetros", tags = { "ParametrosDocDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				array = @ArraySchema(
					schema = @Schema(implementation = ParametrosDocDto.class)))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros",
			content = @Content),
		@ApiResponse(description = "Error en el Servidor", responseCode = "500",
			content = @Content) })
	public ResponseEntity<List<ParametrosDocDto>> obtieneListaParametrosDoc() {
		logger.info("CatalogosController::::::::::obtieneListaParametrosDoc");
		List<ParametrosDoc> listaParametrosDoc = catalogosService.obtieneListaParametrosDoc();
		logger.info(
			"Obtiene la lista de parametros de documentos con : " + listaParametrosDoc.size());
		List<ParametrosDocDto> listaParametrosDocDto = listaParametrosDoc.stream()
			.map(ParametrosDocDto::new)
			.collect(Collectors.toList());
		return new ResponseEntity<List<ParametrosDocDto>>(listaParametrosDocDto,
			HttpStatus.OK);
	}

	@GetMapping("/parametrosDoc/{id}")
	@Operation(summary = "Encontrar parámetro por Id",
		description = "Obtiene parámetro por Id", tags = { "ParametrosDocDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				schema = @Schema(implementation = ParametrosDocDto.class))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros") })
	public ResponseEntity<ParametrosDocDto> obtieneParametroDoc(@Parameter(
		description = "Id no puede estar vacio.", required = true) @PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneParametroDoc");
		ParametrosDoc parametroDoc = catalogosService.obtieneParametroDoc(id);
		logger.info("Obtiene obtiene Parametro del Doc : " + parametroDoc.getParametrosDoc()
			+ " por id: " + id);
		ParametrosDocDto parametroDocDto = new ParametrosDocDto(parametroDoc);
		return new ResponseEntity<ParametrosDocDto>(parametroDocDto, HttpStatus.OK);
	}

	@GetMapping("/razon")
	@Operation(summary = "Obtiene la lista de razones",
		description = "Obtiene la lista completa de razones", tags = { "RazonSolicitudDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				array = @ArraySchema(
					schema = @Schema(implementation = RazonSolicitudDto.class)))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros",
			content = @Content),
		@ApiResponse(description = "Error en el Servidor", responseCode = "500",
			content = @Content) })
	public ResponseEntity<List<RazonSolicitudDto>> obtieneListaRazonSolicitud() {
		logger.info("CatalogosController::::::::::obtieneListaRazonSolicitud");
		List<RazonSolicitud> listaRazonSolicitud =
			catalogosService.obtieneListaRazonSolicitud();
		logger.info("Obtiene la lista de razones con : " + listaRazonSolicitud.size());
		List<RazonSolicitudDto> listaRazonSolicitudDto = listaRazonSolicitud.stream()
			.map(RazonSolicitudDto::new)
			.collect(Collectors.toList());
		return new ResponseEntity<List<RazonSolicitudDto>>(listaRazonSolicitudDto,
			HttpStatus.OK);
	}

	@GetMapping("/razon/{id}")
	@Operation(summary = "Encontrar parametro por Id",
		description = "Obtiene Razón de la Solicitud por Id", tags = { "RazonSolicitudDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				schema = @Schema(implementation = RazonSolicitudDto.class))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros") })
	public ResponseEntity<RazonSolicitudDto> obtieneRazonSolicitud(@Parameter(
		description = "Id no puede estar vacio.", required = true) @PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneRazonSolicitud");
		RazonSolicitud razonSolicitud = catalogosService.obtieneRazonSolicitud(id);
		logger.info("Obtiene obtiene razon de la solicitud : "
			+ razonSolicitud.getIdRazonSolicitud() + " por id: " + id);
		RazonSolicitudDto razonSolicitudDto = new RazonSolicitudDto(razonSolicitud);
		return new ResponseEntity<RazonSolicitudDto>(razonSolicitudDto, HttpStatus.OK);
	}

	@GetMapping("/tipoResolucion")
	@Operation(summary = "Obtiene la lista de tipos de resolución",
		description = "Obtiene la lista completa de tipos de resolución",
		tags = { "TipoResolucionDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				array = @ArraySchema(
					schema = @Schema(implementation = TipoResolucionDto.class)))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros",
			content = @Content),
		@ApiResponse(description = "Error en el Servidor", responseCode = "500",
			content = @Content) })
	public ResponseEntity<List<TipoResolucionDto>> obtieneListaTipoResolucion() {
		logger.info("CatalogosController::::::::::listaTipoResolucion");
		List<TipoResolucion> listaTipoResolucion =
			catalogosService.obtieneListaTipoResolucion();
		logger.info("Obtiene la lista de Tipo Resolucion con : " + listaTipoResolucion.size());
		List<TipoResolucionDto> listaTipoResolucionDto = listaTipoResolucion.stream()
			.map(TipoResolucionDto::new)
			.collect(Collectors.toList());
		return new ResponseEntity<List<TipoResolucionDto>>(listaTipoResolucionDto,
			HttpStatus.OK);
	}

	@GetMapping("/tipoResolucion/{id}")
	@Operation(summary = "Encontrar Tipo de Resolución por Id",
		description = "Obtiene Tipo de Resolución por Id", tags = { "TipoResolucionDto" })
	@ApiResponses(value = {
		@ApiResponse(responseCode = "200", description = "Operación exitosa",
			content = @Content(mediaType = "application/json",
				schema = @Schema(implementation = TipoResolucionDto.class))),
		@ApiResponse(responseCode = "404", description = "No se encontraron registros") })
	public ResponseEntity<TipoResolucionDto> obtieneTipoResolucion(@Parameter(
		description = "Id no puede estar vacio.", required = true) @PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneTipoResolucion");
		TipoResolucion tipoResolucion = catalogosService.obtieneTipoResolucion(id);
		logger.info("Obtiene obtiene Tipo Resolucion : " + tipoResolucion.getIdTipoResolucion()
			+ " por id: " + id);
		TipoResolucionDto tipoResolucionDto = new TipoResolucionDto(tipoResolucion);
		return new ResponseEntity<TipoResolucionDto>(tipoResolucionDto, HttpStatus.OK);
	}

}
