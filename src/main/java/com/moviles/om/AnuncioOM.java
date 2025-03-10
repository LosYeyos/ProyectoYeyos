package com.moviles.om;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entities.Anuncio;
import com.moviles.model.entities.Movil;
import com.moviles.model.entities.enums.EstadoAnuncio;
import com.moviles.model.entities.enums.EstadoMovil;
import com.moviles.model.entities.enums.TipoCambio;

public class AnuncioOM {

	private MovilOM movilOM;
	
	private List<Movil> moviles;

	public AnuncioOM() {
		super();
		this.movilOM = new MovilOM();
	}
	
	public AnuncioOM(MovilOM movilOM) {
        super();
        this.movilOM = movilOM;
        }

	public List<Anuncio> getData() {
		List<Anuncio> anuncios = new ArrayList<>();
		this.moviles = movilOM.getData();
		
		Anuncio anuncio = new Anuncio();
		anuncio.setMovil(moviles.get(0));
		anuncio.setEstadoMovil(EstadoMovil.SUPERVIVIENTE);
		anuncio.setTipoCambio(TipoCambio.VENTA);
		anuncio.setFechaPublicacion(java.time.LocalDate.now());
		anuncio.setEstadoAnuncio(EstadoAnuncio.ACTIVO);
		anuncios.add(anuncio);
		
		Anuncio anuncio2 = new Anuncio();
		anuncio2.setMovil(moviles.get(1));
		anuncio2.setEstadoMovil(EstadoMovil.INTACTO);
		anuncio2.setTipoCambio(TipoCambio.INTERCAMBIO);
		anuncio2.setFechaPublicacion(java.time.LocalDate.now());
		anuncio2.setEstadoAnuncio(EstadoAnuncio.INACTIVO);
		anuncios.add(anuncio2);
		
		Anuncio anuncio3 = new Anuncio();
		anuncio3.setMovil(moviles.get(2));
		anuncio3.setEstadoMovil(EstadoMovil.EXPERIMENTADO);
		anuncio3.setTipoCambio(TipoCambio.VENTA);
		anuncio3.setFechaPublicacion(java.time.LocalDate.now());
		anuncio3.setEstadoAnuncio(EstadoAnuncio.ACTIVO);
		anuncios.add(anuncio3);
		
		Anuncio anuncio4 = new Anuncio();
		anuncio4.setMovil(moviles.get(3));
		anuncio4.setEstadoMovil(EstadoMovil.HEROE_DE_GUERRA);
		anuncio4.setTipoCambio(TipoCambio.INTERCAMBIO);
		anuncio4.setFechaPublicacion(java.time.LocalDate.now());
		anuncio4.setEstadoAnuncio(EstadoAnuncio.INACTIVO);
		anuncios.add(anuncio4);
		
		return anuncios;
	}

}
