package com.project.dbUtils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productManagement","root","root");
            return connection;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public static void closeConnection(Connection connection){
        try {
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
