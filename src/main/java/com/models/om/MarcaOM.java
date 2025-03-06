package com.models.om;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entities.Marca;



public class MarcaOM {

	public List<Marca> getData() {
		List<Marca> marcas = new ArrayList<>();
		
		
		Marca marca1 = new Marca();
		marca1.setNombre("Samsung");
		marcas.add(marca1);
		Marca marca2 = new Marca();
		marca2.setNombre("Xiaomi");
		marcas.add(marca2);
		Marca marca3 = new Marca();
		marca3.setNombre("Huawei");
		marcas.add(marca3);
		Marca marca4 = new Marca();
		marca4.setNombre("OPPO");
		marcas.add(marca4);
			
		return marcas;
	}

}
