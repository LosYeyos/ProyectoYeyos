package com.moviles.repositorios;

import com.moviles.model.entities.PeticionIntercambio;
import com.moviles.model.entities.Procesador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeticionIntercambioRepository extends JpaRepository<PeticionIntercambio, Long> {
}
