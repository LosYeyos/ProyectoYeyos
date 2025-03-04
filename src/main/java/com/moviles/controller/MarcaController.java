package com.moviles.controller;

import com.moviles.model.entities.Marca;
import com.moviles.services.implementation.MarcaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/marca")
public class MarcaController {

    private MarcaServiceImpl marcaServiceImpl;

    public MarcaController(MarcaServiceImpl marcaServiceImpl) {
        this.marcaServiceImpl = marcaServiceImpl;
    }

    @GetMapping("find")
    public ResponseEntity<List<Marca>> get() {
        return ResponseEntity.ok(marcaServiceImpl.findAll());
    }
    @GetMapping("findById")
    public ResponseEntity<Marca> getById(@RequestParam Long id) {
        return ResponseEntity.ok(marcaServiceImpl.findById(id).get());
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return ResponseEntity.ok(marcaServiceImpl.delete(id));
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody Marca marca) {
        return ResponseEntity.ok(marcaServiceImpl.save(marca));
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody Marca marca) {
        return ResponseEntity.ok(marcaServiceImpl.update(marca));
    }
}
