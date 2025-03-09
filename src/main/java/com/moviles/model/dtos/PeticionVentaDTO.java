package com.moviles.model.dtos;

public record PeticionVentaDTO(UsuarioEmailDTO solicitante, PostVentaDTO postVenta, boolean aceptada) {

}
