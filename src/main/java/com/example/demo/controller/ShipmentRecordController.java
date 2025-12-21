package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.Entityclass.User;
import com.example.demo.service.UserService;
import java.util.List;


@RestController
public class ShipmentRecordController{
    @Autowired
    ShipmentRecordService smr;
    @PostMapping("/rules")
    public User rules(@RequestBody ShipmentRecord record)
    {
        return crs.ShipmentRecord(record);
    }
    @GetMapping
    public List<User> getrules()
    {
        return crs.getAllRules();
    }

}