package com.example.demo.controller;
import java.util.List;
import com.example.demo.service.AlertService;
import com.example.demo.entity.AlertRecord;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class AlertController {
    @Autowired
    AlertService as;
    @PostMapping("/addcategory")
    public  AlertRecord create(@RequestBody Category cat){
        return as.addCategory(cat);
    }
    @GetMapping("/getall")
    public List<Category> listall(){
        return as.getAllCategory();
    }
    
}