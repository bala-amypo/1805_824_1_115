package com.example.demo.service;
import com.example.demo.entity.TemperatureRule;
import jakarta.persistence.Service;

public interface TemperatureRuleService{
    public TemperatureRule createRule(TemperatureRule rule);
    public TemperatureRule updateRule(Long id,TemperatureRule rule);
    public TemperatureRule getActiveRules();
    public TemperatureRule getRuleForProduct(String productType,LocalDate date);
    public TemperatureRule grtAllRules();
}