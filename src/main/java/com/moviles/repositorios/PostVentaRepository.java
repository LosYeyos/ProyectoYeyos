package com.moviles.repositorios;

import com.moviles.model.entities.PostVenta;
import com.moviles.model.entities.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostVentaRepository extends JpaRepository<PostVenta, Long> {
}
