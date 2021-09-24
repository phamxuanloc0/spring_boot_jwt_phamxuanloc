package com.example.spring_boot_jwt_phamxuanloc.service;

import com.example.spring_boot_jwt_phamxuanloc.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
