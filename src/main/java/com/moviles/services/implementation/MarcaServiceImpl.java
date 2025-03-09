package com.moviles.services.implementation;

import com.moviles.mappers.MarcaDTOMapper;
import com.moviles.model.dtos.MarcaDTO;
import com.moviles.model.entities.Marca;
import com.moviles.repositories.MarcaRepository;
import com.moviles.services.interfaces.MarcaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {
    private final MarcaRepository marcaRepository;

    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public ResponseEntity<Marca> findById(Long id) {
        Optional<Marca> marca = marcaRepository.findById(id);
        if (marca.isPresent()) {
            return ResponseEntity.ok(marca.get());
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<Marca>> findAll() {
        List<Marca> marcas = marcaRepository.findAll();
        if (!marcas.isEmpty()) {
            return ResponseEntity.ok(marcas);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(Marca entity) {
        if (entity != null) {
            entity.setId(null);
            marcaRepository.save(entity);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        Optional<Marca> marca = marcaRepository.findById(id);
        if (marca.isPresent()) {
            marcaRepository.deleteById(id);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> update(Marca entity) {
        Optional<Marca> marca = marcaRepository.findById(entity.getId());
        if (marca.isPresent()) {
            marcaRepository.save(marca.get());
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
