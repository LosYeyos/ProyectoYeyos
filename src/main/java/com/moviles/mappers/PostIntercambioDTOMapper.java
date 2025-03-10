package com.moviles.mappers;

import com.moviles.model.dtos.PostIntercambioDTO;
import com.moviles.model.entities.PostIntercambio;
import com.moviles.model.entities.Anuncio;

public class PostIntercambioDTOMapper implements Mapper<PostIntercambioDTO, PostIntercambio> {

    private final AnuncioDTOMapper anuncioMapper = new AnuncioDTOMapper();

    @Override
    public PostIntercambio map(PostIntercambioDTO dto) {
        PostIntercambio post = new PostIntercambio();
        post.setId(dto.id());
        post.setAnuncio(anuncioMapper.map(dto.anuncio()));
        post.setEstadoMinimo(dto.estadoMinimo());
        return post;
    }
}