package com.moviles.mappers;

import com.moviles.model.dtos.TecnologiaPantallaDTO;
import com.moviles.model.entities.TecnologiaPantalla;

public class TecnologiaPantallaDTOMapper implements Mapper<TecnologiaPantallaDTO, TecnologiaPantalla> {

    @Override
    public TecnologiaPantalla map(TecnologiaPantallaDTO dto) {
        TecnologiaPantalla tecnologia = new TecnologiaPantalla();
        tecnologia.setReferencia(dto.referencia());
        tecnologia.setTipo(dto.tipo());
        return tecnologia;
    }
}