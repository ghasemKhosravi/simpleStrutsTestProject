package com.project.dao;

import com.project.dbUtils.ConnectionProvider;
import com.project.entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public static List<Product> getAllProduct() {
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from products");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Product> list = new ArrayList<>();
            while (resultSet.next()) {
                Product product = new Product(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getString("category"), resultSet.getBigDecimal("price"),
                        resultSet.getTimestamp("created_at"), resultSet.getTimestamp("updated_at"),
                        resultSet.getTimestamp("deleted_at"));
                list.add(product);
            }
            ConnectionProvider.closeConnection(connection);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Product getProductById(int id) {
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from products where id =?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product = null;
            if (resultSet.next()) {
                product = new Product(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getString("category"), resultSet.getBigDecimal("price"),
                        resultSet.getTimestamp("created_at"), resultSet.getTimestamp("updated_at"),
                        resultSet.getTimestamp("deleted_at"));

            }
            ConnectionProvider.closeConnection(connection);
            return product;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Product addProduct(Product product) {
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into products(name,category,price) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getCategory());
            preparedStatement.setBigDecimal(3, product.getPrice());
            if (preparedStatement.executeUpdate() > 0) {
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    product.setId(resultSet.getInt(1));
                    ConnectionProvider.closeConnection(connection);
                    return product;
                }
                ConnectionProvider.closeConnection(connection);
                return null;
            }
            ConnectionProvider.closeConnection(connection);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean updateProduct(Product newProdcut, int id) {
        try (
                Connection connection = ConnectionProvider.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("update products set name=?,category=?,price=?,updated_at=? where id=?");
        ) {
            preparedStatement.setString(1, newProdcut.getName());
            preparedStatement.setString(2, newProdcut.getCategory());
            preparedStatement.setBigDecimal(3, newProdcut.getPrice());
            preparedStatement.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setInt(5, id);
            return (preparedStatement.executeUpdate() > 0);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static boolean deleteProduct(int id) {
        try (
                Connection connection = ConnectionProvider.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("delete from products where id = ?");
        ) {
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
