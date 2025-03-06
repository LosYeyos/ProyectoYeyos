package com.moviles.controller;

import com.moviles.model.entities.Procesador;
import com.moviles.services.interfaces.ProcesadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/procesador")
public class ProcesadorController {
    private final ProcesadorService procesadorService;

    public ProcesadorController(ProcesadorService procesadorService) {
        this.procesadorService = procesadorService;
    }

    @GetMapping("find")
    public ResponseEntity<List<Procesador>> get() {
        return ResponseEntity.notFound().build();
    }
    @GetMapping("findById")
    public ResponseEntity<Procesador> getById(@RequestParam Long id) {
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return ResponseEntity.notFound().build();
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody Procesador procesador) {
        return ResponseEntity.notFound().build();
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody Procesador updateObject) {
        return ResponseEntity.notFound().build();
    }
}
