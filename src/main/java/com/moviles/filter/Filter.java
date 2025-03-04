package com.moviles.filter;

import com.moviles.model.entities.Movil;

public abstract class Filter<T> {
    protected T parameter;

    public Filter(T parameter) {
        this.parameter = parameter;
    }

    public abstract boolean filter(Movil item);
}
