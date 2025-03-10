package com.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.moviles.mappers.TecnologiaPantallaDTOMapper;
import com.moviles.model.dtos.TecnologiaPantallaDTO;
import com.moviles.model.entities.TecnologiaPantalla;
import com.moviles.om.TecnologiaPantallaOM;

class TecnologiaPantallaDTOMapperTest {

    @Test
    void testMapTecnologiaPantallaDTOToTecnologiaPantalla() {
        // Crear datos de prueba usando TecnologiaPantallaOM
        TecnologiaPantallaOM tecnologiaPantallaOM = new TecnologiaPantallaOM();
        TecnologiaPantalla tecnologiaPantalla = tecnologiaPantallaOM.getData().get(0); // Obtener la primera tecnología

        // Crear un DTO a partir de la entidad
        TecnologiaPantallaDTO tecnologiaPantallaDTO = new TecnologiaPantallaDTO(
                tecnologiaPantalla.getReferencia(),
                tecnologiaPantalla.getTipo()
        );

        // Mapear DTO a entidad
        TecnologiaPantallaDTOMapper mapper = new TecnologiaPantallaDTOMapper();
        TecnologiaPantalla result = mapper.map(tecnologiaPantallaDTO);

        // Verificar resultados
        assertNotNull(result);
        assertEquals(tecnologiaPantallaDTO.referencia(), result.getReferencia());
        assertEquals(tecnologiaPantallaDTO.tipo(), result.getTipo());
    }
}