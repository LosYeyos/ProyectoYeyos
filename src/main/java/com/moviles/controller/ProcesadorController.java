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
        return ResponseEntity.ok(procesadorService.findAll());
    }
    @GetMapping("findById")
    public ResponseEntity<Procesador> getById(@RequestParam Long id) {
        return ResponseEntity.ok(procesadorService.findById(id).get());
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return ResponseEntity.ok(procesadorService.delete(id));
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody Procesador procesador) {
        return ResponseEntity.ok(procesadorService.save(procesador));
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody Procesador updateObject) {
        return ResponseEntity.ok(procesadorService.update(updateObject));
    }
}
