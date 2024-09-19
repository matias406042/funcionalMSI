package org.example.inventario.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class ProductEntity {
    @Id
    @Column
    private Long id;
    @Column
    private boolean reusable;
    @ManyToMany()
    @Column
    private List<StorageEntity> storage;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Date created_date;
    @Column
    private Date last_updated_date;
    @Column
    private Integer last_updated_user;
    @Column
    private Integer amount;
    @Column
    private double price;
}
