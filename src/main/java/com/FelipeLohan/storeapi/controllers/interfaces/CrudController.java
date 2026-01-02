package com.FelipeLohan.storeapi.controllers.interfaces;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CrudController<T, ID> {

    ResponseEntity<List<T>> findAll();

    ResponseEntity<T> findById(ID id);

    ResponseEntity<T> save(T entity);

    ResponseEntity<T> update(T entity, ID id);

    ResponseEntity<Void> delete(ID id);
}
