package com.moviles.services.interfaces;

import java.util.Optional;

public interface CrudInterface<T, K> {
    Optional<T> findById(K id);

    boolean create(T entity);
    boolean delete(K id);
    boolean update(T entity);
}
