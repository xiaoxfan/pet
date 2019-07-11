package com.pet.demo.service.impl;

import com.pet.demo.entity.User;
import com.pet.demo.repository.UserRepository;
import com.pet.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User login(String loginName, String password) {
        User user = userRepository.findByUsernameOrMobile(loginName);
        if (user!=null){

        }
        return user;
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User findByMobile(String mobile) {
        return userRepository.findByMobile(mobile);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> list(String keyword) {
        return userRepository.findAllByUsernameLikeOrMobileLike(keyword);
    }
}
