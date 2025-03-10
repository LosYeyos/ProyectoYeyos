package com.moviles.services.implementation;

import com.moviles.mappers.MarcaDTOMapper;
import com.moviles.mappers.ModeloDTOMapper;
import com.moviles.model.dtos.ModeloDTO;
import com.moviles.model.entities.Marca;
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
    public ResponseEntity<ModeloDTO> findById(Long id) {
        Optional<Modelo> modelo = modeloRepository.findById(id);
        if (modelo.isPresent()) {
            ModeloDTO modeloDTO = new ModeloDTOMapper().mapToDTO(modelo.get());
            return ResponseEntity.ok(modeloDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<ModeloDTO>> findAll() {
        List<Modelo> modelos = modeloRepository.findAll();
        if (!modelos.isEmpty()) {
            List<ModeloDTO> listDTOs = modelos.stream().map(new ModeloDTOMapper()::mapToDTO).toList();
            return ResponseEntity.ok(listDTOs);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(ModeloDTO entity) {
        if (entity != null) {
            Modelo modelo = new ModeloDTOMapper().mapToEntity(entity);
            modeloRepository.save(modelo);
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
    public ResponseEntity<Boolean> update(ModeloDTO entity, Long id) {
        Optional<Modelo> modelo = modeloRepository.findById(id);
        if (modelo.isPresent()) {
            Modelo modeloEntity = new ModeloDTOMapper().mapToEntity(entity);
            modeloEntity.setId(id);
            modeloRepository.save(modeloEntity);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
