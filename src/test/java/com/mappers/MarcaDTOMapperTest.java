package com.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.moviles.mappers.MarcaDTOMapper;
import com.moviles.model.dtos.MarcaDTO;
import com.moviles.model.entities.Marca;
import com.moviles.om.MarcaOM;

class MarcaDTOMapperTest {

    @Test
    void testMapMarcaDTOToMarca() {
        MarcaOM marcaOM = new MarcaOM();
        Marca marca = marcaOM.getData().get(0); // Obtener la primera marca

        MarcaDTO marcaDTO = new MarcaDTO(marca.getNombre());

        MarcaDTOMapper mapper = new MarcaDTOMapper();
        Marca result = mapper.map(marcaDTO);

        assertNotNull(result);
        assertEquals(marcaDTO.nombre(), result.getNombre());
    }
}