package com.moviles.model.dtos;

public record PeticionIntercambioDTO(Long id, UsuarioDTO solicitante, PostIntercambioDTO postIntercambio, PostIntercambioDTO postIntercambioSolicitante, boolean aceptada) {

}
