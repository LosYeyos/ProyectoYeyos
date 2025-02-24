package com.moviles.repositorios;

import com.moviles.model.entities.Movil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovilRepository extends JpaRepository<Movil, Long> {
}
