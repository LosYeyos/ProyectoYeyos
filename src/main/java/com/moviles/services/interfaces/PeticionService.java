package com.moviles.services.interfaces;

import com.moviles.model.entities.PostIntercambio;

//TODO: hacer las interfaces correctaemnte segun el JPA
public interface PeticionService {
    boolean createPeticionIntercambio();

    boolean createPostIntercambio();

    boolean createPeticionVenta();

    boolean createPostVenta();


}
