package com.example.demo.service.impl;
import com.example.demo.repository.BreachDetectionRepository;
import com.example.demo.entity.BreachDetection;
import com.example.demo.service.BreachDectionService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BreachDetectionServiceImpl implements BreachDetectionService{

    @Autowired
    BreachDetectionRepository bdr;
    public BreachDetection createBreachDetection(BreachDetection detection){
        return bdr.save(detection);
    }
}