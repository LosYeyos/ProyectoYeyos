package com.moviles.model.dtos;

public record PeticionIntercambioDTO(UsuarioEmailDTO solicitante, PostIntercambioDTO postIntercambio, PostIntercambioDTO postIntercambioSolicitante, boolean aceptada) {

}
