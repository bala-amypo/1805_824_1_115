package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TemperatureSensorLog;

public interface TemperatureSensorLogRepository extends JpaRepository<TemperatureSensorLog,Long>{
    List<TemperatureSensorLog> findByshipmentId(shipmentId);

}
