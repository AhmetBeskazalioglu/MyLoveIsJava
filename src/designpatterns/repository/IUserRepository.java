package designpatterns.repository;

import java.util.List;

public interface IUserRepository {
    List<User> getAllUsers();
    User getUserById(int id);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
