package com.quayyum.dream_shops.service.product;

import com.quayyum.dream_shops.request.AddProductRequest;
import com.quayyum.dream_shops.request.ProductUpdateRequest;
import com.quayyum.dream_shops.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
