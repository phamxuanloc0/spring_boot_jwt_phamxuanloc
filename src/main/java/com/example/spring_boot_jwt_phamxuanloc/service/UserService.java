package com.example.spring_boot_jwt_phamxuanloc.service;

import com.example.spring_boot_jwt_phamxuanloc.authen.UserPrincipal;
import com.example.spring_boot_jwt_phamxuanloc.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
