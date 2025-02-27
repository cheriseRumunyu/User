package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
     List<User>  getAllUsers(User user) {
       return userService.getAllUsers();

    }

    @GetMapping("/{id}")
    List<User>  getUserById(@PathVariable("id") Long id) {
         userService.getUserById( id);
return userService.getAllUsers();
    }
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.addUser(User user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/age/{id}")
    public int getUserAge(@PathVariable Long id) {
        userService.getUserAge(id);
        return 0;
    }

}
