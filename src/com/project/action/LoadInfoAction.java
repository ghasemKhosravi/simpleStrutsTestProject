package com.project.action;

import com.project.dao.ProductDao;
import com.project.entity.Product;

import java.math.BigDecimal;

public class LoadInfoAction {
    private int id;
    private String name;
    private String category;
    private BigDecimal price;
    public String execute(){
        Product product = ProductDao.getProductById(id);
        name = product.getName();
        category = product.getCategory();
        price = product.getPrice();
        return "success";
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
}
