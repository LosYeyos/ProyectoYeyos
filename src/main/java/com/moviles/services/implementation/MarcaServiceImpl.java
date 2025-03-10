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
    public ResponseEntity<MarcaDTO> findById(Long id) {
        Optional<Marca> marca = marcaRepository.findById(id);
        if (marca.isPresent()) {
            MarcaDTO marcaDTO = new MarcaDTOMapper().mapToDTO(marca.get());
            return ResponseEntity.ok(marcaDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<MarcaDTO>> findAll() {
        List<Marca> marcas = marcaRepository.findAll();
        if (!marcas.isEmpty()) {
            List<MarcaDTO> listDTOs = marcas.stream().map(new MarcaDTOMapper()::mapToDTO).toList();
            return ResponseEntity.ok(listDTOs);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(MarcaDTO entity) {
        if (entity != null) {
            Marca marca = new MarcaDTOMapper().mapToEntity(entity);
            marcaRepository.save(marca);
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
    public ResponseEntity<Boolean> update(MarcaDTO entity, Long id) {
        Optional<Marca> marca = marcaRepository.findById(id);
        if (marca.isPresent()) {
            Marca marcaEntity = new MarcaDTOMapper().mapToEntity(entity);
            marcaEntity.setId(id);
            marcaRepository.save(marcaEntity);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
