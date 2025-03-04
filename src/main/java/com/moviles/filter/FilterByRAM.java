package com.moviles.filter;

import com.moviles.model.entities.Movil;
import com.moviles.utils.Intervalo;

public class FilterByRAM extends Filter<Intervalo<Integer>> {
    public FilterByRAM(Intervalo<Integer> parameter) {
        super(parameter);
    }

    @Override
    public boolean filter(Movil item) {
        return item.getRAM() >= parameter.getMin() && item.getRAM() <= parameter.getMax();
    }
}
