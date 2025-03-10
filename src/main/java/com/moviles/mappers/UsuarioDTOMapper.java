package com.moviles.mappers;

import com.moviles.model.dtos.UsuarioDTO;
import com.moviles.model.dtos.UsuarioEmailDTO;
import com.moviles.model.entities.Usuario;

public class UsuarioDTOMapper implements Mapper<UsuarioDTO, Usuario> {

    @Override
    public Usuario mapToEntity(UsuarioDTO source) {
        Usuario usuario = new Usuario();
        usuario.setNombre(source.nombre());
        usuario.setEmail(source.email());
        usuario.setContrasena(source.contrasena());
        return usuario;
    }

    @Override
    public UsuarioDTO mapToDTO(Usuario target) {
        UsuarioDTO usuarioDTO = new UsuarioDTO(target.getNombre(), target.getEmail(), target.getContrasena());
        return usuarioDTO;
    }
}
