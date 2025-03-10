package com.moviles.services.implementation;

import com.moviles.mappers.TecnologiaPantallaDTOMapper;
import com.moviles.model.dtos.TecnologiaPantallaDTO;
import com.moviles.model.entities.TecnologiaPantalla;
import com.moviles.repositories.TecnologiaPantallaRepository;
import com.moviles.services.interfaces.TecnologiaPantallaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnologiaPantallaServiceImpl implements TecnologiaPantallaService {
    private final TecnologiaPantallaRepository tecnologiaPantallaRepository;

    public TecnologiaPantallaServiceImpl(TecnologiaPantallaRepository tecnologiaPantallaRepository) {
        this.tecnologiaPantallaRepository = tecnologiaPantallaRepository;
    }

    @Override
    public ResponseEntity<TecnologiaPantallaDTO> findById(Long id) {
        Optional<TecnologiaPantalla> byId = tecnologiaPantallaRepository.findById(id);
        if (byId.isPresent()) {
            TecnologiaPantallaDTO tecnologiaPantallaDTO = new TecnologiaPantallaDTOMapper().mapToDTO(byId.get());
            return ResponseEntity.ok(tecnologiaPantallaDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<TecnologiaPantallaDTO>> findAll() {
        List<TecnologiaPantalla> all = tecnologiaPantallaRepository.findAll();
        if (!all.isEmpty()) {
            List<TecnologiaPantallaDTO> listDTOs = all.stream().map(new TecnologiaPantallaDTOMapper()::mapToDTO).toList();
            return ResponseEntity.ok(listDTOs);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(TecnologiaPantallaDTO entity) {
        if (entity != null) {
            TecnologiaPantalla tecnologiaPantalla = new TecnologiaPantallaDTOMapper().mapToEntity(entity);
            tecnologiaPantallaRepository.save(tecnologiaPantalla);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        Optional<TecnologiaPantalla> byId = tecnologiaPantallaRepository.findById(id);
        if (byId.isPresent()) {
            tecnologiaPantallaRepository.deleteById(id);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> update(TecnologiaPantallaDTO entity, Long id) {
        Optional<TecnologiaPantalla> byId = tecnologiaPantallaRepository.findById(id);
        if (byId.isPresent()) {
            TecnologiaPantalla tecnologiaPantalla = new TecnologiaPantallaDTOMapper().mapToEntity(entity);
            tecnologiaPantalla.setId(id);
            tecnologiaPantallaRepository.save(tecnologiaPantalla);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
