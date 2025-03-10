package com.moviles.mappers;

import com.moviles.model.dtos.SolicitudDTO;
import com.moviles.model.entities.Solicitud;
import com.moviles.model.entities.Anuncio;
import com.moviles.model.entities.Usuario;
import com.moviles.model.entities.enums.EstadoSolicitud;

public class SolicitudDTOMapper implements Mapper<SolicitudDTO, Solicitud> {

    private final AnuncioDTOMapper anuncioMapper = new AnuncioDTOMapper();
    private final UsuarioEntityMapper usuarioMapper = new UsuarioEntityMapper();

    @Override
    public Solicitud map(SolicitudDTO dto) {
        Solicitud solicitud = new Solicitud();
        solicitud.setAnuncio(anuncioMapper.map(dto.anuncio()));
        solicitud.setUsuarioSolicitante(usuarioMapper.map(dto.usuarioSolicitante()));
        solicitud.setMensaje(dto.mensaje());
        solicitud.setEstado(dto.estado());
        solicitud.setFechaSolicitud(dto.fechaSolicitud());
        return solicitud;
    }
}