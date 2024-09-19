package com.example.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductExistException.class)
    public ResponseEntity<ErrorResponse> handleProductAlreadyExistsException(ProductExistException ex) {
        ErrorResponse error = new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }
}
