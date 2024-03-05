package com.hackday.notification.dashboard.api;

import com.hackday.notification.dashboard.api.model.NotificationRecord;
import com.hackday.notification.dashboard.api.services.SapReportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SapReportingController {
    @Autowired
    SapReportingService sapReportingService;

    @GetMapping("/sap-reporter/{articleId}")
    @ResponseBody
    public List<NotificationRecord> report(@PathVariable String articleId) {
        return null;
    }

}

