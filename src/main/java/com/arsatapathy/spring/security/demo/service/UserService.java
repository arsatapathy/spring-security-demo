package com.arsatapathy.spring.security.demo.service;

import com.arsatapathy.spring.security.demo.model.User;
import com.arsatapathy.spring.security.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> getUsers() {
        List<User> users = new LinkedList<>();
        userRepo.findAll().forEach(users::add);
        return users;
    }
}
