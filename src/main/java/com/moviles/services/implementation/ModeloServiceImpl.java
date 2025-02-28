package com.moviles.services.implementation;

import com.moviles.model.entities.Modelo;
import com.moviles.repositories.ModeloRepository;
import com.moviles.services.interfaces.MarcaService;
import com.moviles.services.interfaces.ModeloService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ModeloServiceImpl implements ModeloService {
    private final ModeloRepository modeloRepository;

    public ModeloServiceImpl(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    @Override
    public Optional<Modelo> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean create(Modelo entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(Modelo entity) {
        return false;
    }
}
