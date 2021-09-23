package com.example.spring_boot_jwt_phamxuanloc.service;

import com.example.spring_boot_jwt_phamxuanloc.entity.User;
import com.example.spring_boot_jwt_phamxuanloc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }
}
