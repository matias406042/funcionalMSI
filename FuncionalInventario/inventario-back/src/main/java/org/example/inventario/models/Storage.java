package org.example.inventario.models;

import lombok.Data;

@Data
public class Storage {
    private Long id;
    private String name;
    private Integer last_updated_user;
    private Integer last_updated_date;
    private Integer created_date;
}
