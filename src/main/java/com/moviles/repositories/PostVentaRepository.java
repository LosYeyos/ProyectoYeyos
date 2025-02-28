package com.moviles.repositories;

import com.moviles.model.entities.Anuncio;
import com.moviles.model.entities.PostVenta;
import com.moviles.model.entities.compositekeys.PostVentaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostVentaRepository extends JpaRepository<PostVenta, Long> {
}
