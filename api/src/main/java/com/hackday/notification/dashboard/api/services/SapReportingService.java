package com.hackday.notification.dashboard.api.services;

import com.hackday.notification.dashboard.api.data.SAPDataSource;
import com.hackday.notification.dashboard.api.model.NotificationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SapReportingService {

    @Autowired
    SAPDataSource sapDataSource;


    public List<NotificationRecord> getNotificationRecord(String articleID) {
        return null;
    }
}
