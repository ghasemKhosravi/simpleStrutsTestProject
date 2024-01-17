package com.project.action;

import com.project.dao.UserDao;

public class LoginAction {
    private String userName;
    private String pass;

    public String execute(){
        if (UserDao.checkLogin(userName,pass)==null)
            return "input";
        else
            return "success";

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
