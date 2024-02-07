package spring_boot.web.spring_boot312.dao;

import spring_boot.web.spring_boot312.model.User;


import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();
    public User getUserById(long id);
    public void deleteUserById(long id);
    public void updateUser(User user);
    public void addUser(User user);
}
