package com.example.demo.service.impl;
import com.example.demo.repository.AlertRecordRepository;
import com.example.demo.entity.AlertRecord;
import com.example.demo.service.AlertRecordService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class AlertRecordServiceImpl implements AlertRecordService{

    @Autowired
    AlertRecordRepository arr;
    public AlertRecord triggerAlert(AlertRecord alert){
        return arr.save(alert);
    }
    public List<AlertRecord> getAlertsByShipment(Long shipmentId){
        return arr.findById(shipmentId);
    }
    public List<AlertRecord> getAllAlerts(){
        return arr.findAll();
    }

}