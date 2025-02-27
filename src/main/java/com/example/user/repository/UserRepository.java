package com.example.user.repository;

import com.example.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    List<User> findAll();
    void save(User user);
    void delete(User user);
    void update(User user);
    void deleteById(Long id);
    User findById(Long id);
    void create(User user);
    void read(User user);

    void findByAge(Long dob);
}
