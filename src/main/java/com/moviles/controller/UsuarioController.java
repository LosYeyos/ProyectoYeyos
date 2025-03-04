package com.moviles.controller;

import com.moviles.services.implementation.UsuarioServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
    private final UsuarioServiceImpl userService;

    public UsuarioController(UsuarioServiceImpl userService) {
        super();
        this.userService = userService;
    }

    //TODO: Implementar los métodos de la API REST para Usuario
    @PostMapping("new")
    public ResponseEntity<Boolean> createUser() { return null; }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam String username) {
        return null;
    }
}
