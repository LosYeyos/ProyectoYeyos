package com.moviles.mappers;


import com.moviles.model.dtos.UsuarioEmailDTO;
import com.moviles.model.entities.Usuario;

public class UsuarioEmailDTOMapper implements Mapper<UsuarioEmailDTO, Usuario> {
    @Override
    public UsuarioEmailDTO mapToDTO(Usuario source) {
        return new UsuarioEmailDTO(source.getEmail(), source.getContrasena());
    }

    @Override
    public Usuario mapToEntity(UsuarioEmailDTO target) {
        Usuario usuario = new Usuario();
        usuario.setEmail(target.email());
        usuario.setContrasena(target.contrasena());
        return usuario;
    }
}
