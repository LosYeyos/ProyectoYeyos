package com.moviles.mappers;

import com.moviles.model.dtos.PostVentaDTO;
import com.moviles.model.entities.PostVenta;
import com.moviles.model.entities.Anuncio;

public class PostVentaDTOMapper implements Mapper<PostVentaDTO, PostVenta> {

    private final AnuncioDTOMapper anuncioMapper = new AnuncioDTOMapper();

    @Override
    public PostVenta map(PostVentaDTO dto) {
        PostVenta post = new PostVenta();
        post.setId(dto.id());
        post.setAnuncio(anuncioMapper.map(dto.anuncio()));
        //ahi no se que de estado minimo en el dto, pero no esta en ninguna clase, eso es como si existiese en la clase
        
        //post.   ¿¿setEstadoMinimo??   (dto.estadoMinimo());
        return post;
    }
}