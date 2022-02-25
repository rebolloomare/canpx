/**
 * CatalogosServiceImpl.java Fecha de creación: 22 feb. 2022, 12:06:22 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.services;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.gob.oadprs.antecentepenal.controllers.CatalogosController;
import mx.gob.oadprs.antecentepenal.model.catalog.Estado;
import mx.gob.oadprs.antecentepenal.model.catalog.Sexo;
import mx.gob.oadprs.antecentepenal.repositories.EstadoRepository;
import mx.gob.oadprs.antecentepenal.repositories.SexoRepository;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Service
public class CatalogosServiceImpl implements CatalogosService {

	private static final Logger logger = LoggerFactory.getLogger(CatalogosController.class);

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private SexoRepository sexoRepository;

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.CatalogosService#estadosList()
	 */
	@Override
	public List<Estado> estadosList() {
		logger.info("CatalogosServiceImpl:::::estadosList");
		List<Estado> estadosList = estadoRepository.findAll();
		logger.info("Catalogo Estados: " + estadosList);
		return estadosList;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.CatalogosService#sexoList()
	 */
	@Override
	public List<Sexo> sexoList() {
		logger.info("CatalogosServiceImpl:::::sexoList");
		return sexoRepository.findAll();
	}

}
