package com.moviles.filter;

import com.moviles.model.entities.Movil;
import com.moviles.utils.Intervalo;

public class FilterByPrecio extends Filter<Intervalo<Double>> {
    public FilterByPrecio(Intervalo<Double> parameter) {
        super(parameter);
    }

    @Override
    public boolean filter(Movil item) {
        return item.getPrecio() >= parameter.getMin() && item.getPrecio() <= parameter.getMax();
    }
}
