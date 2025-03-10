package com.moviles.controller;

import com.moviles.model.dtos.ProcesadorDTO;
import com.moviles.model.entities.Procesador;
import com.moviles.services.implementation.ProcesadorServiceImpl;
import com.moviles.services.interfaces.ProcesadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/procesador")
public class ProcesadorController {
    private final ProcesadorServiceImpl procesadorServiceImpl;

    public ProcesadorController(ProcesadorServiceImpl procesadorServiceImpl) {
        this.procesadorServiceImpl = procesadorServiceImpl;
    }

    @GetMapping("find")
    public ResponseEntity<List<ProcesadorDTO>> get() {
        return procesadorServiceImpl.findAll();
    }
    @GetMapping("findById")
    public ResponseEntity<ProcesadorDTO> getById(@RequestParam Long id) {
        return procesadorServiceImpl.findById(id);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return procesadorServiceImpl.delete(id);
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody ProcesadorDTO procesador) {
        return procesadorServiceImpl.save(procesador);
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody ProcesadorDTO updateObject, @RequestParam Long id) {
        return procesadorServiceImpl.update(updateObject, id);
    }
}
