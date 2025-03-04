package com.moviles.services.interfaces;

import java.util.List;
import java.util.Optional;

public interface CrudInterface<T, K> {
    Optional<T> findById(K id);
    List<T> findAll();
    boolean save(T entity);
    boolean delete(K id);
    boolean update(T entity);
}
