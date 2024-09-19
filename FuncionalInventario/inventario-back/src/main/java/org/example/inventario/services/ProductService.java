package org.example.inventario.services;

import org.example.inventario.dtos.ProductDTO;

import java.util.ArrayList;

public interface ProductService {
    ArrayList<ProductDTO> getProducts();
}
