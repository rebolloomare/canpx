/**
 * CatalogosServiceImpl.java Fecha de creación: 22 feb. 2022, 12:06:22 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.gob.oadprs.antecentepenal.model.catalogos.Estados;
import mx.gob.oadprs.antecentepenal.model.catalogos.EstatusResolucion;
import mx.gob.oadprs.antecentepenal.model.catalogos.EstatusSolicitud;
import mx.gob.oadprs.antecentepenal.model.catalogos.Incidencias;
import mx.gob.oadprs.antecentepenal.model.catalogos.Inciso;
import mx.gob.oadprs.antecentepenal.model.catalogos.InstitucionesCertificadas;
import mx.gob.oadprs.antecentepenal.model.catalogos.ParametrosDoc;
import mx.gob.oadprs.antecentepenal.model.catalogos.RazonSolicitud;
import mx.gob.oadprs.antecentepenal.model.catalogos.TipoResolucion;
import mx.gob.oadprs.antecentepenal.repositories.catalogos.EstadoRepository;
import mx.gob.oadprs.antecentepenal.repositories.catalogos.EstatusResolucionRepository;
import mx.gob.oadprs.antecentepenal.repositories.catalogos.EstatusSolicitudRepository;
import mx.gob.oadprs.antecentepenal.repositories.catalogos.IncidenciasRepository;
import mx.gob.oadprs.antecentepenal.repositories.catalogos.IncisoRepository;
import mx.gob.oadprs.antecentepenal.repositories.catalogos.InstitucionesCertificadasRepository;
import mx.gob.oadprs.antecentepenal.repositories.catalogos.ParametrosDocRepository;
import mx.gob.oadprs.antecentepenal.repositories.catalogos.RazonSolicitudRepository;
import mx.gob.oadprs.antecentepenal.repositories.catalogos.TipoResolucionRepository;
import mx.gob.oadprs.antecentepenal.services.CatalogosService;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Service
public class CatalogosServiceImpl implements CatalogosService {

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private EstatusResolucionRepository estatusResolucionRepository;

	@Autowired
	private EstatusSolicitudRepository estatusSolicitudRepository;

	@Autowired
	private IncidenciasRepository incidenciasRepository;

	@Autowired
	private IncisoRepository incisoRepository;

	@Autowired
	private InstitucionesCertificadasRepository institucionesCertificadasRepository;

	@Autowired
	private ParametrosDocRepository parametrosDocRepository;

	@Autowired
	private RazonSolicitudRepository razonSolicitudRepository;

	@Autowired
	private TipoResolucionRepository tipoResolucionRepository;

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.CatalogosService#estadosList()
	 */
	@Override
	public List<Estados> estadosList() {
		return estadoRepository.findAll();
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneEstado(int)
	 */
	@Override
	public Estados obtieneEstado(int id) {
		return estadoRepository.getById(id);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneListaEstatusResolucion
	 * ()
	 */
	@Override
	public List<EstatusResolucion> obtieneListaEstatusResolucion() {
		return estatusResolucionRepository.findAll();
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneEstatusResolucion(int)
	 */
	@Override
	public EstatusResolucion obtieneEstatusResolucion(int id) {
		return estatusResolucionRepository.getById(id);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneListaEstatusSolicitud(
	 * )
	 */
	@Override
	public List<EstatusSolicitud> obtieneListaEstatusSolicitud() {
		return estatusSolicitudRepository.findAll();
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneEstatusSolicitud(int)
	 */
	@Override
	public EstatusSolicitud obtieneEstatusSolicitud(int id) {
		return estatusSolicitudRepository.getById(id);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneListaIncidencias()
	 */
	@Override
	public List<Incidencias> obtieneListaIncidencias() {
		return incidenciasRepository.findAll();
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneIncidencia(int)
	 */
	@Override
	public Incidencias obtieneIncidencia(int id) {
		return incidenciasRepository.getById(id);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneListaIncisos()
	 */
	@Override
	public List<Inciso> obtieneListaIncisos() {
		return incisoRepository.findAll();
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneInciso(int)
	 */
	@Override
	public Inciso obtieneInciso(int id) {
		return incisoRepository.getById(id);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.CatalogosService#
	 * obtieneListaInstitucionesCertificadas()
	 */
	@Override
	public List<InstitucionesCertificadas> obtieneListaInstitucionesCertificadas() {
		return institucionesCertificadasRepository.findAll();
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneInstitucionCertificada
	 * (int)
	 */
	@Override
	public InstitucionesCertificadas obtieneInstitucionCertificada(int id) {
		return institucionesCertificadasRepository.getById(null);

	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneListaParametrosDoc()
	 */
	@Override
	public List<ParametrosDoc> obtieneListaParametrosDoc() {
		return parametrosDocRepository.findAll();
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneParametroDoc(int)
	 */
	@Override
	public ParametrosDoc obtieneParametroDoc(int id) {
		return parametrosDocRepository.getById(id);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneListaRazonSolicitud()
	 */
	@Override
	public List<RazonSolicitud> obtieneListaRazonSolicitud() {
		return razonSolicitudRepository.findAll();
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneRazonSolicitud(int)
	 */
	@Override
	public RazonSolicitud obtieneRazonSolicitud(int id) {
		return razonSolicitudRepository.getById(id);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneListaTipoResolucion()
	 */
	@Override
	public List<TipoResolucion> obtieneListaTipoResolucion() {
		return tipoResolucionRepository.findAll();
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.CatalogosService#obtieneTipoResolucion(int)
	 */
	@Override
	public TipoResolucion obtieneTipoResolucion(int id) {
		return tipoResolucionRepository.getById(id);
	}

}
