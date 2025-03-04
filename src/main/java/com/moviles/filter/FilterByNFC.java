package com.moviles.filter;

import com.moviles.model.entities.Movil;

public class FilterByNFC extends Filter<Boolean>{
    public FilterByNFC(boolean parameter) {
        super(parameter);
    }

    @Override
    public boolean filter(Movil item) {
        return item.hasNFC() == parameter;
    }
}
