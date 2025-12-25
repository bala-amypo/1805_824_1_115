package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import org.springframework.security.crypto.password.PasswordEncoder;

public class UserServiceImpl implements UserService {

    private final UserRepository repo;
    private final PasswordEncoder encoder;

    // IMPORTANT: constructor order must match test
    public UserServiceImpl(UserRepository repo, PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    @Override
    public User registerUser(User user) {

        // Test expects exception if email exists
        if (repo.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        // Password encoding (_ENC is added by mocked encoder)
        user.setPassword(encoder.encode(user.getPassword()));

        return repo.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return repo.findByEmail(email).orElseThrow();
    }
}
