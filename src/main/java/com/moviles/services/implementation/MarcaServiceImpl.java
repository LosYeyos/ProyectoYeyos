package com.moviles.services.implementation;

import com.moviles.model.entities.Marca;
import com.moviles.repositories.MarcaRepository;
import com.moviles.services.interfaces.AnuncioService;
import com.moviles.services.interfaces.MarcaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {
    private final MarcaRepository marcaRepository;

    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public Optional<Marca> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean create(Marca entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(Marca entity) {
        return false;
    }
}
