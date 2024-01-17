package com.project.action;

import com.project.dao.ProductDao;
import com.project.entity.Product;

import java.math.BigDecimal;

public class AddAction {
    private String name;
    private String category;
    private BigDecimal price;

    public String execute(){
        Product product = new Product();
        product.setName(name);
        product.setCategory(category);
        product.setPrice(price);
        if(ProductDao.addProduct(product)==null)
            return "error";
        else
            return "success";
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
