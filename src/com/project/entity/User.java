package com.project.entity;

import java.sql.Timestamp;

public class User {

    private int id;
    private String name;
    private String username;
    private String pass;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Timestamp deleted_at;

    public User() {
    }

    public User(int id, String name, String username, String pass, Timestamp created_at, Timestamp updated_at, Timestamp deleted_at) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.pass = pass;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
    }

    public User(String name, String username, String pass, Timestamp created_at, Timestamp updated_at, Timestamp deleted_at) {
        this.name = name;
        this.username = username;
        this.pass = pass;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", deleted_at=" + deleted_at +
                '}';
    }
}
