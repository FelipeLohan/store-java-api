package com.FelipeLohan.storeapi.services.interfaces;

import java.util.List;

public interface CrudService<T, ID>{

    List<T> findAll();

    T findById(ID id);

    T save(T entity);

    T update(T entity, ID id);

    void delete(ID id);
}
