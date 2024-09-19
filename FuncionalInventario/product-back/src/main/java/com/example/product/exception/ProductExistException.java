package com.example.product.exception;

import lombok.Getter;

@Getter
public class ProductExistException extends RuntimeException {

    public ProductExistException(String message) {
        super(message);
    }
}
