package com.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.moviles.mappers.MovilDTOMapper;
import com.moviles.model.dtos.MovilDTO;
import com.moviles.model.entities.Movil;
import com.moviles.om.MovilOM;

class MovilDTOMapperTest {

    @Test
    void testMapMovilDTOToMovil() {
        MovilOM movilOM = new MovilOM();
        Movil movil = movilOM.getData().get(0); 

        // Crear un DTO a partir de la entidad
        MovilDTO movilDTO = new MovilDTO(
                null, // ModeloDTOMapper si es necesario
                null, // ProcesadorDTOMapper si es necesario
                null, // TecnologiaPantallaDTOMapper si es necesario
                movil.getAlmacenamiento(),
                movil.getTamanoPantalla(),
                movil.getRAM(),
                movil.getDimensiones(),
                movil.getPeso(),
                movil.getCapacidadPantalla(),
                movil.getBateria(),
                movil.getNFC(),
                movil.getPrecio(),
                movil.getFechaLanzamiento().toString()
        );

        MovilDTOMapper mapper = new MovilDTOMapper();
        Movil result = mapper.map(movilDTO);

        assertNotNull(result);
        assertEquals(movilDTO.almacenamiento(), result.getAlmacenamiento());
        assertEquals(movilDTO.tamanoPantalla(), result.getTamanoPantalla());
        assertEquals(movilDTO.RAM(), result.getRAM());
        assertEquals(movilDTO.dimensiones(), result.getDimensiones());
        assertEquals(movilDTO.peso(), result.getPeso());
        assertEquals(movilDTO.capacidadPantalla(), result.getCapacidadPantalla());
        assertEquals(movilDTO.bateria(), result.getBateria());
        assertEquals(movilDTO.NFC(), result.getNFC());
        assertEquals(movilDTO.precio(), result.getPrecio());
        assertEquals(movilDTO.fechaLanzamiento(), result.getFechaLanzamiento().toString());
    }
}