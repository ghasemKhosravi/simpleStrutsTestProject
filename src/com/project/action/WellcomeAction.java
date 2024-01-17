package com.project.action;

import com.project.dao.ProductDao;
import com.project.entity.Product;

import java.util.List;

public class WellcomeAction {
    List<Product> products;
    public String execute(){
        initializeProducts();
        return "success";
    }
    private void initializeProducts(){
        products = ProductDao.getAllProduct();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
