package com.servicios;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.moviles.model.entities.Marca;
import com.moviles.model.entities.Modelo;
import com.moviles.model.entities.Movil;
import com.moviles.om.MovilOM;
import com.moviles.repositories.MovilRepository;
import com.moviles.services.implementation.MovilServiceImpl;

@SpringBootTest
class ServiceTest {

    @Mock
    private MovilRepository movilRepository;

    @InjectMocks
    private MovilServiceImpl movilService;

    private MovilOM movilOM;
    private List<Movil> moviles;

    @BeforeEach
    void setUp() {
        movilOM = new MovilOM();
        moviles = movilOM.getData();
    }

    @Test
    void testMostrarTodosLosMoviles() {
        when(movilRepository.findAll()).thenReturn(moviles);

        ResponseEntity<List<Movil>> respuesta = movilService.findAll();
        List<Movil> resultado = respuesta.getBody();

        assertNotNull(resultado);
        assertEquals(5, resultado.size());
        verify(movilRepository, times(1)).findAll();
    }

    @Test
    void testFindById() {
        Long id = 1L;
        Movil movil = moviles.get(0);
        when(movilRepository.findById(id)).thenReturn(Optional.of(movil));

        ResponseEntity<Movil> respuesta = movilService.findById(id);
        Movil resultado = respuesta.getBody();

        assertNotNull(resultado);
        assertEquals(movil.getId(), resultado.getId());
        verify(movilRepository, times(1)).findById(id);
    }

    @Test
    void testFindById_NotFound() {
        Long id = 99L;
        when(movilRepository.findById(id)).thenReturn(Optional.empty());

        ResponseEntity<Movil> respuesta = movilService.findById(id);

        assertEquals(HttpStatus.NOT_FOUND, respuesta.getStatusCode());
        verify(movilRepository, times(1)).findById(id);
    }

    @Test
    void testSave() {
        Movil nuevoMovil = moviles.get(0);
        when(movilRepository.save(nuevoMovil)).thenReturn(nuevoMovil);

        ResponseEntity<Boolean> respuesta = movilService.save(nuevoMovil);
        Boolean resultado = respuesta.getBody();

        assertNotNull(resultado);
        assertTrue(resultado);
        verify(movilRepository, times(1)).save(nuevoMovil);
    }

    @Test
    void testSave_AlreadyExists() {
        Movil nuevoMovil = moviles.get(0);
        when(movilRepository.findAll()).thenReturn(moviles);

        ResponseEntity<Boolean> respuesta = movilService.save(nuevoMovil);
        Boolean resultado = respuesta.getBody();

        assertNull(resultado);
        assertEquals(HttpStatus.BAD_REQUEST, respuesta.getStatusCode());
        verify(movilRepository, times(1)).findAll();
    }

    @Test
    void testDelete() {
        Long id = 1L;
        when(movilRepository.findById(id)).thenReturn(Optional.of(moviles.get(0)));
        doNothing().when(movilRepository).deleteById(id);

        ResponseEntity<Boolean> respuesta = movilService.delete(id);
        Boolean resultado = respuesta.getBody();

        assertNotNull(resultado);
        assertTrue(resultado);
        verify(movilRepository, times(1)).deleteById(id);
    }

    @Test
    void testDelete_NotFound() {
        Long id = 99L;
        when(movilRepository.findById(id)).thenReturn(Optional.empty());

        ResponseEntity<Boolean> respuesta = movilService.delete(id);

        assertEquals(HttpStatus.NOT_FOUND, respuesta.getStatusCode());
        verify(movilRepository, times(1)).findById(id);
    }

    @Test
    void testUpdate() {
        Movil movilActualizado = moviles.get(0);
        when(movilRepository.findById(movilActualizado.getId())).thenReturn(Optional.of(movilActualizado));
        when(movilRepository.save(movilActualizado)).thenReturn(movilActualizado);

        ResponseEntity<Boolean> respuesta = movilService.update(movilActualizado);
        Boolean resultado = respuesta.getBody();

        assertNotNull(resultado);
        assertTrue(resultado);
        verify(movilRepository, times(1)).save(movilActualizado);
    }

    @Test
    void testUpdate_NotFound() {
        Movil movilActualizado = moviles.get(0);
        when(movilRepository.findById(movilActualizado.getId())).thenReturn(Optional.empty());

        ResponseEntity<Boolean> respuesta = movilService.update(movilActualizado);

        assertEquals(HttpStatus.NOT_FOUND, respuesta.getStatusCode());
        verify(movilRepository, times(1)).findById(movilActualizado.getId());
    }
}