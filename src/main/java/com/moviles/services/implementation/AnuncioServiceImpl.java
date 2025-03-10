package com.moviles.services.implementation;

import com.moviles.model.entities.Anuncio;
import com.moviles.repositories.MovilRepository;
import com.moviles.repositories.PostIntercambioRepository;
import com.moviles.repositories.PostVentaRepository;
import com.moviles.services.interfaces.AnuncioService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Anuncio> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Anuncio>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> save(Anuncio entity) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> update(Anuncio entity, Long id) {
        return null;
    }
}
