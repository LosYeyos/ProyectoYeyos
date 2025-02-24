package com.moviles.repositorios;

import com.moviles.model.entities.PeticionVenta;
import com.moviles.model.entities.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
}
