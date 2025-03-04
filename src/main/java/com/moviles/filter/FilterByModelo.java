package com.moviles.filter;

import com.moviles.model.entities.Movil;

public class FilterByModelo extends Filter<String>{
    public FilterByModelo(String parameter) {
        super(parameter);
    }

    @Override
    public boolean filter(Movil item) {
        return item.getModelName().equals(parameter);
    }
}
