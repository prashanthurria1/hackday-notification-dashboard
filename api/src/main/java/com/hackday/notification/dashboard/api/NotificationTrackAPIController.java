package com.hackday.notification.dashboard.api;

import com.hackday.notification.dashboard.api.model.NotificationRecord;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class NotificationTrackAPIController {
    @GetMapping("/notification-track-api")
    @ResponseBody
    public Map<String, List<NotificationRecord>> report(@PathVariable String articleId) {

        Map<String, List<NotificationRecord>> records = new HashMap<>();
        records.put("sap",new ArrayList<>());
        records.put("tnh",new ArrayList<>());
        records.put("ens",new ArrayList<>());
        records.put("sfmc",new ArrayList<>());
        return records;

    }
}
