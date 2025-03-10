package com.moviles.mappers;

import com.moviles.model.dtos.PostVentaDTO;
import com.moviles.model.entities.PostVenta;

public class PostVentaDTOMapper implements Mapper<PostVentaDTO, PostVenta> {

    private final AnuncioDTOMapper anuncioMapper = new AnuncioDTOMapper();

    @Override
    public PostVenta mapToEntity(PostVentaDTO dto) {
        PostVenta post = new PostVenta();
        post.setAnuncio(anuncioMapper.mapToEntity(dto.anuncio()));
        //ahi no se que de estado minimo en el dto, pero no esta en ninguna clase, eso es como si existiese en la clase
        
        //post.   ¿¿setEstadoMinimo??   (dto.estadoMinimo());
        return post;
    }
}