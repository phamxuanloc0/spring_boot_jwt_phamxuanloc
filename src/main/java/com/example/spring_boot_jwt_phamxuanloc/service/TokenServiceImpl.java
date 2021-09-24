package com.example.spring_boot_jwt_phamxuanloc.service;

import com.example.spring_boot_jwt_phamxuanloc.entity.Token;
import com.example.spring_boot_jwt_phamxuanloc.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}

