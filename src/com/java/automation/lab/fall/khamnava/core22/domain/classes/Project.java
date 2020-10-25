package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import java.util.Arrays;

public class Project {
    private AbstractUser[] membersOfProject;
    private VisualBoard[] boards;

    public Project(AbstractUser[] membersOfProject, VisualBoard[] boards) {
        this.membersOfProject = membersOfProject;
        this.boards = boards;
    }

    public AbstractUser[] getMembersOfProject() { return this.membersOfProject; }

    public void setMembersOfProject(AbstractUser[] membersOfProject) { this.membersOfProject = membersOfProject; }

    public VisualBoard[] getBoards() { return this.boards; }

    public void setBoards(VisualBoard[] boards) { this.boards = boards; }

    @Override
    public String toString() {
        return "Sprint {\n\tmembersOfProject: " + Arrays.toString(membersOfProject) +
                "\n\tboards: " + Arrays.toString(boards) +
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
        return  Arrays.equals(getMembersOfProject(), ((Project) that).getMembersOfProject()) &&
                Arrays.equals(getBoards(), ((Project) that).getBoards());
    }

    public int hashCode(){
        return Arrays.hashCode(getMembersOfProject()) + Arrays.hashCode(getBoards());
    }
}
