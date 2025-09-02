package com.quayyum.dream_shops.service.product;

import com.quayyum.dream_shops.dto.request.AddProductRequest;
import com.quayyum.dream_shops.exceptions.ProductNotFoundException;
import com.quayyum.dream_shops.model.Category;
import com.quayyum.dream_shops.model.Product;
import com.quayyum.dream_shops.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService{
    private final ProductRepository productRepository;
    @Override
    public Product addProduct(AddProductRequest request) {

        return null;
    }
    private Product createProduct(AddProductRequest request, Category category) {
        return new Product(
                request.getName(),
                request.getBrand(),
                request.getPrice(),
                request.getInventory(),
                request.getDescription(),
                category
        );
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository
                .findById(id)
                .ifPresentOrElse(productRepository::delete,  () -> {
                    throw new ProductNotFoundException("Product not found");
                });
    }

    @Override
    public Product updateProduct(Product product, Long productId) {
        return null;
    }

    @Override
    public List<Product> getProductsByCategory(String category) {

        return productRepository.findByCategoryName(category);
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {

        return productRepository.findByBrand(brand);
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {

        return productRepository.findByCategoryNameAndBrand(category, brand);
    }

    @Override
    public List<Product> getProductsByName(String name) {

        return productRepository.findByName(name);
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {

        return productRepository.findByBrandAndName(brand, name);
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return productRepository.countProductsByBrandAndName(brand, name);
    }
}
