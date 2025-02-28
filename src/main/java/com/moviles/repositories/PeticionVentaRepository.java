package com.moviles.repositories;

import com.moviles.model.entities.PeticionVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeticionVentaRepository extends JpaRepository<PeticionVenta, Long> {
}
