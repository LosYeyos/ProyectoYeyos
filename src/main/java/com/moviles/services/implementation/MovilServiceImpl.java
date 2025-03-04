package com.moviles.services.implementation;

import com.moviles.model.entities.Movil;
import com.moviles.repositories.MovilRepository;
import com.moviles.services.interfaces.MovilService;
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
    public Optional<Movil> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Movil> findAll() {
        return List.of();
    }

    @Override
    public boolean save(Movil entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(Movil entity) {
        return false;
    }
}
