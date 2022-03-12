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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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
public class CatalogosController {

	private static final Logger logger = LoggerFactory.getLogger(CatalogosController.class);

	@Autowired
	private CatalogosService catalogosService;

	@GetMapping("/estado")
	public List<EstadosDto> obtieneListaEstados() {
		logger.info("CatalogosController:::::getEstados");
		List<Estados> listaEstados = catalogosService.estadosList();
		logger.info("Obtiene la lista de estados con: " + listaEstados.size() + " elementos");
		return listaEstados.stream().map(EstadosDto::new).collect(Collectors.toList());
	}

	@GetMapping("/estado/{id}")
	public EstadosDto obtieneEstado(@PathVariable int id) {
		logger.info("CatalogosController::::::::::getEstado");
		Estados estado = catalogosService.obtieneEstado(id);
		logger.info("Obtiene el estado: " + estado.getNombreEstado() + " por id: " + id);
		EstadosDto estadoDto = new EstadosDto(estado);
		return estadoDto;
	}

	@GetMapping("/resolucion")
	public List<EstatusResolucionDto> obtieneListaEstatusResolucion() {
		logger.info("CatalogosController::::::::::obtieneListaEstatusResolucion");
		List<EstatusResolucion> listaEstatusResolucion =
			catalogosService.obtieneListaEstatusResolucion();
		logger.info("Obtiene la lista de estatus de resolucion de la solicitud con : "
			+ listaEstatusResolucion.size());
		return listaEstatusResolucion.stream()
			.map(EstatusResolucionDto::new)
			.collect(Collectors.toList());
	}

	@GetMapping("/resolucion/{id}")
	public EstatusResolucionDto obtieneEstatusResolucion(@PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneEstatusResolucion");
		EstatusResolucion estatusResolucion = catalogosService.obtieneEstatusResolucion(id);
		logger.info("Obtiene el estatus de la solicitud: "
			+ estatusResolucion.getIdEstatusResolucion() + " por id: " + id);
		EstatusResolucionDto estatusResolucionDto =
			new EstatusResolucionDto(estatusResolucion);
		return estatusResolucionDto;
	}

	@GetMapping("/estatus")
	public List<EstatusSolicitudDto> obtieneListaEstatusSolicitud() {
		logger.info("CatalogosController::::::::::obtieneListaEstatusSolicitud");
		List<EstatusSolicitud> listaEstatusSolicitud =
			catalogosService.obtieneListaEstatusSolicitud();
		logger.info("Obtiene la lista de estatus de la solicitud con : "
			+ listaEstatusSolicitud.size());
		return listaEstatusSolicitud.stream()
			.map(EstatusSolicitudDto::new)
			.collect(Collectors.toList());
	}

	@GetMapping("/estatus/{id}")
	public EstatusSolicitudDto obtieneEstatusSolicitud(@PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneEstatusSolicitud");
		EstatusSolicitud estatusSolicitud = catalogosService.obtieneEstatusSolicitud(id);
		logger.info("Obtiene el estatus de la solicitud: "
			+ estatusSolicitud.getIdEstatusSolicitud() + " por id: " + id);
		EstatusSolicitudDto estatusSolicitudDto = new EstatusSolicitudDto(estatusSolicitud);
		return estatusSolicitudDto;
	}

	@GetMapping("/incidencias")
	public List<IncidenciasDto> obtieneListaIncidencias() {
		logger.info("CatalogosController::::::::::obtieneListaIncidencias");
		List<Incidencias> listaIncidencias = catalogosService.obtieneListaIncidencias();
		logger.info("Obtiene la lista de Incidencias con : " + listaIncidencias.size());
		return listaIncidencias.stream().map(IncidenciasDto::new).collect(Collectors.toList());
	}

	@GetMapping("/incidencia/{id}")
	public IncidenciasDto obtieneIncidencia(@PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneEstatusSolicitud");
		Incidencias incidencias = catalogosService.obtieneIncidencia(id);
		logger.info(
			"Obtiene la Incidencia : " + incidencias.getIdIncidencia() + " por id: " + id);
		IncidenciasDto incidenciasDto = new IncidenciasDto(incidencias);
		return incidenciasDto;
	}

