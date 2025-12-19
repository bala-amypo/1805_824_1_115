package com.example.demo.service;
import com.example.demo.entity.User;
import jakarta.pesistence.Service;

@Service
public interface UserService{
   public User registerUser(User user);       
   public User findByEmail(String email);


}