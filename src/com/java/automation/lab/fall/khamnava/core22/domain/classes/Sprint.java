package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import java.time.OffsetDateTime;
import java.util.Arrays;

public class Sprint {
    private OffsetDateTime beginOfSprint;
    private OffsetDateTime endOfSprint;
    private AbstractUser[] membersOfSprint;
    private VisualBoard visualization;
    private Task[] tasksOfScript;
    private int maxStoryPoints;

    public Sprint(OffsetDateTime beginOfSprint, OffsetDateTime endOfSprint, AbstractUser[] membersOfSprint,
                  VisualBoard visualization, Task[] tasksOfScript, int maxStoryPoints) {
        this.beginOfSprint = beginOfSprint;
        this.endOfSprint = endOfSprint;
        this.membersOfSprint = membersOfSprint;
        this.visualization = visualization;
        this.tasksOfScript = tasksOfScript;
        this.maxStoryPoints = maxStoryPoints;
    }

    public OffsetDateTime getBeginOfSprint() { return this.beginOfSprint; }

    public void setBeginOfSprint(OffsetDateTime beginOfSprint) { this.beginOfSprint = beginOfSprint; }

    public OffsetDateTime getEndOfSprint() { return this.endOfSprint; }

    public void setEndOfSprint(OffsetDateTime endOfSprint) { this.endOfSprint = endOfSprint; }

    public AbstractUser[] getMembersOfSprint() { return this.membersOfSprint; }

    public void setMembersOfSprint(AbstractUser[] membersOfSprint) { this.membersOfSprint = membersOfSprint; }

    public VisualBoard getVisualization() { return this.visualization; }

    public void setVisualization(VisualBoard visualization) { this.visualization = visualization; }

    public Task[] getTasksOfScript() { return this.tasksOfScript; }

    public void setTasksOfScript(Task[] tasksOfScript) { this.tasksOfScript = tasksOfScript; }

    public int getMaxStoryPoints() { return this.maxStoryPoints; }

    public void setMaxStoryPoints(int maxStoryPoints) { this.maxStoryPoints = maxStoryPoints; }

    @Override
    public String toString() {
        return "Sprint {\n\ttasksOfSprint:" + tasksOfScript.toString() +
                "\n\tbeginOfString: " + beginOfSprint.toString() +
                "\n\tendOfSprint: " + endOfSprint.toString() +
                "\n\tmembersOfSprint: " + membersOfSprint.toString() +
                "\n\tmaxStoryPoints: " + maxStoryPoints +
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
        return getBeginOfSprint().equals(((Sprint) that).getBeginOfSprint()) &&
                getEndOfSprint().equals(((Sprint) that).getEndOfSprint()) &&
                Arrays.equals(getMembersOfSprint(), ((Sprint) that).getMembersOfSprint()) &&
                getVisualization().equals(((Sprint) that).getVisualization()) &&
                Arrays.equals(getTasksOfScript(), ((Sprint) that).getTasksOfScript()) &&
                maxStoryPoints == ((Sprint) that).maxStoryPoints;
    }

    public int hashCode(){
        return (getBeginOfSprint().hashCode() - getEndOfSprint().hashCode() + Arrays.hashCode(getMembersOfSprint())) *
                (getVisualization().hashCode() + Arrays.hashCode(getTasksOfScript())) * maxStoryPoints;
    }
}
