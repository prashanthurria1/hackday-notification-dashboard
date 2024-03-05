package com.hackday.notification.dashboard.api.services;

import com.hackday.notification.dashboard.api.model.NotificationRecord;
import org.springframework.stereotype.Service;

@Service
public class SapReportingService {
    public NotificationRecord getNotificationRecord(String articleID) {
        NotificationRecord notificationRecord = new NotificationRecord();
        notificationRecord.correlationID = "abc";
        notificationRecord.milestone = "Despacthed";
        notificationRecord.status = "ok";
        return notificationRecord;
    }
}
