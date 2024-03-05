package com.hackday.notification.dashboard.api.util;

import com.hackday.notification.dashboard.api.model.CSVLineItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CSVFileLoader {

    public List<CSVLineItem> loadCSVFile(String fileType){
        return new ArrayList<>();
    }
}
