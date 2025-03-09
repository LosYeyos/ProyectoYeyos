package com.moviles.services.interfaces;

import com.moviles.model.dtos.MarcaDTO;
import com.moviles.model.entities.Marca;
import com.moviles.model.entities.Procesador;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MarcaService extends CrudInterface<Marca, Long> {
}
