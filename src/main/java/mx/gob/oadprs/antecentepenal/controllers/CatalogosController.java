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
import org.springframework.web.bind.annotation.RestController;
import mx.gob.oadprs.antecentepenal.dtos.EstadoDto;
import mx.gob.oadprs.antecentepenal.dtos.SexoDto;
import mx.gob.oadprs.antecentepenal.model.catalog.Estado;
import mx.gob.oadprs.antecentepenal.model.catalog.Sexo;
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

	@GetMapping(path = "/estado")
	public List<EstadoDto> getEstados() {
		logger.info("CatalogosController:::::getEstados");
		List<Estado> listaEstados = catalogosService.estadosList();
		return listaEstados.stream().map(EstadoDto::new).collect(Collectors.toList());
	}

	@GetMapping("/sexo")
	public List<SexoDto> getSexo() {
		logger.info("CatalogosController:::::getSexo");
		List<Sexo> listaSexo = catalogosService.sexoList();
		return listaSexo.stream().map(SexoDto::new).collect(Collectors.toList());
	}

}
