package com.moviles.services.implementation;

import com.moviles.model.entities.Movil;
import com.moviles.repositories.MovilRepository;
import com.moviles.services.interfaces.MovilService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovilServiceImpl implements MovilService {
    private final MovilRepository movilRepository;

    public MovilServiceImpl(MovilRepository movilRepository) {
        this.movilRepository = movilRepository;
    }

    @Override
    public ResponseEntity<Optional<Movil>> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Movil>> findAll() {
        List<Movil> all = movilRepository.findAll();
        if (!all.isEmpty()){
            return ResponseEntity.ok(all);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(Movil entity) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> update(Movil entity) {
        return null;
    }
}
