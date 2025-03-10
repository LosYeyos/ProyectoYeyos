package com.moviles.mappers;

import com.moviles.model.dtos.PeticionVentaDTO;
import com.moviles.model.entities.PeticionVenta;
import com.moviles.model.entities.Usuario;
import com.moviles.model.entities.PostVenta;

public class PeticionVentaDTOMapper implements Mapper<PeticionVentaDTO, PeticionVenta> {

    private final UsuarioEntityMapper usuarioMapper = new UsuarioEntityMapper();
    private final PostVentaDTOMapper postVentaMapper = new PostVentaDTOMapper();

    @Override
    public PeticionVenta map(PeticionVentaDTO dto) {
        PeticionVenta peticion = new PeticionVenta();
        peticion.setUsuarioSolicitante(usuarioMapper.map(dto.solicitante()));
        peticion.setPostVenta(postVentaMapper.map(dto.postVenta()));
        peticion.setAceptada(dto.aceptada());
        return peticion;
    }
}