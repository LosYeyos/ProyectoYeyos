package com.moviles.services.implementation;

import com.moviles.mappers.MovilDTOMapper;
import com.moviles.model.dtos.MovilDTO;
import com.moviles.model.entities.Movil;
import com.moviles.repositories.MovilRepository;
import com.moviles.services.interfaces.MovilService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<MovilDTO> findById(Long id) {
        Optional<Movil> byId = movilRepository.findById(id);
        if (byId.isPresent()){
            return ResponseEntity.ok(new MovilDTOMapper().mapToDTO(byId.get()));
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<MovilDTO>> findAll() {
        List<Movil> all = movilRepository.findAll();
        if (!all.isEmpty()){
            List<MovilDTO> listDTOs = all.stream().map(new MovilDTOMapper()::mapToDTO).toList();
            return ResponseEntity.ok(listDTOs);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(MovilDTO entity) {
        Movil movil = new MovilDTOMapper().mapToEntity(entity);
        if (movilRepository.findAll().contains(movil)){
            return ResponseEntity.badRequest().build();
        }
        movilRepository.save(movil);
        return ResponseEntity.ok(true);
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        Optional<Movil> byId = movilRepository.findById(id);
        if (byId.isPresent()){
            movilRepository.deleteById(id);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> update(MovilDTO entity, Long id) {
        Optional<Movil> byId = movilRepository.findById(id);
        if (byId.isPresent()){
            Movil movil = new MovilDTOMapper().mapToEntity(entity);
            movil.setId(id);
            movilRepository.save(movil);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
