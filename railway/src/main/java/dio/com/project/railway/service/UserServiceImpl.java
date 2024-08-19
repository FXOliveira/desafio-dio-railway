package dio.com.project.railway.service.impl;

import dio.com.project.railway.model.User;
import dio.com.project.railway.repository.UserRepository;
import dio.com.project.railway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }
    @Override
    public User updateUserByid(Long id) {
        User user = userRepository.findById(id).get();
        userRepository.save(user);
        return user;
    }
    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
