package com.hackday.notification.dashboard.api.simplified;

public class Record {
    private String articleID;
    private String correlationID;
    private String milestone;
    private String system;
    private String status;

    // Constructor
    public Record(String articleID, String correlationID, String milestone, String system, String status) {
        this.articleID = articleID;
        this.correlationID = correlationID;
        this.milestone = milestone;
        this.system = system;
        this.status = status;
    }

    // Getters and setters
    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }

    public String getCorrelationID() {
        return correlationID;
    }

    public void setCorrelationID(String correlationID) {
        this.correlationID = correlationID;
    }

    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

