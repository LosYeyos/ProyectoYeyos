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
    public ResponseEntity<Movil> findById(Long id) {
        Optional<Movil> byId = movilRepository.findById(id);
        if (byId.isPresent()){
            return ResponseEntity.ok(byId.get());
        }
        return ResponseEntity.notFound().build();
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
        if (movilRepository.findAll().contains(entity)){
            return ResponseEntity.badRequest().build();
        }
        entity.setId(null);
        movilRepository.save(entity);
        return ResponseEntity.ok(true);
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        Optional<Movil> byId = movilRepository.findById(id);
        if (byId.isPresent()){
            movilRepository.deleteById(id);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> update(Movil entity) {
        Optional<Movil> byId = movilRepository.findById(entity.getId());
        if (byId.isPresent()){
            movilRepository.save(entity);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
