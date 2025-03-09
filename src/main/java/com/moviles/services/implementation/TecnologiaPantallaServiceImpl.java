package com.moviles.services.implementation;

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
    public ResponseEntity<TecnologiaPantalla> findById(Long id) {
        Optional<TecnologiaPantalla> byId = tecnologiaPantallaRepository.findById(id);
        if (byId.isPresent()) {
            return ResponseEntity.ok(byId.get());
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<TecnologiaPantalla>> findAll() {
        List<TecnologiaPantalla> all = tecnologiaPantallaRepository.findAll();
        if (!all.isEmpty()) {
            return ResponseEntity.ok(all);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(TecnologiaPantalla entity) {
        if (entity != null) {
            entity.setId(null);
            TecnologiaPantalla save = tecnologiaPantallaRepository.save(entity);
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
    public ResponseEntity<Boolean> update(TecnologiaPantalla entity) {
        Optional<TecnologiaPantalla> byId = tecnologiaPantallaRepository.findById(entity.getId());
        if (byId.isPresent()) {
            tecnologiaPantallaRepository.save(entity);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
