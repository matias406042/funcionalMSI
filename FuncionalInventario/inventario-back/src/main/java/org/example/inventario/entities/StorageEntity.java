package org.example.inventario.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "storage")
public class StorageEntity {
    @Id
    private Long id;
    private String name;
    private Integer last_updated_user;
    private Integer last_updated_date;
    private Integer created_date;
}
