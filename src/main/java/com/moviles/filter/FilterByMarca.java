package com.moviles.filter;

import com.moviles.model.entities.Movil;

public class FilterByMarca extends Filter<String>{
    public FilterByMarca(String parameter) {
        super(parameter);
    }

    @Override
    public boolean filter(Movil item) {
        return item.getMarcaName().equals(parameter);
    }
}
