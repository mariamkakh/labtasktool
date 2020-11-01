package com.java.automation.lab.fall.khamnava.core22.domain;

import java.util.Arrays;
import java.util.List;

public class Project {
    private List<AbstractUser> membersOfProject;
    private List<VisualBoard> boards;

    public Project(List<AbstractUser> membersOfProject, List<VisualBoard> boards) {
        this.membersOfProject = membersOfProject;
        this.boards = boards;
    }

    public List<AbstractUser> getMembersOfProject() { return this.membersOfProject; }

    public void setMembersOfProject(List<AbstractUser> membersOfProject) { this.membersOfProject = membersOfProject; }

    public List<VisualBoard> getBoards() { return this.boards; }

    public void setBoards(List<VisualBoard> boards) { this.boards = boards; }

    @Override
    public String toString() {
        String res1 = "[ ";
        for(AbstractUser abU : membersOfProject) {
            res1 += (abU.toString() + ",\n");
        }
        res1 += "]";

        String res2 = "[ ";
        for(VisualBoard visB : boards) {
            res2 += (visB.toString() + ",\n");
        }
        res2 += "]";
        return "Project {\n\tmembersOfProject: " + res1 +
                "\n\tboards: " + res2 +
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
        return  getMembersOfProject().equals(((Project) that).getMembersOfProject()) &&
                getBoards().equals(((Project) that).getBoards());
    }

    public int hashCode(){
        return getMembersOfProject().hashCode() + getBoards().hashCode();
    }
}
