package com.moviles.mappers;

import com.moviles.model.dtos.ModeloDTO;
import com.moviles.model.entities.Modelo;

public class ModeloDTOMapper implements Mapper<ModeloDTO, Modelo> {
    MarcaDTOMapper marcaDTOMapper = new MarcaDTOMapper();

    @Override
    public Modelo mapToEntity(ModeloDTO dto) {
        Modelo modelo = new Modelo();
        modelo.setNombre(dto.nombre());
        return modelo;
    }

    @Override
    public ModeloDTO mapToDTO(Modelo target) {
        ModeloDTO modeloDTO = new ModeloDTO(marcaDTOMapper.mapToDTO(target.getMarca()), target.getReferencia(), target.getNombre());
        return modeloDTO;
    }
}
