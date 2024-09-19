package com.example.product.service.impl;

import com.example.product.DTO.ProductDTO;
import com.example.product.exception.ProductExistException;
import com.example.product.domain.Product;
import com.example.product.service.ProductService;
import com.example.product.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        if (productRepository.findByName(productDTO.getName()).isPresent()) {
            throw new ProductExistException("Ya existe un producto con el mismo nombre");
        }
        if(productDTO.getName().equals("")){
            throw new ProductExistException("El nombre no puede estar vacio");
        }

        Product product = modelMapper.map(productDTO, Product.class);
        product = productRepository.save(product);

        return modelMapper.map(product, ProductDTO.class);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


}
