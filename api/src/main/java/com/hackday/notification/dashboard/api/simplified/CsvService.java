package com.hackday.notification.dashboard.api.simplified;

import org.springframework.stereotype.Service;
import org.springframework.core.io.ResourceLoader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvService {

    public List<Record> readRecordsFromCsv(String filePath) {
        List<Record> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Read header to skip it
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Record record = new Record(values[0], values[1], values[2], values[3], values[4]);
                records.add(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}

