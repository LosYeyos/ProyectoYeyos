package com.moviles.controller;

import com.moviles.model.dtos.UsuarioEmailDTO;
import com.moviles.model.entities.Usuario;
import com.moviles.services.implementation.UsuarioServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {
    private final UsuarioServiceImpl userService;

    public UsuarioController(UsuarioServiceImpl userService) {
        super();
        this.userService = userService;
    }

    //TODO: Implementar los métodos de la API REST para Usuario
    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> getAll() {
        return userService.findAll();
    }
}
