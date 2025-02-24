package com.moviles.repositorios;

import com.moviles.model.entities.Anuncio;
import com.moviles.model.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
}
