/**
 * SolicitudServiceImpl.java Fecha de creación: 7 mar. 2022, 13:55:27 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.gob.oadprs.antecentepenal.dtos.SolicitudDto;
import mx.gob.oadprs.antecentepenal.model.Solicitud;
import mx.gob.oadprs.antecentepenal.repositories.SolicitudRepository;
import mx.gob.oadprs.antecentepenal.services.SolicitudService;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Service
public class SolicitudServiceImpl implements SolicitudService {

	private static final Logger logger = LoggerFactory.getLogger(SolicitudServiceImpl.class);

	@Autowired
	private SolicitudRepository solicitudRepository;

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.SolicitudService#registraSolicitud(java.util.
	 * Optional)
	 */
	@Override
	public Solicitud registraSolicitud(SolicitudDto solicitudDto) {
		logger.info("SolicitudServiceImpl::::::::::::::::::registraSolicitud");
		Solicitud solicitud = new Solicitud(solicitudDto);
		logger.info("valores: {}", solicitud.toString());
		return solicitudRepository.save(solicitud);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.SolicitudService#obtieneSolicitudById(int)
	 */
	@Override
	public Solicitud obtieneSolicitudById(String folio) {
		logger.info("SolicitudServiceImpl::::::::::::::::::obtieneSolicitudById");
		logger.info("folio: {}", folio);
		return solicitudRepository.findById(Integer.parseInt(folio)).orElse(null);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.SolicitudService#obtieneSolicitudes()
	 */
	@Override
	public List<Solicitud> obtieneSolicitudes() {
		logger.info("SolicitudServiceImpl::::::::::::::::::obtieneSolicitudById");
		List<Solicitud> listaSolicitudes = new ArrayList<>();
		solicitudRepository.findAll().forEach(listaSolicitudes::add);
		logger.info("tamanio de la lista de solicitudes: {}", listaSolicitudes.size());
		return listaSolicitudes;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.SolicitudService#eliminarSolicitudById(int)
	 */
	@Override
	public String eliminarSolicitudById(String folio) {
		logger.info("folio a eliminar: {}", folio);
		solicitudRepository.deleteById(Integer.parseInt(folio));
		return folio;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.SolicitudService#actualizaSolicitudById(int)
	 */
	@Override
	public Solicitud actualizaSolicitud(Solicitud solicitud) {
		Solicitud solicitudExistente =
			solicitudRepository.findById(solicitud.getIdEstatusSolicitud()).orElse(null);
		// setters
		return solicitudRepository.save(solicitudExistente);
	}

}
