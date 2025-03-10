package com.moviles.mappers;

import com.moviles.model.dtos.ProcesadorDTO;
import com.moviles.model.entities.Procesador;

public class ProcesadorDTOMapper implements Mapper<ProcesadorDTO, Procesador> {

    @Override
    public Procesador map(ProcesadorDTO dto) {
        Procesador procesador = new Procesador();
        procesador.setReferencia(dto.referencia());
        procesador.setNombre(dto.nombre());
        procesador.setNumeroNucleos(dto.numeroNucleos());
        procesador.setMaxGHz(dto.maxGHz());
        return procesador;
    }
}