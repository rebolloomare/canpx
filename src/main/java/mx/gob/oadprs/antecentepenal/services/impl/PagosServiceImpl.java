/**
 * PagosServiceImpl.java Fecha de creación: 9 mar. 2022, 23:51:31 Copyright (c) 2022
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
import mx.gob.oadprs.antecentepenal.dtos.PagosDto;
import mx.gob.oadprs.antecentepenal.model.Pagos;
import mx.gob.oadprs.antecentepenal.repositories.PagosRepository;
import mx.gob.oadprs.antecentepenal.services.PagoService;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Service
public class PagosServiceImpl implements PagoService {

	private static final Logger logger = LoggerFactory.getLogger(PagosServiceImpl.class);

	@Autowired
	private PagosRepository pagosRepository;

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.PagoService#registraPago(mx.gob.oadprs.
	 * antecentepenal.model.PagoDto)
	 */
	@Override
	public Pagos registraPago(PagosDto pagoDto) {
		logger.info("PagosServiceImpl:::::::::::registraPago");
		Pagos pago = new Pagos(pagoDto);
		logger.info("valors: " + pago.toString());
		return pagosRepository.save(pago);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.PagoService#obtienePagoById(java.lang.String)
	 */
	@Override
	public Pagos obtienePagoById(String folio) {
		logger.info("PagosServiceImpl::::::::::obtienePagoById");
		logger.info("folio: " + folio);
		return pagosRepository.findById(Integer.parseInt(folio)).orElse(null);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.PagoService#obtienePagos()
	 */
	@Override
	public List<Pagos> obtienePagos() {
		logger.info("PagosServiceImpl:::::::::::obtienePagos");
		List<Pagos> listaPagos = new ArrayList<>();
		pagosRepository.findAll().forEach(listaPagos::add);
		logger.info("tamanio de la lista de pagos: " + listaPagos.size());
		return listaPagos;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.antecentepenal.services.PagoService#eliminaPagoById(java.lang.String)
	 */
	@Override
	public String eliminaPagoById(String folio) {
		logger.info("folio a eliminar: " + folio);
		pagosRepository.deleteById(Integer.parseInt(folio));
		return folio;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.antecentepenal.services.PagoService#actualizaPago(mx.gob.oadprs.
	 * antecentepenal.model.Pago)
	 */
	@Override
	public Pagos actualizaPago(Pagos pago) {
		Pagos pagoExistente = pagosRepository.findById(pago.getFolio()).orElse(null);
		pagoExistente.setFolio(pago.getFolio());
		return pagosRepository.save(pagoExistente);
	}

}
