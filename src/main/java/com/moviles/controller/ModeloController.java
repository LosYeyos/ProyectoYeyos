package com.moviles.controller;

import com.moviles.model.dtos.ModeloDTO;
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
    public ResponseEntity<List<ModeloDTO>> get() {
        return modeloServiceImpl.findAll();
    }

    @GetMapping("findById")
    public ResponseEntity<ModeloDTO> getById(@RequestParam Long id) {
        return modeloServiceImpl.findById(id);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return modeloServiceImpl.delete(id);
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody ModeloDTO modelo) {
        return modeloServiceImpl.save(modelo);
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody ModeloDTO modelo, @RequestParam Long id) {
        return modeloServiceImpl.update(modelo, id);
    }
}
