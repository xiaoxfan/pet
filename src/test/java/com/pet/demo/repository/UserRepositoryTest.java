package com.pet.demo.repository;

import com.pet.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void test1(){
        User user = new User();
        user.setMobile("1234567921");
        user.setPassword("123456");
        user.setUsername("xiaofan76");
        user.setRole(0);
        User save = userRepository.save(user);
        System.out.println(save);
        System.out.println(userRepository.findById(save.getId()));
    }
}