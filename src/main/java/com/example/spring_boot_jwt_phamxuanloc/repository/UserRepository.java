package com.example.spring_boot_jwt_phamxuanloc.repository;

import com.example.spring_boot_jwt_phamxuanloc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
