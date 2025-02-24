package com.moviles.repositorios;

import com.moviles.model.entities.PostIntercambio;
import com.moviles.model.entities.PostVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostIntercambioRepository extends JpaRepository<PostIntercambio    , Long> {
}
