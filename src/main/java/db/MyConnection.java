package db;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection; // connection ke liye

    public static Connection getConnection() {

        try {
            // class load
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/filehandler?useSSl=false", "root", "Thakur#123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connection create ho gya");
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }


}