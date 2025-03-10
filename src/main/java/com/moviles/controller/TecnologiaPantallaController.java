package com.moviles.controller;

import com.moviles.model.dtos.TecnologiaPantallaDTO;
import com.moviles.model.entities.TecnologiaPantalla;
import com.moviles.services.implementation.TecnologiaPantallaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tecnologiaPantalla")
public class TecnologiaPantallaController {

    private TecnologiaPantallaServiceImpl pantallaServiceImpl;

    public TecnologiaPantallaController(TecnologiaPantallaServiceImpl pantallaServiceImpl) {
        this.pantallaServiceImpl = pantallaServiceImpl;
    }

    @GetMapping("find")
    public ResponseEntity<List<TecnologiaPantallaDTO>> get() {
        return pantallaServiceImpl.findAll();
    }

    @GetMapping("findById")
    public ResponseEntity<TecnologiaPantallaDTO> getById(@RequestParam Long id) {
        return pantallaServiceImpl.findById(id);
    }

    @DeleteMapping("borrar")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return pantallaServiceImpl.delete(id);
    }

    @PostMapping("crear")
    public ResponseEntity<Boolean> post(@RequestBody TecnologiaPantallaDTO tecnologiaPantalla) {
        return pantallaServiceImpl.save(tecnologiaPantalla);
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody TecnologiaPantallaDTO tecnologiaPantalla, @RequestParam Long id) {
        return pantallaServiceImpl.update(tecnologiaPantalla, id);
    }
}
