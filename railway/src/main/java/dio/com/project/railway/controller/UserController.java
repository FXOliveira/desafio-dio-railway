package dio.com.project.railway.controller;

import dio.com.project.railway.model.User;
import dio.com.project.railway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/")
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }
    @PostMapping("/{id}")
    public void updateUserById(@PathVariable("id") Long id){
        userService.updateUserByid(id);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Long id){
        userService.deleteUserById(id);
    }

}
