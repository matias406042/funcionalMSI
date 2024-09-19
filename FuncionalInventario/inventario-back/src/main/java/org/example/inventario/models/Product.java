package org.example.inventario.models;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Long id;
    private boolean reusuable;
    private Storage storage;
    private String name;
    private String description;
    private Date created_date;//no va
    private Date last_updated_date;//nova
    private Integer last_updated_user;//nova
    private Integer amount;

}
