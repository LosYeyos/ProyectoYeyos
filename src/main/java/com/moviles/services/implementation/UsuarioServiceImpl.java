package com.moviles.services.implementation;

import com.moviles.mappers.UsuarioDTOMapper;
import com.moviles.model.dtos.UsuarioEmailDTO;
import com.moviles.model.entities.Usuario;
import com.moviles.repositories.UsuarioRepository;
import com.moviles.services.interfaces.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;



    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public ResponseEntity<Usuario> findById(Long id) {
        Optional<Usuario> byId = usuarioRepository.findById(id);
        if (byId.isPresent()){
            return ResponseEntity.ok(byId.get());
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> all = usuarioRepository.findAll();
        if (!all.isEmpty()){
            return ResponseEntity.ok(all);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(Usuario entity) {
        if (usuarioRepository.findAll().contains(entity)){
            return ResponseEntity.badRequest().build();
        }
        usuarioRepository.save(entity);
        return ResponseEntity.ok(true);
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        Optional<Usuario> byId = usuarioRepository.findById(id);
        if (byId.isPresent()){
            usuarioRepository.deleteById(id);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> update(Usuario entity) {
        Optional<Usuario> byId = usuarioRepository.findById(entity.getId());
        if (byId.isPresent()){
            usuarioRepository.save(entity);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
