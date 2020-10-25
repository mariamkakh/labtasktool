package com.java.automation.lab.fall.khamnava.core22.domain.enums;

import java.util.GregorianCalendar;

public enum PriorityOfTask {
    URGENT("Urgent-priority tasks are tasks that have to be dealt with immediately", 0xff2d00),
    HIGH("High-priority tasks are allowed to complete before any time " +
            "whatsoever is given to tasks of lower priority", 0xff8f00),
    MEDIUM("Medium-priority are tasks in the middle which cannot be classified as high or low",
            0xfcff00),
    LOW("Low-priority tasks are allowed to be postponed for some time", 0x5aff00);

    private String descripPrior;
    private int colorPrior;

    PriorityOfTask(String descripPrior, int colorPrior) {
        this.descripPrior = descripPrior;
        this.colorPrior = colorPrior;
    }

    public String descripPrior() { return descripPrior; }

    public int colorPrior() {
        return colorPrior;
    }
}
