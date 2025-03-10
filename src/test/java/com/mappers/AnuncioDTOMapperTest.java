package com.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.moviles.mappers.AnuncioDTOMapper;
import com.moviles.model.dtos.AnuncioDTO;
import com.moviles.model.dtos.MovilDTO;
import com.moviles.model.entities.Anuncio;
import com.moviles.model.entities.enums.EstadoAnuncio;
import com.moviles.model.entities.enums.EstadoMovil;
import com.moviles.model.entities.enums.TipoCambio;
import com.moviles.om.AnuncioOM;
import com.moviles.om.MovilOM;

class AnuncioDTOMapperTest {

    @Test
    void testMapAnuncioDTOToAnuncio() {
        // Crear datos de prueba usando AnuncioOM y MovilOM
        MovilOM movilOM = new MovilOM();
        AnuncioOM anuncioOM = new AnuncioOM(movilOM);
        Anuncio anuncio = anuncioOM.getData().get(0); // Obtener el primer anuncio

        // Crear un DTO a partir de la entidad
        MovilDTO movilDTO = new MovilDTO(
                null, //ModeloDTOMapper si es necesario
                null, //ProcesadorDTOMapper si es necesario
                null, //TecnologiaPantallaDTOMapper si es necesario
                anuncio.getMovil().getAlmacenamiento(),
                anuncio.getMovil().getTamanoPantalla(),
                anuncio.getMovil().getRAM(),
                anuncio.getMovil().getDimensiones(),
                anuncio.getMovil().getPeso(),
                anuncio.getMovil().getCapacidadPantalla(),
                anuncio.getMovil().getBateria(),
                anuncio.getMovil().getNFC(),
                anuncio.getMovil().getPrecio(),
                anuncio.getMovil().getFechaLanzamiento().toString()
        );

        AnuncioDTO anuncioDTO = new AnuncioDTO(
                anuncio.getId(),
                movilDTO,
                anuncio.getEstadoMovil(),
                anuncio.getTipoCambio(),
                anuncio.getFechaPublicacion(),
                anuncio.getEstadoAnuncio()
        );

        // Mapear DTO a entidad
        AnuncioDTOMapper mapper = new AnuncioDTOMapper();
        Anuncio result = mapper.map(anuncioDTO);

        // Verificar resultados
        assertNotNull(result);
        assertEquals(anuncioDTO.id(), result.getId());
        assertEquals(anuncioDTO.estadoMovil(), result.getEstadoMovil());
        assertEquals(anuncioDTO.tipoCambio(), result.getTipoCambio());
        assertEquals(anuncioDTO.fechaPublicacion(), result.getFechaPublicacion());
        assertEquals(anuncioDTO.estadoAnuncio(), result.getEstadoAnuncio());

        // Verificar el móvil asociado
        assertNotNull(result.getMovil());
        assertEquals(anuncioDTO.movil().almacenamiento(), result.getMovil().getAlmacenamiento());
        assertEquals(anuncioDTO.movil().tamanoPantalla(), result.getMovil().getTamanoPantalla());
        assertEquals(anuncioDTO.movil().RAM(), result.getMovil().getRAM());
        assertEquals(anuncioDTO.movil().dimensiones(), result.getMovil().getDimensiones());
        assertEquals(anuncioDTO.movil().peso(), result.getMovil().getPeso());
        assertEquals(anuncioDTO.movil().capacidadPantalla(), result.getMovil().getCapacidadPantalla());
        assertEquals(anuncioDTO.movil().bateria(), result.getMovil().getBateria());
        assertEquals(anuncioDTO.movil().NFC(), result.getMovil().getNFC());
        assertEquals(anuncioDTO.movil().precio(), result.getMovil().getPrecio());
        assertEquals(anuncioDTO.movil().fechaLanzamiento(), result.getMovil().getFechaLanzamiento().toString());
    }
}