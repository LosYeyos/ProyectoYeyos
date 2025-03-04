package com.moviles.controller;

import com.moviles.model.entities.TecnologiaPantalla;
import com.moviles.services.interfaces.TecnologiaPantallaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tecnologiaPantalla")
public class TecnologiaPantallaController {

    private TecnologiaPantallaService pantallaService;

    public TecnologiaPantallaController(TecnologiaPantallaService pantallaRepository) {
        this.pantallaService = pantallaRepository;
    }

    @GetMapping("find")
    public ResponseEntity<List<TecnologiaPantalla>> get() {
        return ResponseEntity.ok(pantallaService.findAll());
    }
    @GetMapping("findById")
    public ResponseEntity<TecnologiaPantalla> getById(@RequestParam Long id) {
        return ResponseEntity.ok(pantallaService.findById(id).get());
    }

    @DeleteMapping("borrar")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return ResponseEntity.ok(pantallaService.delete(id));
    }

    @PostMapping("crear")
    public ResponseEntity<Boolean> post(@RequestBody TecnologiaPantalla tecnologiaPantalla) {
        return ResponseEntity.ok(pantallaService.save(tecnologiaPantalla));

    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody TecnologiaPantalla tecnologiaPantalla) {
        return ResponseEntity.ok(pantallaService.update(tecnologiaPantalla));

    }
}
