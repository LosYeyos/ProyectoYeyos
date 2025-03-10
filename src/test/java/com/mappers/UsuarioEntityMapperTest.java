package com.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.moviles.mappers.UsuarioEntityMapper;
import com.moviles.model.dtos.UsuarioEmailDTO;
import com.moviles.model.entities.Usuario;
import com.moviles.om.UsuariosOM;

class UsuarioEntityMapperTest {

    @Test
    void testMapUsuarioEmailDTOToUsuario() {
        // Crear datos de prueba usando UsuariosOM
        UsuariosOM usuariosOM = new UsuariosOM();
        Usuario usuario = usuariosOM.getData().get(0); // Obtener el primer usuario

        // Crear un DTO a partir de la entidad
        UsuarioEmailDTO usuarioEmailDTO = new UsuarioEmailDTO(
                usuario.getEmail(),
                usuario.getContrasena()
        );

        // Mapear DTO a entidad
        UsuarioEntityMapper mapper = new UsuarioEntityMapper();
        Usuario result = mapper.map(usuarioEmailDTO);

        // Verificar resultados
        assertNotNull(result);
        assertEquals(usuarioEmailDTO.email(), result.getEmail());
        assertEquals(usuarioEmailDTO.contrasena(), result.getContrasena());
    }
}