package com.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.mappers.PostVentaDTOMapper;
import com.moviles.model.dtos.AnuncioDTO;
import com.moviles.model.dtos.PostVentaDTO;
import com.moviles.model.entities.PostVenta;
import com.moviles.model.entities.Anuncio;

@SpringBootTest
class PostVentaDTOMapperTest {

    @Autowired
    private PostVentaDTOMapper postVentaDTOMapper;

    @Test
    void testMapToDTOPostVentaDTOToPostVenta() {
        Anuncio anuncio = new Anuncio();
        anuncio.setId(1L);

        PostVentaDTO postVentaDTO = new PostVentaDTO(
                1L,
                new AnuncioDTO(1L, null, null, null, null, null),
                "Nuevo"
        );

        
        PostVenta postVenta = postVentaDTOMapper.mapToEntity(postVentaDTO);

        assertNotNull(postVenta);
        assertEquals(postVentaDTO.id(), postVenta.getId());
        assertNotNull(postVenta.getAnuncio());
        assertEquals(postVentaDTO.anuncio().id(), postVenta.getAnuncio().getId());
        
        //me esta dadno fallo en la ejecucion del test, no se porque
    }
}