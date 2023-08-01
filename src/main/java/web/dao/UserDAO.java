package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    User deleteUser(int id);

    void update(User updateUser);
}
