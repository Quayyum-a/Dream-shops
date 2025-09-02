package com.quayyum.dream_shops.repository;

import com.quayyum.dream_shops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
    
}
