package com.pigmalion.springwebfluxannotationdemo.services;

import com.pigmalion.springwebfluxannotationdemo.model.User;
import com.pigmalion.springwebfluxannotationdemo.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public List<User> getAll () {
        return userRepository.findAll();
    }

    public void create (User user) {
        userRepository.save(user);
    }

}
