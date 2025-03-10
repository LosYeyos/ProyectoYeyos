package com.moviles.mappers;

import com.moviles.model.dtos.PostIntercambioDTO;
import com.moviles.model.entities.PostIntercambio;

public class PostIntercambioDTOMapper implements Mapper<PostIntercambioDTO, PostIntercambio> {

    private final AnuncioDTOMapper anuncioMapper = new AnuncioDTOMapper();

    @Override
    public PostIntercambio mapToEntity(PostIntercambioDTO dto) {
        PostIntercambio post = new PostIntercambio();
        post.setAnuncio(anuncioMapper.mapToEntity(dto.anuncio()));
        post.setEstadoMinimo(dto.estadoMinimo());
        return post;
    }
}