/**
 * UUIDGenerator.java Fecha de creación: 14 mar. 2022, 14:59:24 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.util;

import java.security.SecureRandom;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class UUIDGenerator {

	private static volatile SecureRandom numberGenerator;

	private static final long MSB = 0x8000000000000000L;

	public static String generateUUID() {
		SecureRandom sr = numberGenerator;
		if (sr == null)
			numberGenerator = sr = new SecureRandom();
		return Long.toHexString(MSB | sr.nextLong()) + Long.toHexString(MSB | sr.nextLong());
	}

}
