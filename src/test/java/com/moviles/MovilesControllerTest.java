package com.moviles;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.moviles.controller.MovilController;
import com.moviles.model.entities.Movil;
import com.moviles.om.MovilOM;
import com.moviles.services.implementation.MovilServiceImpl;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(MovilController.class)
class MovilControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean 
    private MovilServiceImpl movilService;

    @InjectMocks
    private MovilController movilController;

    private MovilOM movilOM;

    @BeforeEach
    void setUp() {
        movilOM = new MovilOM(); 
        mockMvc = MockMvcBuilders.standaloneSetup(movilController).build();
    }

    @Test
    void testGetAllMoviles_ReturnsMovilesList() throws Exception {
        List<Movil> moviles = movilOM.getData();

        when(movilService.findAll()).thenReturn(ResponseEntity.ok(moviles));

        mockMvc.perform(get("/moviles"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(moviles.size()))
                .andExpect(jsonPath("$[0].nombre").value(moviles.get(0).getModelo().getNombre()))
                .andExpect(jsonPath("$[1].nombre").value(moviles.get(1).getModelo().getNombre()));
    }

    @Test
    void testGetAllMoviles_NoMovilesInDB() throws Exception {
        when(movilService.findAll()).thenReturn(ResponseEntity.notFound().build());

        mockMvc.perform(get("/moviles"))
                .andExpect(status().isNotFound());
    }

    @Test
    void testGetMovilDetalle() throws Exception {
        Movil movil = movilOM.getData().get(0); 

        when(movilService.findById(1L)).thenReturn(ResponseEntity.ok(movil));

        mockMvc.perform(get("/moviles/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(movil.getId()))
                .andExpect(jsonPath("$.modelo.nombre").value(movil.getModelo().getNombre()))
                .andExpect(jsonPath("$.procesador.nombre").value(movil.getProcesador().getNombre()))
                .andExpect(jsonPath("$.tecnologiaPantalla.tipo").value(movil.getTecnologiaPantalla().getTipo()))
                .andExpect(jsonPath("$.almacenamiento").value(movil.getAlmacenamiento()))
                .andExpect(jsonPath("$.tamanoPantalla").value(movil.getTamanoPantalla()))
                .andExpect(jsonPath("$.RAM").value(movil.getRAM()))
                .andExpect(jsonPath("$.dimensiones").value(movil.getDimensiones()))
                .andExpect(jsonPath("$.peso").value(movil.getPeso()))
                .andExpect(jsonPath("$.capacidadPantalla").value(movil.getCapacidadPantalla()))
                .andExpect(jsonPath("$.bateria").value(movil.getBateria()))
                .andExpect(jsonPath("$.NFC").value(movil.hasNFC()))
                .andExpect(jsonPath("$.precio").value(movil.getPrecio()))
                .andExpect(jsonPath("$.fechaLanzamiento").value(movil.getFechaLanzamiento().toString()));
    }

    @Test
    void testGetMovilDetalle_NotFound() throws Exception {
        when(movilService.findById(1L)).thenReturn(ResponseEntity.notFound().build());

        mockMvc.perform(get("/moviles/1"))
                .andExpect(status().isNotFound());
    }
}