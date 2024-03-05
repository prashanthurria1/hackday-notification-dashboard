package com.hackday.notification.dashboard.api.simplified;

import com.hackday.notification.dashboard.api.model.NotificationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    private final CsvService csvService;

    @Autowired
    public ReportController(CsvService csvService) {
        this.csvService = csvService;
    }

    @GetMapping("/{articleID}")
    public Map<String, List<Record>> report(@PathVariable String articleID) {

        Map<String, List<Record>> records = new HashMap<>();

        String filePathSAP = "./src/main/resources/SAP-data-" + articleID + ".csv"; // Adjust the directory path as needed
        List<Record> SAPReport = csvService.readRecordsFromCsv(filePathSAP);

        String filePathTNH = "./src/main/resources/TNH-data-" + articleID + ".csv"; // Adjust the directory path as needed
        List<Record> TNHReport = csvService.readRecordsFromCsv(filePathTNH);

        String filePathENS = "./src/main/resources/ENS-data-" + articleID + ".csv"; // Adjust the directory path as needed
        List<Record> ENSReport = csvService.readRecordsFromCsv(filePathENS);

        String filePathTIBCO = "./src/main/resources/TIBCO-data-" + articleID + ".csv"; // Adjust the directory path as needed
        List<Record> TIBCOReport = csvService.readRecordsFromCsv(filePathTIBCO);

        String filePathSFMC = "./src/main/resources/SFMC-data-" + articleID + ".csv"; // Adjust the directory path as needed
        List<Record> SFMCReport = csvService.readRecordsFromCsv(filePathSFMC);

        records.put("sap", SAPReport);
        records.put("tnh", TNHReport);
        records.put("ens", ENSReport);
        records.put("tibco", TIBCOReport);
        records.put("sfmc", SFMCReport);

        return records;
    }
}



