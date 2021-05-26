package com.example.rest.api.controller;

import com.example.rest.api.model.User;
import com.example.rest.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("/getAllUsers")
    public List<User> getUsers(){
        return service.getUser();
    }

    @RequestMapping("/getUserById/{id}")
    public User getCourse(@PathVariable String id){
        return service.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/addUser")
    public void addCourses(@RequestBody User user){
        service.addUser(user);
    }


    @RequestMapping(method = RequestMethod.DELETE, value="/deleteUserById/{id}")
    public void deleteCourse(@PathVariable String id){
        service.deleteUser(id);
    }
}
