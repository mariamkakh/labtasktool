package com.java.automation.lab.fall.khamnava.core22.domain;

import java.util.Arrays;

public class Trash {
    private VisualBoard board;
    private Task[] deletedTasks;

    public Trash(VisualBoard board, Task[] addedTasks) {
        this.board = board;
        this.deletedTasks = addedTasks;
    }

    public VisualBoard getBoard() { return this.board; }

    public void setBoard(VisualBoard board) { this.board = board; }

    public Task[] getDeletedTasks() { return this.deletedTasks; }

    public void setDeletedTasks(Task[] deletedTasks) { this.deletedTasks = deletedTasks; }

    @Override
    public String toString() {
        return "Sprint {\n\tboard: " + board.toString() +
                "\n\taddedTasks: " + Arrays.toString(deletedTasks) +
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
                Arrays.equals(getDeletedTasks(), ((Trash) that).getDeletedTasks());
    }

    public int hashCode(){
        return getBoard().hashCode() + Arrays.hashCode(deletedTasks);
    }
}
