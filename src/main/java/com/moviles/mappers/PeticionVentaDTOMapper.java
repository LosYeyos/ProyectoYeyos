package com.moviles.mappers;

import com.moviles.model.dtos.PeticionVentaDTO;
import com.moviles.model.entities.PeticionVenta;

public class PeticionVentaDTOMapper implements Mapper<PeticionVentaDTO, PeticionVenta> {

    private final UsuarioDTOMapper usuarioMapper = new UsuarioDTOMapper();
    private final PostVentaDTOMapper postVentaMapper = new PostVentaDTOMapper();

    @Override
    public PeticionVenta mapToEntity(PeticionVentaDTO dto) {
        PeticionVenta peticion = new PeticionVenta();
        peticion.setUsuarioSolicitante(usuarioMapper.mapToEntity(dto.solicitante()));
        peticion.setPostVenta(postVentaMapper.mapToEntity(dto.postVenta()));
        peticion.setAceptada(dto.aceptada());
        return peticion;
    }
}