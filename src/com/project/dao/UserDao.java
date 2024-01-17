package com.project.dao;

import com.project.dbUtils.ConnectionProvider;
import com.project.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

    public static User checkLogin(String username, String pass) {
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where username =? and pass=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, pass);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = new User(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getString("username"), resultSet.getString("pass"),
                        resultSet.getTimestamp("created_at"), resultSet.getTimestamp("updated_at"),
                        resultSet.getTimestamp("deleted_at")
                );
                ConnectionProvider.closeConnection(connection);
                return user;
            }
            ConnectionProvider.closeConnection(connection);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static User register(User user) {
        if (!checkExistByUserName(user.getUsername())) {

            try {
                Connection connection = ConnectionProvider.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into users(name,username,pass) values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getUsername());
                preparedStatement.setString(3, user.getPass());
                if (preparedStatement.executeUpdate() > 0) {
                    ResultSet resultSet = preparedStatement.getGeneratedKeys();
                    if (resultSet.next()) {
                        user.setId(resultSet.getInt(1));
                        ConnectionProvider.closeConnection(connection);
                        return user;
                    }
                }
                ConnectionProvider.closeConnection(connection);
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static boolean checkExistByUserName(String username) {
        try {
            boolean checkExist = false;
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where username = ?");
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            checkExist = resultSet.next();
            ConnectionProvider.closeConnection(connection);
            return checkExist;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
