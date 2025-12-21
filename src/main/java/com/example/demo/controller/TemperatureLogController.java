 package com.example.demo.TemperatureLogController;
import java.util.List;
import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.AlertService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class TemperatureLogController{
    
    @Autowired
    private TemperatureLogService tm;

    @PostMapping("/log")
    public TemperatureSensorLog create(@RequestBody TemperatureSensorLog log){
        return as.recordLog(sensor)
    }

    @GetMapping("/addtemp")
        public List<TemperatureSensorLog> listtemp(){
            return as.getAllLogs();
        }
    
        @GetMapping("/getid")
            public Optional<TemperatureSensorLog>getbyid(@PathVariable Long id){
                return as.getLogById(id);
            }

            @GetMapping
        
    

}