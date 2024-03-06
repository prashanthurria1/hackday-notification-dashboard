package com.hackday.notification.dashboard.api;

import com.hackday.notification.dashboard.api.model.NotificationRecord;
import com.hackday.notification.dashboard.api.services.NotificationTrackAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class NotificationTrackUIController {

    @Autowired
    NotificationTrackAPIService notificationTrackAPIService;

    @GetMapping("/notification-track-ui/{articleId}")
    @ResponseBody
    public String generateReport(@PathVariable String articleId) {
        return "Hello World " + articleId;
        //return notificationTrackAPIService.report(articleId);
    }
}
