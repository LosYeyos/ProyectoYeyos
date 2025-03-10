package com.moviles.mappers;

import com.moviles.model.dtos.PeticionIntercambioDTO;
import com.moviles.model.entities.PeticionIntercambio;
import com.moviles.model.entities.Usuario;
import com.moviles.model.entities.PostIntercambio;

public class PeticionIntercambioDTOMapper implements Mapper<PeticionIntercambioDTO, PeticionIntercambio> {

    private final UsuarioEntityMapper usuarioMapper = new UsuarioEntityMapper();
    private final PostIntercambioDTOMapper postIntercambioMapper = new PostIntercambioDTOMapper();

    @Override
    public PeticionIntercambio map(PeticionIntercambioDTO dto) {
        PeticionIntercambio peticion = new PeticionIntercambio();
        peticion.setSolicitante(usuarioMapper.map(dto.solicitante()));
        peticion.setPostIntercambio(postIntercambioMapper.map(dto.postIntercambio()));
        peticion.setPostIntercambioSolicitante(postIntercambioMapper.map(dto.postIntercambioSolicitante()));
        peticion.setAceptada(dto.aceptada());
        return peticion;
    }
}