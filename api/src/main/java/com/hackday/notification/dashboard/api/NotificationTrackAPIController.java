package com.hackday.notification.dashboard.api;

import com.hackday.notification.dashboard.api.model.NotificationRecord;
import com.hackday.notification.dashboard.api.services.NotificationTrackAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class NotificationTrackAPIController {

    @Autowired
    NotificationTrackAPIService notificationTrackAPIService;

    @GetMapping("/notification-track-api")
    @ResponseBody
    public Map<String, List<NotificationRecord>> report(@PathVariable String articleId) {
        return notificationTrackAPIService.report(articleId);
    }
}
