package com.java.automation.lab.fall.khamnava.core22.domain;

import java.util.Arrays;
import java.util.List;

public class VisualBoard {
    private List<ListOfTasks> lists;
    private List<AbstractUser> adminsOfBoard;
    private List<AbstractUser> participants;

    public VisualBoard(List<ListOfTasks> lists, List<AbstractUser> adminsOfBoard, List<AbstractUser> participants) {
        this.lists = lists;
        this.adminsOfBoard = adminsOfBoard;
        this.participants = participants;
    }

    public VisualBoard() {}

    public List<ListOfTasks> getLists() { return this.lists; }

    public void setLists(List<ListOfTasks> lists) { this.lists = lists ; }

    public List<AbstractUser> getAdminsOfBoard() { return this.adminsOfBoard; }

    public void setAdminsOfBoard(List<AbstractUser> adminsOfBoard) { this.adminsOfBoard = adminsOfBoard; }

    public List<AbstractUser> getParticipants() { return this.participants; }

    public void setParticipants(List<AbstractUser> participants) { this.participants = participants; }

    @Override
    public String toString() {
        String res1 = "[ ";
        for(ListOfTasks lt : lists) {
            res1 += (lt.toString() + ",\n");
        }
        res1 += "]";

        String res2 = "[ ";
        for(AbstractUser abU : adminsOfBoard) {
            res2 += (abU.toString() + ",\n");
        }
        res2 += "]";

        String res3 = "[ ";
        for(AbstractUser abU : participants) {
            res3 += (abU.toString() + ",\n");
        }
        res3 += "]";
        return "VisualBoard {\n\tlists: " + res1 +
                "\n\tadminsOfBoard: " + res2 +
                "\n\tparticipants: " + res3 +
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
        return getLists().equals(((VisualBoard) that).getLists()) &&
                getAdminsOfBoard().equals(((VisualBoard) that).getAdminsOfBoard()) &&
                getParticipants().equals(((VisualBoard) that).getParticipants());
    }

    public int hashCode(){
        return getLists().hashCode() - getAdminsOfBoard().hashCode() + getParticipants().hashCode();
    }
}

