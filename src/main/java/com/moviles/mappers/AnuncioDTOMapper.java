package com.moviles.mappers;

import com.moviles.model.dtos.AnuncioDTO;
import com.moviles.model.entities.Anuncio;

public class AnuncioDTOMapper implements Mapper<AnuncioDTO, Anuncio> {

    private final MovilDTOMapper movilDTOMapper = new MovilDTOMapper();

    @Override
    public Anuncio map(AnuncioDTO dto) {
        Anuncio anuncio = new Anuncio();
        anuncio.setId(dto.id());
        anuncio.setMovil(movilDTOMapper.map(dto.movil()));
        anuncio.setEstadoMovil(dto.estadoMovil());
        anuncio.setTipoCambio(dto.tipoCambio());
        anuncio.setFechaPublicacion(dto.fechaPublicacion());
        anuncio.setEstadoAnuncio(dto.estadoAnuncio());
        return anuncio;
    }
}