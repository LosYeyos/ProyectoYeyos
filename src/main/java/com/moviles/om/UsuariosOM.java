package com.moviles.om;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entities.Usuario;
import com.moviles.model.entities.enums.UsuarioRole;

public class UsuariosOM {

	public List<Usuario> getData() {
        List<Usuario> lista = new ArrayList<>();
        
        Usuario usuario = new Usuario();
        usuario.setEmail("1234@gmail.com");
        usuario.setNombre("Juan");
        usuario.setContrasena("1234");
        usuario.setRole(UsuarioRole.ADMIN);
        lista.add(usuario);
        
        Usuario usuario2 = new Usuario();
        usuario2.setEmail("9876@gmail.com");
        usuario2.setNombre("Pedro");
        usuario2.setContrasena("9876");
        usuario2.setRole(UsuarioRole.USER);
        lista.add(usuario2);
        
        Usuario usuario3 = new Usuario();
        usuario3.setEmail("5671@gmail.com");
        usuario3.setNombre("Maria");
        usuario3.setContrasena("5671");
        usuario3.setRole(UsuarioRole.USER);
        lista.add(usuario3);
        
        
		return lista;
        
        		
	
	}
  
}
