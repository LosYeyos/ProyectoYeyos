package com.moviles.repositorios;

import com.moviles.model.entities.Modelo;
import com.moviles.model.entities.Movil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}
