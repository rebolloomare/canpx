/**
 * EstadoService.java Fecha de creación: 22 feb. 2022, 11:06:43 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.services;

import java.util.List;
import mx.gob.oadprs.antecentepenal.model.catalogos.Estados;
import mx.gob.oadprs.antecentepenal.model.catalogos.EstatusResolucion;
import mx.gob.oadprs.antecentepenal.model.catalogos.EstatusSolicitud;
import mx.gob.oadprs.antecentepenal.model.catalogos.Incidencias;
import mx.gob.oadprs.antecentepenal.model.catalogos.InstitucionesCertificadas;
import mx.gob.oadprs.antecentepenal.model.catalogos.ParametrosDoc;
import mx.gob.oadprs.antecentepenal.model.catalogos.RazonSolicitud;
import mx.gob.oadprs.antecentepenal.model.catalogos.TipoResolucion;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public interface CatalogosService {

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<Estados> estadosList();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @return
	 */
	Estados obtieneEstado(int id);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<EstatusResolucion> obtieneListaEstatusResolucion();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @return
	 */
	EstatusResolucion obtieneEstatusResolucion(int id);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<EstatusSolicitud> obtieneListaEstatusSolicitud();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @return
	 */
	EstatusSolicitud obtieneEstatusSolicitud(int id);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<Incidencias> obtieneListaIncidencias();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @return
	 */
	Incidencias obtieneIncidencia(int id);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<InstitucionesCertificadas> obtieneListaInstitucionesCertificadas();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @return
	 */
	InstitucionesCertificadas obtieneInstitucionCertificada(int id);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<ParametrosDoc> obtieneListaParametrosDoc();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @return
	 */
	ParametrosDoc obtieneParametroDoc(int id);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<RazonSolicitud> obtieneListaRazonSolicitud();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @return
	 */
	RazonSolicitud obtieneRazonSolicitud(int id);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<TipoResolucion> obtieneListaTipoResolucion();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @return
	 */
	TipoResolucion obtieneTipoResolucion(int id);

}
