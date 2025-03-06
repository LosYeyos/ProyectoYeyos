package com.moviles.om;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entities.Modelo;
import com.moviles.model.entities.Movil;
import com.moviles.model.entities.Procesador;
import com.moviles.model.entities.TecnologiaPantalla;

public class MovilOM {

	public ModeloOM modelo;

	public ProcesadorOM procesador;

	public TecnologiaPantallaOM tecnologiaPantalla;

	private List<Modelo> listaModelos;
	private List<Procesador> listaProcesadores;
	private List<TecnologiaPantalla> listaTecnologiasPantalla;

	public MovilOM() {
		super();
		this.modelo = new ModeloOM(new MarcaOM());
		this.procesador = new ProcesadorOM();
		this.tecnologiaPantalla = new TecnologiaPantallaOM();

	}

	public MovilOM(ModeloOM modelon, ProcesadorOM procesador, TecnologiaPantallaOM tecnologiaPantalla) {
		super();
		this.modelo = modelon;
		this.procesador = procesador;
		this.tecnologiaPantalla = tecnologiaPantalla;
	}

	public List<Movil> getData() {
		List<Movil> lista = new ArrayList<>();

		this.listaModelos = modelo.getData();
		this.listaProcesadores = procesador.getData();
		this.listaTecnologiasPantalla = tecnologiaPantalla.getData();

		Movil movil = new Movil();
		movil.setModelo(listaModelos.get(0));
		movil.setProcesador(listaProcesadores.get(0));
		movil.setTecnologiaPantalla(listaTecnologiasPantalla.get(0));
		movil.setAlmacenamiento(128);
		movil.setTamanoPantalla(6.1);
		movil.setRAM(6);
		movil.setDimensiones("150 x 75 x 8.5 mm");
		movil.setPeso(194);
		movil.setCapacidadPantalla(2532);
		movil.setBateria(2815);
		movil.setNFC(true);
		movil.setPrecio(909.99);
		movil.setFechaLanzamiento(java.time.LocalDate.of(2020, 10, 23));
		lista.add(movil);

		Movil movil2 = new Movil();
		movil2.setModelo(listaModelos.get(1));
		movil2.setProcesador(listaProcesadores.get(1));
		movil2.setTecnologiaPantalla(listaTecnologiasPantalla.get(1));
		movil2.setAlmacenamiento(64);
		movil2.setTamanoPantalla(6.2);
		movil2.setRAM(4);
		movil2.setDimensiones("150 x 75 x 8.5 mm");
		movil2.setPeso(194);
		movil2.setCapacidadPantalla(2532);
		movil2.setBateria(2815);
		movil2.setNFC(true);
		movil2.setPrecio(809.99);
		movil2.setFechaLanzamiento(java.time.LocalDate.of(2020, 10, 23));
		lista.add(movil2);

		Movil movil3 = new Movil();
		movil3.setModelo(listaModelos.get(2));
		movil3.setProcesador(listaProcesadores.get(2));
		movil3.setTecnologiaPantalla(listaTecnologiasPantalla.get(2));
		movil3.setAlmacenamiento(256);
		movil3.setTamanoPantalla(6.5);
		movil3.setRAM(8);
		movil3.setDimensiones("150 x 75 x 8.5 mm");
		movil3.setPeso(194);
		movil3.setCapacidadPantalla(2532);
		movil3.setBateria(2815);
		movil3.setNFC(true);
		movil3.setPrecio(1009.99);
		movil3.setFechaLanzamiento(java.time.LocalDate.of(2020, 10, 23));
		lista.add(movil3);

		Movil movil4 = new Movil();
		movil4.setModelo(listaModelos.get(3));
		movil4.setProcesador(listaProcesadores.get(3));
		movil4.setTecnologiaPantalla(listaTecnologiasPantalla.get(3));
		movil4.setAlmacenamiento(128);
		movil4.setTamanoPantalla(6.1);
		movil4.setRAM(6);
		movil4.setDimensiones("150 x 75 x 8.5 mm");
		movil4.setPeso(194);
		movil4.setCapacidadPantalla(2532);
		movil4.setBateria(2815);
		movil4.setNFC(true);
		movil4.setPrecio(909.99);
		movil4.setFechaLanzamiento(java.time.LocalDate.of(2020, 10, 23));
		lista.add(movil4);

		return lista;
	}
}
