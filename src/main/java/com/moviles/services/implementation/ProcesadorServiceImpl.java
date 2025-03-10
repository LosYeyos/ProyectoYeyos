package com.moviles.services.implementation;

import com.moviles.mappers.ProcesadorDTOMapper;
import com.moviles.model.dtos.ProcesadorDTO;
import com.moviles.model.entities.Procesador;
import com.moviles.repositories.ProcesadorRepository;
import com.moviles.services.interfaces.ProcesadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcesadorServiceImpl implements ProcesadorService {
    private final ProcesadorRepository procesadorRepository;

    public ProcesadorServiceImpl(ProcesadorRepository procesadorRepository) {
        this.procesadorRepository = procesadorRepository;
    }

    @Override
    public ResponseEntity<ProcesadorDTO> findById(Long id) {
        Optional<Procesador> procesador = procesadorRepository.findById(id);
        if (procesador.isPresent()) {
            ProcesadorDTO procesadorDTO = new ProcesadorDTOMapper().mapToDTO(procesador.get());
            return ResponseEntity.ok(procesadorDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<List<ProcesadorDTO>> findAll() {
        List<Procesador> procesadores = procesadorRepository.findAll();
        if (!procesadores.isEmpty()) {
            List<ProcesadorDTO> procesadoresDTO = procesadores.stream().map(new ProcesadorDTOMapper()::mapToDTO).toList();
            return ResponseEntity.ok(procesadoresDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> save(ProcesadorDTO entity) {
        if (entity != null) {
            Procesador procesador = new ProcesadorDTOMapper().mapToEntity(entity);
            procesadorRepository.save(procesador);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        Optional<Procesador> procesador = procesadorRepository.findById(id);
        if (procesador.isPresent()) {
            procesadorRepository.deleteById(id);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Boolean> update(ProcesadorDTO entity, Long id) {
        Optional<Procesador> procesador = procesadorRepository.findById(id);
        if (procesador.isPresent()) {
            Procesador procesadorEntity = new ProcesadorDTOMapper().mapToEntity(entity);
            procesadorEntity.setId(id);
            procesadorRepository.save(procesadorEntity);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.notFound().build();
    }
}
