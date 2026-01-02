package com.FelipeLohan.storeapi.repositories;

import com.FelipeLohan.storeapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
