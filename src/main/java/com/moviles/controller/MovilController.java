package com.moviles.controller;

import com.moviles.model.dtos.MovilDTO;
import com.moviles.model.entities.Movil;
import com.moviles.services.implementation.MovilServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/moviles")
public class MovilController {
    private final MovilServiceImpl movilService;

    public MovilController(MovilServiceImpl movilService) {
        this.movilService = movilService;
    }

    @GetMapping("all")
    public ResponseEntity<List<MovilDTO>> getAll() {
        return movilService.findAll();
    }

    @GetMapping("find")
    public ResponseEntity<List<MovilDTO>> get() {
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestBody Long key) {
        return ResponseEntity.notFound().build();
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody MovilDTO movil) {
        return ResponseEntity.notFound().build();
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody MovilDTO movil, @RequestParam Long key) {
        return ResponseEntity.notFound().build();
    }
}
