package com.moviles.model.dtos;

import com.moviles.model.entities.enums.UsuarioRole;

public record UsuarioEmailDTO(Long id, String email, String nombre, String contraseña, UsuarioRole role) {

}
