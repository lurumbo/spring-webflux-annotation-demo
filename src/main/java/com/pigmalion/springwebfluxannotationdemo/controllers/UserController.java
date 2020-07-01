package com.pigmalion.springwebfluxannotationdemo.controllers;

import com.pigmalion.springwebfluxannotationdemo.model.User;
import com.pigmalion.springwebfluxannotationdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAll () {
       return userService.getAll();
    }

    // just for random and faster inserts
    @GetMapping("/create")
    public String create () {
        userService.create();
        return "New user created";
    }

}
