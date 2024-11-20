package service;

import dao.UserDAO;
import model.User;

import java.sql.SQLException;

// Insert ho rha hai ya nhi return success aur kuch bhi
public class UserService {
    public static Integer saveUser(User user) {
        try {
            if (UserDAO.isExist(user.getEmail())) {
                return 0;
            } else {
                return UserDAO.saveUser(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
