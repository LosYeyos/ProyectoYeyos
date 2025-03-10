package com.moviles.services.implementation;

import com.moviles.mappers.UsuarioDTOMapper;
import com.moviles.mappers.UsuarioEmailDTOMapper;
import com.moviles.model.dtos.UsuarioDTO;
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
    public ResponseEntity<UsuarioDTO> findById(Long id) {
        Optional<Usuario> byId = usuarioRepository.findById(id);
        if (byId.isPresent()){
            UsuarioDTO usuarioDTO = new UsuarioDTOMapper().mapToDTO(byId.get());
            return ResponseEntity.ok(usuarioDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<UsuarioDTO>> findAll() {
        List<Usuario> all = usuarioRepository.findAll();
        if (!all.isEmpty()){
            List<UsuarioDTO> listDTOs = all.stream().map(new UsuarioDTOMapper()::mapToDTO).toList();
            return ResponseEntity.ok(listDTOs);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(UsuarioDTO entity) {
        Usuario usuario = new UsuarioDTOMapper().mapToEntity(entity);
        if (usuarioRepository.findAll().contains(usuario)){
            return ResponseEntity.badRequest().build();
        }
        usuarioRepository.save(usuario);
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
    public ResponseEntity<Boolean> update(UsuarioDTO entity, Long id) {
        Optional<Usuario> byId = usuarioRepository.findById(id);
        if (byId.isPresent()){
            Usuario usuario = new UsuarioDTOMapper().mapToEntity(entity);
            usuario.setId(id);
            usuarioRepository.save(usuario);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
