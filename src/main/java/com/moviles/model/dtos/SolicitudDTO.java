package com.moviles.model.dtos;

import java.time.LocalDate;

import com.moviles.model.entities.enums.EstadoSolicitud;

public record SolicitudDTO(AnuncioDTO anuncio, UsuarioEmailDTO usuarioSolicitante, String mensaje, EstadoSolicitud estado, LocalDate fechaSolicitud) {

}
