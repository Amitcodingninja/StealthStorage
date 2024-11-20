package dao;

import db.MyConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public static boolean isExist(String email) throws SQLException {
        String query = "SELECT email FROM users WHERE email = ?";
        try (Connection connection = MyConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, email);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public static int saveUser(User user) throws SQLException {
        String query = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (Connection connection = MyConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            return ps.executeUpdate();
        }
    }
}
