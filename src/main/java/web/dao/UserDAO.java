package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);

}
