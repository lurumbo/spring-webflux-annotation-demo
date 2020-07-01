package com.pigmalion.springwebfluxannotationdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pigmalion.springwebfluxannotationdemo.model.User;


public interface IUserRepository extends JpaRepository<User, Long> {
}
