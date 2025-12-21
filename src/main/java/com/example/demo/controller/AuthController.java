package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // POST /auth/register
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // POST /auth/login
    @PostMapping("/login")
    public User login(@RequestBody User loginRequest) {
        User user = userService.findByEmail(loginRequest.getEmail());

        if (!user.getPassword().equals(loginRequest.getPassword())) {
            throw new RuntimeException("Invalid email or password");
        }

        return user;
    }
}
