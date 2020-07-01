package com.pigmalion.springwebfluxannotationdemo.controllers;

import com.pigmalion.springwebfluxannotationdemo.model.User;
import com.pigmalion.springwebfluxannotationdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAll () {
       return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById (@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @PostMapping
    public String create (@RequestBody User user) {
        userService.create(user);
        return "New user created";
    }

}
