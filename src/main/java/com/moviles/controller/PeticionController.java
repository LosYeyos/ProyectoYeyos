package com.moviles.controller;

import com.moviles.services.implementation.PeticionServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/peticion")
public class PeticionController {
    private final PeticionServiceImpl peticionService;

    public PeticionController(PeticionServiceImpl peticionService) {
        super();
        this.peticionService = peticionService;
    }
}
