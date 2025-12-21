package com.example.demo.service.impl;

import com.example.demo.entity.AlertRecord;
import com.example.demo.repository.AlertRecordRepository;
import com.example.demo.service.AlertRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertRecordServiceImpl implements AlertRecordService {

    @Autowired
    private AlertRecordRepository alertRecordRepository;

    @Override
    public AlertRecord createAlertRecord(AlertRecord alert) {
        return alertRecordRepository.save(alert);
    }
}
