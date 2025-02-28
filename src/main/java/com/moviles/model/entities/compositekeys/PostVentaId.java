package com.moviles.model.entities.compositekeys;

import com.moviles.model.entities.Anuncio;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

public class PostVentaId implements Serializable {
    private Long anuncio;

    public PostVentaId() {
    }

    public PostVentaId(Long anuncio) {
        this.anuncio = anuncio;
    }

    public Long getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Long anuncio) {
        this.anuncio = anuncio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostVentaId that = (PostVentaId) o;
        return Objects.equals(anuncio, that.anuncio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anuncio);
    }
}
