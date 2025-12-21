package com.example.demo.service.impl;

import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse register(RegisterRequest request) {
        return new AuthResponse("User registered successfully", null);
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return new AuthResponse("Login successful", null);
    }
}
