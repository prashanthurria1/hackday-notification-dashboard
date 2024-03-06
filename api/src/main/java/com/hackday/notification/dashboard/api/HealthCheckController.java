package com.hackday.notification.dashboard.api;

import com.hackday.notification.dashboard.api.simplified.CsvService;
import com.hackday.notification.dashboard.api.simplified.HealthRecord;
import com.hackday.notification.dashboard.api.simplified.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthCheckController {

    private final CsvService csvService;

    @Autowired
    public HealthCheckController(CsvService csvService) {
        this.csvService = csvService;
    }

    @GetMapping("/health")
    public Map<String, HealthRecord> report() {
        String filePathHealth = "./src/main/resources/" + "HealthCheck.csv"; // Adjust the directory path as needed
        return csvService.getHealthRecord(filePathHealth);
    }
}



