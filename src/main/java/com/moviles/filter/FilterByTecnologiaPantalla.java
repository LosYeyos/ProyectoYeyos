package com.moviles.filter;

import com.moviles.model.entities.Movil;

public class FilterByTecnologiaPantalla extends Filter<String>{
    public FilterByTecnologiaPantalla(String parameter) {
        super(parameter);
    }

    @Override
    public boolean filter(Movil item) {
        return item.getTecnologiaPantalla().equals(parameter);
    }
}
