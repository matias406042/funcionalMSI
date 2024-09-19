package com.example.product.service;

import com.example.product.DTO.ProductDTO;
import com.example.product.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    ProductDTO createProduct(ProductDTO productDTO);
    List<Product> getAllProducts();
}
