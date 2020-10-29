package com.java.automation.lab.fall.khamnava.core22.domain.enums;

public enum StatusOfTask {
    TODO("Task is appointed in the future and has not yet been started"),
    IN_PROGRESS("Task has been started and the progress is ahead of schedule"),
    DONE("Task is successfully completed"),
    BLOCKED("Task has been started and stopped before complication");

    private String descripStatus;

    StatusOfTask(String descripStatus) {
        this.descripStatus = descripStatus;
    }

    public String descripStatus() { return descripStatus; }


}
