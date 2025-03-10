package com.repositories;

import static org.junit.jupiter.api.Assertions.*;

import com.moviles.model.entities.Anuncio;
import com.moviles.model.entities.Movil;
import com.moviles.model.entities.enums.EstadoAnuncio;
import com.moviles.model.entities.enums.EstadoMovil;
import com.moviles.model.entities.enums.TipoCambio;
import com.moviles.repositories.AnuncioRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;

@DataJpaTest
class AnuncioRepositoryTest {

    @Autowired
    private AnuncioRepository anuncioRepository;

    @Test
    void testSaveAndFindAnuncio() {
        // Arrange
        Movil movil = new Movil();
        movil.setId(1L);

        Anuncio anuncio = new Anuncio();
        anuncio.setMovil(movil);
        anuncio.setEstadoMovil(EstadoMovil.INTACTO);
        anuncio.setTipoCambio(TipoCambio.VENTA);
        anuncio.setFechaPublicacion(LocalDate.now());
        anuncio.setEstadoAnuncio(EstadoAnuncio.ACTIVO);

        // Act
        Anuncio savedAnuncio = anuncioRepository.save(anuncio);
        Anuncio foundAnuncio = anuncioRepository.findById(savedAnuncio.getId()).orElse(null);

        // Assert
        assertNotNull(foundAnuncio);
        assertEquals(anuncio.getMovil().getId(), foundAnuncio.getMovil().getId());
        assertEquals(anuncio.getEstadoMovil(), foundAnuncio.getEstadoMovil());
    }
}