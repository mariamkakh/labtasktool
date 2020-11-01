package com.java.automation.lab.fall.khamnava.core22.domain;

import java.util.Arrays;
import java.util.LinkedList;

public class Trash {
    private VisualBoard board;
    private LinkedList<Task> deletedTasks;

    public Trash(VisualBoard board, LinkedList<Task> addedTasks) {
        this.board = board;
        this.deletedTasks = addedTasks;
    }

    public VisualBoard getBoard() { return this.board; }

    public void setBoard(VisualBoard board) { this.board = board; }

    public LinkedList<Task> getDeletedTasks() { return this.deletedTasks; }

    public void setDeletedTasks(LinkedList<Task> deletedTasks) { this.deletedTasks = deletedTasks; }

    @Override
    public String toString() {
        String res = "[ ";
        for(Task t : deletedTasks) {
            res += (t.toString() + ",\n");
        }
        res += "]";
        return "Trash {\n\tboard: " + board.toString() +
                "\n\taddedTasks: " + res +
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
        return getBoard().equals(((Trash) that).getBoard()) &&
                getDeletedTasks().equals(((Trash) that).getDeletedTasks());
    }

    public int hashCode(){
        return getBoard().hashCode() + getDeletedTasks().hashCode();
    }
}
