package com.moviles.repositories;

import com.moviles.model.entities.PeticionIntercambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeticionIntercambioRepository extends JpaRepository<PeticionIntercambio, Long> {
}
