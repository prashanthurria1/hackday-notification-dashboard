package com.hackday.notification.dashboard.api.services;

import com.hackday.notification.dashboard.api.model.NotificationRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NotificationTrackAPIService {
    public Map<String, List<NotificationRecord>> report( String articleId) {

        Map<String, List<NotificationRecord>> records = new HashMap<>();
        records.put("sap",new ArrayList<>());
        records.put("tnh",new ArrayList<>());
        records.put("ens",new ArrayList<>());
        records.put("sfmc",new ArrayList<>());
        return records;

    }
}
