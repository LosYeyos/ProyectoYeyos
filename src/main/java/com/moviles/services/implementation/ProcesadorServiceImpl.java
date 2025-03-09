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
        return null;
    }

    @Override
    public ResponseEntity<List<Procesador>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> save(Procesador entity) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> update(Procesador entity) {
        return null;
    }
}
