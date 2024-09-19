package org.example.inventario.services;

import org.example.inventario.dtos.ProductDTO;
import org.example.inventario.entities.ProductEntity;
import org.example.inventario.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ArrayList<ProductDTO> getProducts() {
        ArrayList<ProductDTO> productDTOS = new ArrayList<>();
        for (ProductEntity entity : productRepository.findAll()) {
            productDTOS.add(modelMapper.map(entity, ProductDTO.class));
        }
        return productDTOS;
    }
}
