package com.moviles.services.implementation;

import com.moviles.mappers.ModeloDTOMapper;
import com.moviles.model.dtos.ModeloDTO;
import com.moviles.model.entities.Modelo;
import com.moviles.repositories.ModeloRepository;
import com.moviles.services.interfaces.ModeloService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloServiceImpl implements ModeloService {
    private final ModeloRepository modeloRepository;

    public ModeloServiceImpl(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    @Override
    public ResponseEntity<Modelo> findById(Long id) {
        Optional<Modelo> modelo = modeloRepository.findById(id);
        if (modelo.isPresent()) {
            return ResponseEntity.ok(modelo.get());
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<Modelo>> findAll() {
        List<Modelo> modelos = modeloRepository.findAll();
        if (!modelos.isEmpty()) {
            return ResponseEntity.ok(modelos);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(Modelo entity) {
        if (entity != null) {
            entity.setId(null);
            modeloRepository.save(entity);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        Optional<Modelo> modelo = modeloRepository.findById(id);
        if (modelo.isPresent()) {
            modeloRepository.deleteById(id);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> update(Modelo entity) {
        Optional<Modelo> modelo = modeloRepository.findById(entity.getId());
        if (modelo.isPresent()) {
            modeloRepository.save(modelo.get());
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
