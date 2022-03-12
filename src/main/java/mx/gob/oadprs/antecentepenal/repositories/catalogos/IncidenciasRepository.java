/**
 * IncidenciasRepository.java Fecha de creación: 10 mar. 2022, 16:42:47 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.repositories.catalogos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.gob.oadprs.antecentepenal.model.catalogos.Incidencias;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Repository
public interface IncidenciasRepository extends JpaRepository<Incidencias, Integer> {

}
