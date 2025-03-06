package com.servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.models.om.MovilOM;
import com.moviles.repositories.MovilRepository;
import com.moviles.services.interfaces.MovilService;

class ServiceTest {

	MovilRepository movilRepository;
	
	MovilService movilService;
	
	MovilFilterRequestDTO movilFilterRequestDTO;
	MovilOM movilOM;
	List<Movil> moviles;
	
	
	@BeforeEach
	void before() {
		movilFilterRequestDTO = new MovilFilterRequestDTO();
		movilOM = new MovilOM();
		moviles = new ArrayList<>();
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
