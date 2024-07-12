package com.ecom.ecom_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductModel {

    @Id
    private int id;
    private String name;
    private String des;
    private String brand;
    private String category;
    private int price;
    private Date releaseDate;
    private boolean availability;
    private int quantity;
}
