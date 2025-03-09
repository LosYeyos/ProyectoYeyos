package com.moviles.model.dtos;

public record PeticionIntercambioDTO(Long id, UsuarioEmailDTO solicitante, PostIntercambioDTO postIntercambio, PostIntercambioDTO postIntercambioSolicitante, boolean aceptada) {

}
