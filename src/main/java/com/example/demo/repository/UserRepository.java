package com.example.demo.repository;

import org.sprinframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.UserRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    
}