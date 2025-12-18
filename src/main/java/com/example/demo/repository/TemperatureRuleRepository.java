package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TemperatureRule;

public interface TemperatureRuleRepository extends JpaRepository<TemperatureRule,Long>(){

}
