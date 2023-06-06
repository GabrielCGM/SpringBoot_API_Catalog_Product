package com.catalog.product.models;

import jakarta.persistence.*;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_products")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private UUID id;

    @Column(nullable = false, length = 25)
    private String name;
    @Column(nullable = false, length = 20)
    private String brand;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Integer stock;

    public ProductModel(){};
    public ProductModel(String name, String brand, String description, Integer stock) {
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

}
