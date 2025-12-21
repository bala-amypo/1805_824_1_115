package com.example.demo.service.impl;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AlertRecordServiceImpl implements AlertRecordService{

    @Autowired
    AlertRecordRepository arr;
    public ShipmentRecord createAlertRecord(AlertRecord alert){
        return arr.save(alert);
    }
}