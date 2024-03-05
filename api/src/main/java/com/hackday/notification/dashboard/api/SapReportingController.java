package com.hackday.notification.dashboard.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SapReportingController {

    @GetMapping("/sap-reporter")
    @ResponseBody
    public String sayHello(@RequestParam(name = "articleId", required = false, defaultValue = "ABC") String articleId) {
        return "Hello World";
    }

}

