/**
 * PagoController.java Fecha de creación: 9 mar. 2022, 19:42:40 Copyright (c) 2022 XXXXXXX
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar
 * de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.antecentepenal.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.gob.oadprs.antecentepenal.dtos.PagosDto;
import mx.gob.oadprs.antecentepenal.model.Pagos;
import mx.gob.oadprs.antecentepenal.services.PagoService;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@RestController
@RequestMapping("/pago")
public class PagoController {

	private static Logger logger = LoggerFactory.getLogger(PagoController.class);

	@Autowired
	private PagoService pagoService;

	@PostMapping("/registra")
	public ResponseEntity<PagosDto> registraPago(@RequestBody PagosDto pagoDto) {
		logger.info("PagoController::::::::registraPago");
		Pagos pago = pagoService.registraPago(pagoDto);
		logger.info("Pago Registrado exitosamente");
		pagoDto = new PagosDto(pago);
		return new ResponseEntity<PagosDto>(pagoDto, HttpStatus.CREATED);
	}

	@GetMapping("/consulta/{folio}")
	public ResponseEntity<PagosDto> obtienePagoByFolio(@PathVariable String folio) {
		logger.info("PagoController::::::::obtienePagoByFolio");
		Pagos pago = pagoService.obtienePagoById(folio);

		logger.info("Datos pago: " + pago.toString());
		PagosDto pagoDto = new PagosDto(pago);

		return new ResponseEntity<PagosDto>(pagoDto, HttpStatus.OK);
	}

	@GetMapping("/consulta")
	public ResponseEntity<List<PagosDto>> obtienePagos() {
		logger.info("PagoController:::::::::obtienePagos");
		List<PagosDto> listaPagosDto = new ArrayList<>();
		List<Pagos> listaPagos = pagoService.obtienePagos();
		logger.info("Elementos en la lista de solicitudes: " + listaPagos.size());
		listaPagosDto = listaPagos.stream().map(PagosDto::new).collect(Collectors.toList());
		return new ResponseEntity<List<PagosDto>>(listaPagosDto, HttpStatus.OK);
	}

	@DeleteMapping("/elimina/{folio}")
	public ResponseEntity<String> eliminaPago(@PathVariable String folio) {
		logger.info("PagoController:::::::eliminaPago");
		folio = pagoService.eliminaPagoById(folio);
		logger.info("Folio eliminado: " + folio);
		return new ResponseEntity<String>(folio, HttpStatus.ACCEPTED);
	}

	@PutMapping("/actualiza")
	public ResponseEntity<PagosDto> actualizaPago(@RequestBody PagosDto pagoDto) {
		logger.info("PagoController:::::::::::actualizaPago");
		Pagos pago = new Pagos(pagoDto);
		pagoDto = new PagosDto(pagoService.actualizaPago(pago));
		logger.info("Pago actualizado: " + pagoDto.toString());
		return new ResponseEntity<PagosDto>(pagoDto, HttpStatus.CREATED);
	}

}
