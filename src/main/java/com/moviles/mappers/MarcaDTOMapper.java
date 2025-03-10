package com.moviles.mappers;

import com.moviles.model.dtos.MarcaDTO;
import com.moviles.model.entities.Marca;

public class MarcaDTOMapper implements Mapper<MarcaDTO, Marca> {
    @Override
    public Marca mapToEntity(MarcaDTO dto) {
        Marca marca = new Marca();
        marca.setNombre(dto.nombre());
        return marca;
    }

    @Override
    public MarcaDTO mapToDTO(Marca target) {
        return new MarcaDTO(target.getNombre());
    }
}
