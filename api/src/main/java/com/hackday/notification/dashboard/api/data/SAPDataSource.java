package com.hackday.notification.dashboard.api.data;

import com.hackday.notification.dashboard.api.model.CSVLineItem;
import com.hackday.notification.dashboard.api.model.NotificationRecord;
import com.hackday.notification.dashboard.api.util.CSVFileLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class SAPDataSource {

    @Autowired
    public CSVFileLoader csvFileLoader;
    public HashMap<String, NotificationRecord> dataSourceMap;

    public HashMap<String, NotificationRecord> getData() {
        //1.Load Data From CSV File
        List<CSVLineItem> csvLineItemList = csvFileLoader.loadCSVFile("SAP");

        //2. Create a Has Map with Key ArticleID and Value as NotificationRecord
        return new HashMap<>();
    }
}
