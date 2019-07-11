package com.pet.demo.repository;

import com.pet.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String username);
    User findByMobile(String mobile);
    User findByEmail(String email);
    User findByUsernameOrMobile(String loginName);
    List<User> findAllByUsernameLikeOrMobileLike(String keyword);
}
