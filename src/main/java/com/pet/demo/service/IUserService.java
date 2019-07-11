package com.pet.demo.service;

import com.pet.demo.entity.User;

import java.util.List;

public interface IUserService {
    User login(String loginName, String password);

    User findById(String id);

    User findByMobile(String mobile);

    User findByEmail(String email);

    User findByUsername(String username);

    List<User> list(String keyword);
}
