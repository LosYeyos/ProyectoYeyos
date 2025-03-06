package com.moviles.om;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entities.Marca;
import com.moviles.model.entities.Modelo;

public class ModeloOM {

	private MarcaOM marca;

	public ModeloOM() {
		this.marca = new MarcaOM();
	}

	public ModeloOM(MarcaOM marca) {
		super();
		this.marca = new MarcaOM();
	}

	public List<Modelo> getData() {
		List<Modelo> lista = new ArrayList<>();
		List<Marca> listaMarcas = marca.getData();

		Modelo modelo = new Modelo();
		modelo.setMarca(listaMarcas.get(0));
		modelo.setNombre("12");
		lista.add(modelo);

		Modelo modelo2 = new Modelo();
		modelo2.setMarca(listaMarcas.get(0));
		modelo2.setNombre("13");
		lista.add(modelo2);

		Modelo modelo3 = new Modelo();
		modelo3.setMarca(listaMarcas.get(1));
		modelo3.setNombre("15 Pro max");
		lista.add(modelo3);

		Modelo modelo4 = new Modelo();
		modelo4.setMarca(listaMarcas.get(1));
		modelo4.setNombre("S9");
		lista.add(modelo4);

		Modelo modelo5 = new Modelo();
		modelo5.setMarca(listaMarcas.get(2));
		modelo5.setNombre("S21");
		lista.add(modelo5);

		Modelo modelo6 = new Modelo();
		modelo6.setMarca(listaMarcas.get(2));
		modelo6.setNombre("Redmi Note 10");
		lista.add(modelo6);

		Modelo modelo7 = new Modelo();
		modelo7.setMarca(listaMarcas.get(3));
		modelo7.setNombre("P40 Pro");
		lista.add(modelo7);

		return lista;

	}
}
