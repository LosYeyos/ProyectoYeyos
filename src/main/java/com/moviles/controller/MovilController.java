package com.moviles.controller;

import com.moviles.model.entities.Movil;
import com.moviles.services.implementation.MovilServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/movil")
public class MovilController {
    private final MovilServiceImpl movilService;

    public MovilController(MovilServiceImpl movilService) {
        this.movilService = movilService;
    }

    @GetMapping("find")
    public ResponseEntity<List<Movil>> get() {
        return ResponseEntity.ok(movilService.findAll());
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestBody Long key) {
        return ResponseEntity.ok(movilService.delete(key));
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody Movil movil) {
        return ResponseEntity.ok(movilService.save(movil));
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody Movil movil) {
        return ResponseEntity.ok(movilService.update(movil));
    }
}
