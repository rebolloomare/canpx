/**
 * SolicitudRepository.java Fecha de creación: 7 mar. 2022, 23:28:37 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.gob.oadprs.antecentepenal.model.Solicitud;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {

}
