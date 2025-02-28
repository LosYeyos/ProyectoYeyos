package com.moviles.repositories;

import com.moviles.model.entities.PostIntercambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostIntercambioRepository extends JpaRepository<PostIntercambio    , Long> {
}
