package com.moviles.mappers;


import com.moviles.model.dtos.UsuarioEmailDTO;
import com.moviles.model.entities.Usuario;

public class UsuarioDTOMapper implements Mapper<Usuario, UsuarioEmailDTO> {
    @Override
    public UsuarioEmailDTO map(Usuario source) {
        return new UsuarioEmailDTO(source.getEmail(), source.getContrasena());
    }
}
