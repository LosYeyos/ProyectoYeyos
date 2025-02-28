package com.moviles.repositories;

import com.moviles.model.entities.TecnologiaPantalla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaPantallaRepository extends JpaRepository<TecnologiaPantalla, Long> {
}
