package com.models.om;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entities.Procesador;


public class ProcesadorOM{

	public List<Procesador> getData() {
		List<Procesador> lista = new ArrayList<>();
		
		Procesador procesador = new Procesador();
		procesador.setMaxGHz(2.33);
		procesador.setNombre("Snapdragon 2000");
		procesador.setNumeroNucleos(4);
		lista.add(procesador);
		
		Procesador procesador2 = new Procesador();
		procesador2.setMaxGHz(3.55);
		procesador2.setNombre("Snapdragon 3600");
		procesador2.setNumeroNucleos(8);
		lista.add(procesador2);
		
		Procesador procesador3 = new Procesador();
		procesador3.setMaxGHz(3.12);
		procesador3.setNombre("Snapdragon 4400");
		procesador3.setNumeroNucleos(6);
		lista.add(procesador3);
		
		Procesador procesador4 = new Procesador();
		procesador4.setMaxGHz(5.33);
		procesador4.setNombre("M2");
		procesador4.setNumeroNucleos(12);
		lista.add(procesador4);
		
		return lista;
	}

	
	
	
}
