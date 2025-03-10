package com.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.moviles.mappers.ModeloDTOMapper;
import com.moviles.model.dtos.ModeloDTO;
import com.moviles.model.entities.Modelo;

class ModeloDTOMapperTest {

    @Test
    void testMapModeloDTOToModelo() {
        ModeloDTO modeloDTO = new ModeloDTO("Galaxy S21");

        ModeloDTOMapper mapper = new ModeloDTOMapper();
        Modelo modelo = mapper.map(modeloDTO);

        assertNotNull(modelo);
        assertEquals(modeloDTO.nombre(), modelo.getNombre());
    }
}