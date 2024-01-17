package com.project.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Product {
    private int id;
    private String name;
    private String category;
    private BigDecimal price;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Timestamp deleted_at;

    public Product() {
    }

    public Product(int id, String name, String category, BigDecimal price, Timestamp created_at, Timestamp updated_at, Timestamp deleted_at) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
    }

    public Product(String name, String category, BigDecimal price, Timestamp created_at, Timestamp updated_at, Timestamp deleted_at) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public Timestamp getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Timestamp deleted_at) {
        this.deleted_at = deleted_at;
    }
}
