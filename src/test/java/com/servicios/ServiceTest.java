package com.servicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import com.moviles.model.entities.Marca;
import com.moviles.model.entities.Modelo;
import com.moviles.model.entities.Movil;
import com.moviles.om.MovilOM;
import com.moviles.repositories.MovilRepository;
import com.moviles.services.implementation.MovilServiceImpl;
import com.moviles.services.interfaces.MovilService;


class ServiceTest {

	  	@Mock
	    private MovilRepository movilRepository;

	    @InjectMocks
	    private MovilService movilService; 

	    private MovilOM movilOM;
	    private List<Movil> moviles;

	    @BeforeEach
	    void setUp() {
	        movilOM = new MovilOM();
	        moviles = movilOM.getData(); 
	    }

	    @Test
	    void testMostrarTodosLosMoviles() {
	        // Arrange
	        when(movilRepository.findAll()).thenReturn(moviles); 

	        // Act
	        ResponseEntity<List<Movil>> respuesta = movilService.findAll();
	        List<Movil> resultado = respuesta.getBody();

	        // Assert
	        assertNotNull(resultado);
	        assertEquals(5, resultado.size()); 
	        verify(movilRepository, times(1)).findAll(); 
	    }
	    @Test
	    void testFindById() {
	        // Arrange
	        Long id = 1L;
	        movilService = new MovilServiceImpl(); 

	        // Act
	        ResponseEntity<Optional<Movil>> respuesta = movilService.findById(id);
	        Optional<Movil> resultado = respuesta.getBody();

	        // Assert
	        assertNotNull(resultado); 
	        assertFalse(resultado.isPresent());
	    }
	    
	    @Test
	    void testSave() {
	        // Arrange
	        Movil nuevoMovil = new Movil();
	        Modelo modeloprueba = new Modelo();
	        Marca marca = new Marca();
	        marca.setId(1L);
	        marca.setNombre("Samsung");
	        modeloprueba.setMarca(marca);
	        modeloprueba.setId(1L);
	        modeloprueba.setNombre("Galaxy S21");
	        nuevoMovil.setModelo(modeloprueba);
	        nuevoMovil.setPrecio(699.99);
	        movilService = new MovilServiceImpl(); 

	        // Act
	        ResponseEntity<Boolean> respuesta = movilService.save(nuevoMovil);
	        Boolean resultado = respuesta.getBody();

	        // Assert
	        assertNotNull(resultado); 
	        assertTrue(resultado); 
	    }
	    @Test
	    void testDelete() {
	        // Arrange
	        Long id = 1L;
	        movilService = new MovilServiceImpl(); 

	        // Act
	        ResponseEntity<Boolean> respuesta = movilService.delete(id);
	        Boolean resultado = respuesta.getBody();

	        // Assert
	        assertNotNull(resultado); 
	        assertTrue(resultado); 
	    }
	    @Test
	    void testUpdate() {
	        // Arrange
	        Movil movilActualizado = new Movil();
	        Modelo modeloprueba = new Modelo();
	        Marca marca = new Marca();
	        marca.setId(1L);
	        marca.setNombre("Samsung");
	        modeloprueba.setMarca(marca);
	        modeloprueba.setId(1L);
	        modeloprueba.setNombre("Galaxy S21");
	        movilActualizado.setModelo(modeloprueba);
	        movilActualizado.setPrecio(699.99);
	        movilService = new MovilServiceImpl(); 

	        // Act
	        ResponseEntity<Boolean> respuesta = movilService.update(movilActualizado);
	        Boolean resultado = respuesta.getBody();

	        // Assert
	        assertNotNull(resultado); 
	        assertTrue(resultado);
	        }
	    }


