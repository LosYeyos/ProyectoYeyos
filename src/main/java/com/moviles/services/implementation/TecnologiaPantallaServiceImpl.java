package com.moviles.services.implementation;

import com.moviles.model.entities.TecnologiaPantalla;
import com.moviles.repositories.TecnologiaPantallaRepository;
import com.moviles.services.interfaces.TecnologiaPantallaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TecnologiaPantallaServiceImpl implements TecnologiaPantallaService {
    private final TecnologiaPantallaRepository tecnologiaPantallaRepository;

    public TecnologiaPantallaServiceImpl(TecnologiaPantallaRepository tecnologiaPantallaRepository) {
        this.tecnologiaPantallaRepository = tecnologiaPantallaRepository;
    }

    @Override
    public Optional<TecnologiaPantalla> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean create(TecnologiaPantalla entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(TecnologiaPantalla entity) {
        return false;
    }
}
