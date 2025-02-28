package com.moviles.repositories;

import com.moviles.model.entities.PostVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostVentaRepository extends JpaRepository<PostVenta, Long> {
}
