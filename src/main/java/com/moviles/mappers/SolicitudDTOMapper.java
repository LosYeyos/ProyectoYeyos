package com.moviles.mappers;

import com.moviles.model.dtos.SolicitudDTO;
import com.moviles.model.entities.Solicitud;

public class SolicitudDTOMapper implements Mapper<SolicitudDTO, Solicitud> {

    private final AnuncioDTOMapper anuncioMapper = new AnuncioDTOMapper();
    private final UsuarioDTOMapper usuarioMapper = new UsuarioDTOMapper();

    @Override
    public Solicitud mapToEntity(SolicitudDTO dto) {
        Solicitud solicitud = new Solicitud();
        solicitud.setAnuncio(anuncioMapper.mapToEntity(dto.anuncio()));
        solicitud.setUsuarioSolicitante(usuarioMapper.mapToEntity(dto.usuarioSolicitante()));
        solicitud.setMensaje(dto.mensaje());
        solicitud.setEstado(dto.estado());
        solicitud.setFechaSolicitud(dto.fechaSolicitud());
        return solicitud;
    }
}