package com.pigmalion.springwebfluxannotationdemo.services;

import com.pigmalion.springwebfluxannotationdemo.model.User;
import com.pigmalion.springwebfluxannotationdemo.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public void create () {
        Integer randomId = this.getRandomNumber();
        User user = new User();
        user.setId(randomId);
        user.setName("User Name");
        userRepository.save(user);
    }

    public List<User> getAll () {
        return userRepository.findAll();
    }

    public Integer getRandomNumber () {
        Random random = new Random();
        int limitRange = 100;
        int randomInt = random.nextInt(limitRange);
        return randomInt;
    }

}
