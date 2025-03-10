package com.moviles.om;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entities.PostVenta;
import com.moviles.model.entities.Anuncio;

public class PostVentaOM {

    private AnuncioOM anuncioOM;

    public PostVentaOM(AnuncioOM anuncioOM) {
        this.anuncioOM = anuncioOM;
    }

    public List<PostVenta> getData() {
        List<PostVenta> postVentas = new ArrayList<>();
        List<Anuncio> anuncios = anuncioOM.getData();

        PostVenta postVenta1 = new PostVenta();
        postVenta1.setAnuncio(anuncios.get(0));
        postVentas.add(postVenta1);

        PostVenta postVenta2 = new PostVenta();
        postVenta2.setAnuncio(anuncios.get(1));
        postVentas.add(postVenta2);

        return postVentas;
    }
}