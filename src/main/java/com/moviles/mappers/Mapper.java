package com.moviles.mappers;

public interface Mapper<S, T> {
    public T map(S source);
}
