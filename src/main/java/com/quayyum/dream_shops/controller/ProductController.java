package com.quayyum.dream_shops.controller;


import com.quayyum.dream_shops.model.Product;
import com.quayyum.dream_shops.response.ApiResponse;
import com.quayyum.dream_shops.service.product.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/products")
public class ProductController {
    private IProductService productService;

    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(new ApiResponse("All products found!", products));
    }

    public ResponseEntity<ApiResponse> getProductById(Long id){

    }
}
