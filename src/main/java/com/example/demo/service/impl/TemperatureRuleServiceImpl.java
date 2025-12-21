package com.example.demo.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TemperatureRule;
import com.example.demo.repository.TemperatureRuleRepository;
import com.example.demo.service.TemperatureRuleService;

@Service
public class TemperatureRuleServiceImpl implements TemperatureRuleService {

    @Autowired
    private TemperatureRuleRepository ruleRepo;

    @Override
    public TemperatureRule createRule(TemperatureRule rule) {
        if (rule.getMinTemp() >= rule.getMaxTemp()) {
            throw new RuntimeException("Min temperature must be less than max temperature");
        }
        return ruleRepo.save(rule);
    }

    @Override
    public TemperatureRule updateRule(Long id, TemperatureRule rule) {
        TemperatureRule existing = ruleRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Rule not found"));

        if (rule.getMinTemp() >= rule.getMaxTemp()) {
            throw new RuntimeException("Min temperature must be less than max temperature");
        }

        existing.setProductType(rule.getProductType());
        existing.setMinTemp(rule.getMinTemp());
        existing.setMaxTemp(rule.getMaxTemp());
        existing.setActive(rule.getActive());
        existing.setEffectiveFrom(rule.getEffectiveFrom());
        existing.setEffectiveTo(rule.getEffectiveTo());

        return ruleRepo.save(existing);
    }

    @Override
    public List<TemperatureRule> getActiveRules() {
        return ruleRepo.findByActiveTrue();
    }

    @Override
    public TemperatureRule getRuleForProduct(String productType, LocalDate date) {
        if (date == null) {
            date = LocalDate.now();
        }

        return ruleRepo
                .findFirstByProductTypeAndActiveTrueAndEffectiveFromLessThanEqualAndEffectiveToGreaterThanEqual(
                        productType, date, date)
                .orElseThrow(() -> new RuntimeException("No active rule found for product"));
    }

    @Override
    public List<TemperatureRule> getAllRules() {
        return ruleRepo.findAll();
    }
}
