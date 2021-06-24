package com.kitkat.repository;

import org.springframework.data.repository.CrudRepository;

import com.kitkat.model.UserDao;

public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}