package com.example.demo.service.impl;
import com.example.demo.repository.BreachDetectionRepository;
import com.example.demo.entity.BreachDetection;
import com.example.demo.service.BreachDectionService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BreachDetectionServiceImp implements BreachDetectionService{

    @Autowired
    BreachDetectionRepository bdr;
    public BreachDetection createBreachDetection(BreachDetection de){
        return smr.save(profile);
    }
}