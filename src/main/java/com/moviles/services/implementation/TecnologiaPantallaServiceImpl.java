package com.moviles.services.implementation;

import com.moviles.model.entities.TecnologiaPantalla;
import com.moviles.repositories.TecnologiaPantallaRepository;
import com.moviles.services.interfaces.TecnologiaPantallaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnologiaPantallaServiceImpl implements TecnologiaPantallaService {
    private final TecnologiaPantallaRepository tecnologiaPantallaRepository;

    public TecnologiaPantallaServiceImpl(TecnologiaPantallaRepository tecnologiaPantallaRepository) {
        this.tecnologiaPantallaRepository = tecnologiaPantallaRepository;
    }

    @Override
    public ResponseEntity<TecnologiaPantalla> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<TecnologiaPantalla>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> save(TecnologiaPantalla entity) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> update(TecnologiaPantalla entity) {
        return null;
    }
}
