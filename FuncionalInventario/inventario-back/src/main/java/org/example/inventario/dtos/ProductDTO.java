package org.example.inventario.dtos;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Integer amount;
    private boolean reusable;
}
