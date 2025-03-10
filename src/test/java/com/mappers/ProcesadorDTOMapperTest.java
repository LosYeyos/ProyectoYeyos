package com.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.moviles.mappers.ProcesadorDTOMapper;
import com.moviles.model.dtos.ProcesadorDTO;
import com.moviles.model.entities.Procesador;
import com.moviles.om.ProcesadorOM;

class ProcesadorDTOMapperTest {

    @Test
    void testMapProcesadorDTOToProcesador() {
        // Crear datos de prueba usando ProcesadorOM
        ProcesadorOM procesadorOM = new ProcesadorOM();
        Procesador procesador = procesadorOM.getData().get(0); // Obtener el primer procesador

        // Crear un DTO a partir de la entidad
        ProcesadorDTO procesadorDTO = new ProcesadorDTO(
                procesador.getReferencia(),
                procesador.getNombre(),
                procesador.getNumeroNucleos(),
                procesador.getMaxGHz()
        );

        // Mapear DTO a entidad
        ProcesadorDTOMapper mapper = new ProcesadorDTOMapper();
        Procesador result = mapper.map(procesadorDTO);

        // Verificar resultados
        assertNotNull(result);
        assertEquals(procesadorDTO.referencia(), result.getReferencia());
        assertEquals(procesadorDTO.nombre(), result.getNombre());
        assertEquals(procesadorDTO.numeroNucleos(), result.getNumeroNucleos());
        assertEquals(procesadorDTO.maxGHz(), result.getMaxGHz());
    }
}