package com.moviles.services.interfaces;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CrudInterface<T, K> {
    ResponseEntity<T> findById(K id);
    ResponseEntity<List<T>> findAll();
    ResponseEntity<Boolean> save(T entity);
    ResponseEntity<Boolean> delete(K id);
    ResponseEntity<Boolean> update(T entity);
}
