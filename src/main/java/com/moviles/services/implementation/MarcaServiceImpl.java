package com.moviles.services.implementation;

import com.moviles.model.entities.Marca;
import com.moviles.repositories.MarcaRepository;
import com.moviles.services.interfaces.MarcaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {
    private final MarcaRepository marcaRepository;

    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public ResponseEntity<Optional<Marca>> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Marca>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> save(Marca entity) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> update(Marca entity) {
        return null;
    }
}
