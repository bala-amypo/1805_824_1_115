package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.TemperatureRule;
import com.example.demo.service.TemperatureRuleService;

@RestController
@RequestMapping("/api/rules")
public class TemperatureRuleController {

    @Autowired
    private TemperatureRuleService ruleService;

    // POST /api/rules
    @PostMapping
    public TemperatureRule createRule(@RequestBody TemperatureRule rule) {
        return ruleService.createRule(rule);
    }

    // PUT /api/rules/{id}
    @PutMapping("/{id}")
    public TemperatureRule updateRule(
            @PathVariable Long id,
            @RequestBody TemperatureRule rule) {
        return ruleService.updateRule(id, rule);
    }

    // GET /api/rules/active
    @GetMapping("/active")
    public List<TemperatureRule> getActiveRules() {
        return ruleService.getActiveRules();
    }

    // GET /api/rules/product/{productType}?date=2025-01-01
    @GetMapping("/product/{productType}")
    public TemperatureRule getRuleForProduct(
            @PathVariable String productType,
            @RequestParam(required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate date) {
        return ruleService.getRuleForProduct(productType, date);
    }

    // GET /api/rules
    @GetMapping
    public List<TemperatureRule> getAllRules() {
        return ruleService.getAllRules();
    }
}
