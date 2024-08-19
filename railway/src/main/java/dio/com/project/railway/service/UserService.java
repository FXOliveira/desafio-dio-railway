package dio.com.project.railway.service;

import dio.com.project.railway.model.User;

import java.util.List;

public interface UserService {

    public void createUser(User user);
    public List<User> getAllUsers();
    public User getUserById(Long id);
    public User updateUserByid(Long id);
    public void deleteUserById(Long id);

}
