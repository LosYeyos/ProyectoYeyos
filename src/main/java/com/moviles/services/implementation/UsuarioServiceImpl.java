package com.moviles.services.implementation;

import com.moviles.model.entities.Usuario;
import com.moviles.repositories.UsuarioRepository;
import com.moviles.services.interfaces.TecnologiaPantallaService;
import com.moviles.services.interfaces.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean create(Usuario entity) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(Usuario entity) {
        return false;
    }
}
