package com.quayyum.dream_shops.repository;

import com.quayyum.dream_shops.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  Category findByName(String name);
}