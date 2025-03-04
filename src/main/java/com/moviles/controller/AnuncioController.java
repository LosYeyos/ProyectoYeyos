package com.moviles.controller;

import com.moviles.services.implementation.AnuncioServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/anuncio")
public class AnuncioController {
    private final AnuncioServiceImpl anuncioServiceImpl;

    public AnuncioController(AnuncioServiceImpl anuncioServiceImpl) {
        super();
        this.anuncioServiceImpl = anuncioServiceImpl;
    }

    //TODO: Implementar los métodos de la API REST para Anuncio
}
