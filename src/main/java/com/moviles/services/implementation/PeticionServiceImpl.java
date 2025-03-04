package com.moviles.services.implementation;

import com.moviles.repositories.PeticionIntercambioRepository;
import com.moviles.repositories.PeticionVentaRepository;
import com.moviles.repositories.PostIntercambioRepository;
import com.moviles.repositories.PostVentaRepository;
import com.moviles.services.interfaces.PeticionService;
import org.springframework.stereotype.Service;

@Service
public class PeticionServiceImpl implements PeticionService {

    private final PeticionIntercambioRepository peticioniIntercambioRepository;
    private final PeticionVentaRepository peticionVentaRepository;
    private final PostIntercambioRepository postIntercambioRepository;
    private final PostVentaRepository postVentaRepository;

    public PeticionServiceImpl(PeticionIntercambioRepository peticioniIntercambioRepository, PeticionVentaRepository peticionVentaRepository, PostIntercambioRepository postIntercambioRepository, PostVentaRepository postVentaRepository) {
        this.peticioniIntercambioRepository = peticioniIntercambioRepository;
        this.peticionVentaRepository = peticionVentaRepository;
        this.postIntercambioRepository = postIntercambioRepository;
        this.postVentaRepository = postVentaRepository;
    }

    @Override
    public boolean createPeticionIntercambio() {
        return false;
    }

    @Override
    public boolean createPostIntercambio() {
        return false;
    }

    @Override
    public boolean createPeticionVenta() {
        return false;
    }

    @Override
    public boolean createPostVenta() {
        return false;
    }
}
