package com.moviles.repositorios;

import com.moviles.model.entities.Anuncio;
import com.moviles.model.entities.Procesador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcesadorRepository extends JpaRepository<Procesador, Long> {
}
