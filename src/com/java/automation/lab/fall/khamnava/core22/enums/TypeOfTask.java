package com.java.automation.lab.fall.khamnava.core22.enums;

public enum TypeOfTask {
    INCIDENTAL("Incidental tasks are tasks which appear " +
            "in an unplanned or subordinate conjunction with something else"),
    ROUTINE("Routine tasks refers to the day to day standard tasks routinely " +
            "carried out in a job or organisation"),
    PROJECT("Project tasks are sets of activities for one or more people with defined objectives, " +
            "outcomes and timeline"),
    PROBLEM("Problem tasks are task in which a person must recognize the nature of a problem " +
            "and analyse it in order to propose strategies for its solution");

    private String descripType;

    TypeOfTask(String descripType) {
        this.descripType = descripType;
    }

    public String descripType() {
        return descripType;
    }


}
