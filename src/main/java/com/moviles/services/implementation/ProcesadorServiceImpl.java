package com.moviles.services.implementation;

import com.moviles.model.entities.Procesador;
import com.moviles.repositories.ProcesadorRepository;
import com.moviles.services.interfaces.ProcesadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcesadorServiceImpl implements ProcesadorService {
    private final ProcesadorRepository procesadorRepository;

    public ProcesadorServiceImpl(ProcesadorRepository procesadorRepository) {
        this.procesadorRepository = procesadorRepository;
    }

    @Override
    public ResponseEntity<Procesador> findById(Long id) {
        Optional<Procesador> procesador = procesadorRepository.findById(id);
        if (procesador.isPresent()) {
            return ResponseEntity.ok(procesador.get());
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<Procesador>> findAll() {
        List<Procesador> procesadores = procesadorRepository.findAll();
        if (!procesadores.isEmpty()) {
            return ResponseEntity.ok(procesadores);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(Procesador entity) {
        if (entity != null) {
            entity.setId(null);
            Procesador procesador = procesadorRepository.save(entity);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        Optional<Procesador> procesador = procesadorRepository.findById(id);
        if (procesador.isPresent()) {
            procesadorRepository.deleteById(id);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> update(Procesador entity) {
        Optional<Procesador> procesador = procesadorRepository.findById(entity.getId());
        if (procesador.isPresent()) {
            Procesador procesadorUpdated = procesadorRepository.save(entity);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
