package com.moviles.model.dtos;

public record PeticionVentaDTO(Long id, UsuarioDTO solicitante, PostVentaDTO postVenta, boolean aceptada) {

}
