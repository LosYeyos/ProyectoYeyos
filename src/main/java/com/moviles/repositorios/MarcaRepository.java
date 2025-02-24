package com.moviles.repositorios;

import com.moviles.model.entities.Marca;
import com.moviles.model.entities.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
