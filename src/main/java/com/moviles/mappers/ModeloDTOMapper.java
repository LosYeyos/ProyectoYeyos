package com.moviles.mappers;

import com.moviles.model.dtos.ModeloDTO;
import com.moviles.model.entities.Modelo;

public class ModeloDTOMapper implements Mapper<ModeloDTO, Modelo> {
    @Override
    public Modelo map(ModeloDTO dto) {
        Modelo modelo = new Modelo();
        modelo.setNombre(dto.nombre());
        return modelo;
    }
}
