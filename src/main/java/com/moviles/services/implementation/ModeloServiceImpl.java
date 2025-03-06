package com.moviles.services.implementation;

import com.moviles.model.entities.Modelo;
import com.moviles.repositories.ModeloRepository;
import com.moviles.services.interfaces.ModeloService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloServiceImpl implements ModeloService {
    private final ModeloRepository modeloRepository;

    public ModeloServiceImpl(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    @Override
    public ResponseEntity<Optional<Modelo>> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Modelo>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> save(Modelo entity) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> update(Modelo entity) {
        return null;
    }
}
