package com.moviles.om;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entities.TecnologiaPantalla;

public class TecnologiaPantallaOM {

	public List<TecnologiaPantalla> getData() {
		List<TecnologiaPantalla> lista = new ArrayList<>();

		TecnologiaPantalla tecnologiaPantalla = new TecnologiaPantalla();
		tecnologiaPantalla.setReferencia(1);
		tecnologiaPantalla.setTipo("LCD");
		lista.add(tecnologiaPantalla);

		TecnologiaPantalla tecnologiaPantalla2 = new TecnologiaPantalla();
		tecnologiaPantalla2.setReferencia(2);
		tecnologiaPantalla2.setTipo("LED");
		lista.add(tecnologiaPantalla2);

		TecnologiaPantalla tecnologiaPantalla3 = new TecnologiaPantalla();
		tecnologiaPantalla3.setReferencia(3);
		tecnologiaPantalla3.setTipo("OLED");
		lista.add(tecnologiaPantalla3);

		TecnologiaPantalla tecnologiaPantalla4 = new TecnologiaPantalla();
		tecnologiaPantalla4.setReferencia(4);
		tecnologiaPantalla4.setTipo("AMOLED");
		lista.add(tecnologiaPantalla4);
		
		return lista;

	}
}