	@GetMapping("/institucionCertificada")
	public List<InstitucionesCertificadasDto> obtieneListaInstitucionesCertificadas() {
		logger.info("CatalogosController::::::::::obtieneListaInstitucionesCertificadas");
		List<InstitucionesCertificadas> listaInstitucionesCertificadas =
			catalogosService.obtieneListaInstitucionesCertificadas();
		logger.info("Obtiene la lista de Instituciones Certificadas con : "
			+ listaInstitucionesCertificadas.size());
		return listaInstitucionesCertificadas.stream()
			.map(InstitucionesCertificadasDto::new)
			.collect(Collectors.toList());
	}

	@GetMapping("/institucionCertificada/{id}")
	public InstitucionesCertificadasDto obtieneInstitucionCertificada(@PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneInstitucionCertificada");
		InstitucionesCertificadas institucionCertificada =
			catalogosService.obtieneInstitucionCertificada(id);
		logger.info("Obtiene obtiene Institucion Certificada : "
			+ institucionCertificada.getInstitucionesCertificadas() + " por id: " + id);
		InstitucionesCertificadasDto institucionCertificadaDto =
			new InstitucionesCertificadasDto(institucionCertificada);
		return institucionCertificadaDto;
	}

	@GetMapping("/parametrosDoc")
	public List<ParametrosDocDto> obtieneListaParametrosDoc() {
		logger.info("CatalogosController::::::::::obtieneListaParametrosDoc");
		List<ParametrosDoc> listaParametrosDoc = catalogosService.obtieneListaParametrosDoc();
		logger.info(
			"Obtiene la lista de parametros de documentos con : " + listaParametrosDoc.size());
		return listaParametrosDoc.stream()
			.map(ParametrosDocDto::new)
			.collect(Collectors.toList());
	}

	@GetMapping("/parametrosDoc/{id}")
	public ParametrosDocDto obtieneParametroDoc(@PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneParametroDoc");
		ParametrosDoc parametroDoc = catalogosService.obtieneParametroDoc(id);
		logger.info("Obtiene obtiene Parametro del Doc : " + parametroDoc.getParametrosDoc()
			+ " por id: " + id);
		ParametrosDocDto parametroDocDto = new ParametrosDocDto(parametroDoc);
		return parametroDocDto;
	}

	@GetMapping("/razon")
	public List<RazonSolicitudDto> obtieneListaRazonSolicitud() {
		logger.info("CatalogosController::::::::::obtieneListaRazonSolicitud");
		List<RazonSolicitud> listaRazonSolicitud =
			catalogosService.obtieneListaRazonSolicitud();
		logger.info("Obtiene la lista de razones con : " + listaRazonSolicitud.size());
		return listaRazonSolicitud.stream()
			.map(RazonSolicitudDto::new)
			.collect(Collectors.toList());
	}

	@GetMapping("/razon/{id}")
	public RazonSolicitudDto obtieneRazonSolicitud(@PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneRazonSolicitud");
		RazonSolicitud razonSolicitud = catalogosService.obtieneRazonSolicitud(id);
		logger.info("Obtiene obtiene razon de la solicitud : "
			+ razonSolicitud.getIdRazonSolicitud() + " por id: " + id);
		RazonSolicitudDto razonSolicitudDto = new RazonSolicitudDto(razonSolicitud);
		return razonSolicitudDto;
	}

	@GetMapping("/resolucion")
	public List<TipoResolucionDto> obtieneListaTipoResolucion() {
		logger.info("CatalogosController::::::::::listaTipoResolucion");
		List<TipoResolucion> listaTipoResolucion =
			catalogosService.obtieneListaTipoResolucion();
		logger.info("Obtiene la lista de Tipo Resolucion con : " + listaTipoResolucion.size());
		return listaTipoResolucion.stream()
			.map(TipoResolucionDto::new)
			.collect(Collectors.toList());
	}

	@GetMapping("/resolucion/{id}")
	public TipoResolucionDto obtieneTipoResolucion(@PathVariable int id) {
		logger.info("CatalogosController::::::::::obtieneTipoResolucion");
		TipoResolucion tipoResolucion = catalogosService.obtieneTipoResolucion(id);
		logger.info("Obtiene obtiene Tipo Resolucion : " + tipoResolucion.getIdTipoResolucion()
			+ " por id: " + id);
		TipoResolucionDto tipoResolucionDto = new TipoResolucionDto(tipoResolucion);
		return tipoResolucionDto;
	}

}
