package com.quayyum.dream_shops.repository;

import com.quayyum.dream_shops.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
