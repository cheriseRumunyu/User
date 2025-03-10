package com.example.user.service;

import com.example.user.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void addUser(User user);
    void deleteUser(Long id);

    void getUserAge(Long dob);
}
