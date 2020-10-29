package com.java.automation.lab.fall.khamnava.core22.domain;

public class Milestone {
    private String nameMilestone;
    private String typeMilestone;

    public Milestone(String nameMilestone, String typeMilestone) {
        this.nameMilestone = nameMilestone;
        this.typeMilestone = typeMilestone;
    }

    public String getNameMilestone() { return this.nameMilestone; }

    public void setNameMilestone() { this.nameMilestone = nameMilestone; }

    public String getTypeMilestone() { return this.typeMilestone; }

    public void setTypeMilestone(String typeMilestone) { this.typeMilestone = typeMilestone; }

    @Override
    public String toString() {
        return "Sprint {\n\tnameMilestone: " + nameMilestone +
                "\n\ttypeMilestone: " + typeMilestone +
                "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        return nameMilestone.equals(((Milestone) that).nameMilestone) &&
                typeMilestone.equals(((Milestone) that).typeMilestone);
    }

    public int hashCode(){
        return getNameMilestone().hashCode() + getTypeMilestone().hashCode();
    }
}
