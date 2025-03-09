package com.moviles.repositories;

import com.moviles.model.entities.Modelo;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {
    Optional<Modelo> findByNombre(@NonNull String nombre);
}
