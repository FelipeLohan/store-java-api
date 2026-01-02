package com.FelipeLohan.storeapi.services;

import com.FelipeLohan.storeapi.entities.Category;
import com.FelipeLohan.storeapi.repositories.CategoryRepository;
import com.FelipeLohan.storeapi.services.interfaces.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryService implements ICategoryService {

    private CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public Category findById(UUID id) {
        return repository.findById(id)
                .orElseThrow();
    }

    @Override
    public Category save(Category entity) {
        return repository.save(entity);
    }

    @Override
    public Category update(Category entity, UUID id) {
        entity.setId(id);
        return repository.save(entity);
    }


    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
