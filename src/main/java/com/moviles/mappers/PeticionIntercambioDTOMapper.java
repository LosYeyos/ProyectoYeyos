package com.moviles.mappers;

import com.moviles.model.dtos.PeticionIntercambioDTO;
import com.moviles.model.entities.PeticionIntercambio;

public class PeticionIntercambioDTOMapper implements Mapper<PeticionIntercambioDTO, PeticionIntercambio> {

    private final UsuarioDTOMapper usuarioMapper = new UsuarioDTOMapper();
    private final PostIntercambioDTOMapper postIntercambioMapper = new PostIntercambioDTOMapper();

    @Override
    public PeticionIntercambio mapToEntity(PeticionIntercambioDTO dto) {
        PeticionIntercambio peticion = new PeticionIntercambio();
        peticion.setSolicitante(usuarioMapper.mapToEntity(dto.solicitante()));
        peticion.setPostIntercambio(postIntercambioMapper.mapToEntity(dto.postIntercambio()));
        peticion.setPostIntercambioSolicitante(postIntercambioMapper.mapToEntity(dto.postIntercambioSolicitante()));
        peticion.setAceptada(dto.aceptada());
        return peticion;
    }
}