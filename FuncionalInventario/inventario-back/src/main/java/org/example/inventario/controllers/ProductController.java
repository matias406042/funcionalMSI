package org.example.inventario.controllers;

import org.example.inventario.dtos.ProductDTO;
import org.example.inventario.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/products")
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<ProductDTO> getProducts() {
        return productService.getProducts();
    }


}
