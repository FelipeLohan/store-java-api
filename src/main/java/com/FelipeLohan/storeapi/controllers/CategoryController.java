package com.FelipeLohan.storeapi.controllers;

import com.FelipeLohan.storeapi.controllers.interfaces.ICategoryController;
import com.FelipeLohan.storeapi.entities.Category;
import com.FelipeLohan.storeapi.services.interfaces.ICategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/category")
public class CategoryController implements ICategoryController {

    private ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories = categoryService.findAll();

        return ResponseEntity.ok(categories);
    }

    @Override
    public ResponseEntity<Category> findById(UUID id) {
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<Category> save(@RequestBody Category category) {
        Category createdCategory = categoryService.save(category);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
    }

    @Override
    public ResponseEntity<Category> update(Category entity, UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(UUID id) {
        return null;
    }
}
