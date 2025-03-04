package com.moviles.services.implementation;

import com.moviles.model.entities.Anuncio;
import com.moviles.repositories.MovilRepository;
import com.moviles.repositories.PostIntercambioRepository;
import com.moviles.repositories.PostVentaRepository;
import com.moviles.services.interfaces.AnuncioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnuncioServiceImpl implements AnuncioService {
    private PostVentaRepository postVentaRepository;
    private PostIntercambioRepository postIntercambioRepository;
    private MovilRepository movilRepository;
    private UsuarioServiceImpl userServiceImpl;

    public AnuncioServiceImpl(PostVentaRepository postVentaRepository, PostIntercambioRepository postIntercambioRepository, UsuarioServiceImpl userServiceImpl, MovilRepository movilRepository) {
        this.postVentaRepository = postVentaRepository;
        this.postIntercambioRepository = postIntercambioRepository;
        this.movilRepository = movilRepository;
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public Optional<Anuncio> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Anuncio> findAll() {
        return List.of();
    }

    @Override
    public boolean save(Anuncio entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(Anuncio entity) {
        return false;
    }
}
