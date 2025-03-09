package com.moviles.mappers;

import com.moviles.model.dtos.MarcaDTO;
import com.moviles.model.entities.Marca;

public class MarcaDTOMapper implements Mapper<MarcaDTO, Marca> {
    @Override
    public Marca map(MarcaDTO dto) {
        Marca marca = new Marca();
        marca.setNombre(dto.nombre());
        return marca;
    }
}
