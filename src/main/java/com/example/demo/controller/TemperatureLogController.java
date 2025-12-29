// package com.example.demo.controller;

// import com.example.demo.entity.TemperatureSensorLog;
// import com.example.demo.service.TemperatureLogService;
// import io.swagger.v3.oas.annotations.security.SecurityRequirement;

// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/logs")
// @SecurityRequirement(name="bearerAuth")
// public class TemperatureLogController {

//     private final TemperatureLogService service;

//     public TemperatureLogController(TemperatureLogService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public TemperatureSensorLog record(@RequestBody TemperatureSensorLog log) {
//         return service.recordLog(log);
//     }

//     @GetMapping("/shipment/{shipmentId}")
//     public List<TemperatureSensorLog> byShipment(@PathVariable Long shipmentId) {
//         return service.getLogsByShipment(shipmentId);
//     }
// }
package com.example.demo.controller;

import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.List;

@RestController
@RequestMapping("/logs")
@SecurityRequirement(name = "bearerAuth")
public class TemperatureLogController {

    private final TemperatureLogService temperatureLogService;

    public TemperatureLogController(TemperatureLogService temperatureLogService) {
        this.temperatureLogService = temperatureLogService;
    }

    @PostMapping
    public ResponseEntity<TemperatureSensorLog> recordLog(
            @RequestBody TemperatureSensorLog log) {

        return ResponseEntity.ok(
                temperatureLogService.recordLog(log)
        );
    }

    @GetMapping
    public ResponseEntity<List<TemperatureSensorLog>> getAllLogs() {
        return ResponseEntity.ok(
                temperatureLogService.getAllLogs()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<TemperatureSensorLog> getLogById(
            @PathVariable Long id) {

        TemperatureSensorLog log =
                temperatureLogService.getLogById(id);

        if (log == null) {
            return ResponseEntity.badRequest().build(); 
        }

        return ResponseEntity.ok(log);
    }

    @GetMapping("/shipment/{shipmentId}")
    public ResponseEntity<List<TemperatureSensorLog>> getLogsByShipmentId(
            @PathVariable Long shipmentId) {

        List<TemperatureSensorLog> logs =
                temperatureLogService.getLogsByShipment(shipmentId);

        if (logs.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(logs);
    }
}
