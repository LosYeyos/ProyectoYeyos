package com.moviles.mappers;

import com.moviles.model.dtos.UsuarioEmailDTO;
import com.moviles.model.entities.Usuario;

public class UsuarioEntityMapper implements Mapper<UsuarioEmailDTO, Usuario> {

    @Override
    public Usuario map(UsuarioEmailDTO source) {
        Usuario usuario = new Usuario();
        usuario.setEmail(source.email());
        usuario.setContrasena(source.contrasena());
        return usuario;
    }
}
