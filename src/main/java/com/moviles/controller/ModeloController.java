package com.moviles.controller;

import com.moviles.model.entities.Modelo;
import com.moviles.services.implementation.ModeloServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/modelo")
public class ModeloController {
    private ModeloServiceImpl modeloServiceImpl;

    public ModeloController(ModeloServiceImpl modeloServiceImpl) {
        this.modeloServiceImpl = modeloServiceImpl;
    }

    @GetMapping("find")
    public ResponseEntity<List<Modelo>> get() {
        return ResponseEntity.ok(modeloServiceImpl.findAll());
    }
    @GetMapping("findById")
    public ResponseEntity<Modelo> getById(@RequestParam Long id) {
        return ResponseEntity.ok(modeloServiceImpl.findById(id).get());
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return ResponseEntity.ok(modeloServiceImpl.delete(id));
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody Modelo modelo) {
        return ResponseEntity.ok(modeloServiceImpl.save(modelo));
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody Modelo modelo) {
        return ResponseEntity.ok(modeloServiceImpl.save(modelo));
    }
}
