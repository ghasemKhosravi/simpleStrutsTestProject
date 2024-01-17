package com.project.action;

import com.project.dao.UserDao;
import com.project.entity.User;

public class RegisterAction {
    private String name;
    private String username;
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String execute(){
        User user = new User();
        user.setName(name);
        user.setUsername(username);
        user.setPass(pass);
        if (UserDao.register(user)==null)
            return "input";
        else
            return "success";
    }
}
