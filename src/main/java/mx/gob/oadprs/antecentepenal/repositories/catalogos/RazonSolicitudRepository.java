/**
 * RazonSolicitudRepository.java Fecha de creación: 10 mar. 2022, 16:45:29 Copyright (c)
 * 2022 XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.repositories.catalogos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.gob.oadprs.antecentepenal.model.catalogos.RazonSolicitud;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Repository
public interface RazonSolicitudRepository extends JpaRepository<RazonSolicitud, Integer> {

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param id
	 * @return
	 */
	List<RazonSolicitud> findByIdInstitucionesCertificadas(int idInstitucionesCertificadas);

}
