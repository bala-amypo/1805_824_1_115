package com.example.demo.controller;

import com.example.demo.entity.TemperatureRule;
import com.example.demo.service.TemperatureRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/rules")
public class TemperatureRuleController {

    @Autowired
    private TemperatureRuleService temperatureRuleService;

    // POST /api/rules - Create rule
    @PostMapping
    public ResponseEntity<TemperatureRule> createRule(
            @RequestBody TemperatureRule rule) {
        return ResponseEntity.ok(temperatureRuleService.createRule(rule));
    }

    // PUT /api/rules/{id} - Update rule
    @PutMapping("/{id}")
    public ResponseEntity<TemperatureRule> updateRule(
            @PathVariable Long id,
            @RequestBody TemperatureRule rule) {
        return ResponseEntity.ok(
                temperatureRuleService.updateRule(id, rule));
    }

    // GET /api/rules/active - List active rules
    @GetMapping("/active")
    public ResponseEntity<List<TemperatureRule>> getActiveRules() {
        return ResponseEntity.ok(
                temperatureRuleService.getActiveRules());
    }

    // GET /api/rules/product/{productType}?date=YYYY-MM-DD
    @GetMapping("/product/{productType}")
    public ResponseEntity<TemperatureRule> getRuleByProduct(
            @PathVariable String productType,
            @RequestParam(required = false) LocalDate date) {
        return ResponseEntity.ok(
                temperatureRuleService.getRuleByProductType(productType, date));
    }

    // GET /api/rules - List all rules
    @GetMapping
    public ResponseEntity<List<TemperatureRule>> getAllRules() {
        return ResponseEntity.ok(
                temperatureRuleService.getAllRules());
    }
}
