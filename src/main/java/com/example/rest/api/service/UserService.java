package com.example.rest.api.service;

import com.example.rest.api.exception.UserNotFoundException;
import com.example.rest.api.model.User;
import com.example.rest.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> getUser(){
        List<User> users = new ArrayList<>();
        repository.findAll().forEach(users::add);     //iterable
        return users;
    }

    public User getUser(String id) {
        return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    public void addUser(User user) {
        repository.save(user);
    }
    public void deleteUser(String id) {
        repository.deleteById(id);
    }
    }

