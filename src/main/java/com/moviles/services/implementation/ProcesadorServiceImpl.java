package com.moviles.services.implementation;

import com.moviles.model.entities.Procesador;
import com.moviles.repositories.ProcesadorRepository;
import com.moviles.services.interfaces.ProcesadorService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProcesadorServiceImpl implements ProcesadorService {
    private final ProcesadorRepository procesadorRepository;

    public ProcesadorServiceImpl(ProcesadorRepository procesadorRepository) {
        this.procesadorRepository = procesadorRepository;
    }

    @Override
    public Optional<Procesador> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean create(Procesador entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(Procesador entity) {
        return false;
    }
}
