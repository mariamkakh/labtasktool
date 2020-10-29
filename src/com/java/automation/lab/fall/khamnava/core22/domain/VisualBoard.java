package com.java.automation.lab.fall.khamnava.core22.domain;

import java.util.Arrays;

public class VisualBoard {
    private ListOfTasks[] lists;
    private AbstractUser[] adminsOfBoard;
    private AbstractUser[] participants;

    public VisualBoard(ListOfTasks[] lists, AbstractUser[] adminsOfBoard, AbstractUser[] participants) {
        this.lists = lists;
        this.adminsOfBoard = adminsOfBoard;
        this.participants = participants;
    }

    public VisualBoard() {}

    public ListOfTasks[] getLists() { return this.lists; }

    public void setLists(ListOfTasks[] lists) { this.lists = lists ; }

    public AbstractUser[] getAdminsOfBoard() { return this.adminsOfBoard; }

    public void setAdminsOfBoard(AbstractUser[] adminsOfBoard) { this.adminsOfBoard = adminsOfBoard; }

    public AbstractUser[] getParticipants() { return this.participants; }

    public void setParticipants(AbstractUser[] participants) { this.participants = participants; }

    @Override
    public String toString() {
        return "Sprint {\n\tlists: " + Arrays.toString(lists) +
                "\n\tadminsOfBoard: " + Arrays.toString(adminsOfBoard) +
                "\n\tparticipants: " + Arrays.toString(participants) +
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
        return Arrays.equals(getLists(), ((VisualBoard) that).getLists()) &&
                Arrays.equals(getAdminsOfBoard(), ((VisualBoard) that).getAdminsOfBoard()) &&
                Arrays.equals(getParticipants(), ((VisualBoard) that).getParticipants());
    }

    public int hashCode(){
        return Arrays.hashCode(getLists()) - Arrays.hashCode(getAdminsOfBoard()) + Arrays.hashCode(getParticipants());
    }
}

