package com.project.action;

import com.project.dao.ProductDao;

public class DeleteAction {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String execute(){
        if (ProductDao.deleteProduct(id))
            return "success";
        else
            return "false";
    }

}
