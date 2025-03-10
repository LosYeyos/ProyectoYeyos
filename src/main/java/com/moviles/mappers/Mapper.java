package com.moviles.mappers;

public interface Mapper<S, T> {
    public T mapToEntity(S source);
    public S mapToDTO(T target);
}
