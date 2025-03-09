package com.moviles.model.dtos;

public record PeticionVentaDTO(Long id, UsuarioEmailDTO solicitante, PostVentaDTO postVenta, boolean aceptada) {

}
