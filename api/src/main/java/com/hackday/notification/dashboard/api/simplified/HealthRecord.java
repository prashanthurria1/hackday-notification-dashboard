package com.hackday.notification.dashboard.api.simplified;

public class HealthRecord {
    private boolean currentHealth;
    private boolean twentyFourHourHealth;


    public HealthRecord(boolean currentHealth, boolean twentyFourHourHealth) {
        this.currentHealth = currentHealth;
        this.twentyFourHourHealth = twentyFourHourHealth;
    }

    public boolean isCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(boolean currentHealth) {
        this.currentHealth = currentHealth;
    }

    public boolean isTwentyFourHourHealth() {
        return twentyFourHourHealth;
    }

    public void setTwentyFourHourHealth(boolean twentyFourHourHealth) {
        this.twentyFourHourHealth = twentyFourHourHealth;
    }
}

