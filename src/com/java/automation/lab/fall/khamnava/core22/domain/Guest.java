package com.java.automation.lab.fall.khamnava.core22.domain;

import com.java.automation.lab.fall.khamnava.core22.enums.StatusOfTask;
import com.java.automation.lab.fall.khamnava.core22.enums.UserAction;
import com.java.automation.lab.fall.khamnava.core22.enums.UserRole;
import com.java.automation.lab.fall.khamnava.core22.exception.ForbiddenActionException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Guest extends AbstractUser{
    private HashSet<UserAction> action = new HashSet<UserAction>(Arrays.asList(
            UserAction.WATCH_TASK, UserAction.WATCH_SPRINT));

    public Guest(Info significantInfo, UserRole role, List<VisualBoard> visualBoard) {
        super(significantInfo, role, visualBoard);
    }

    @Override
    public void assigneeTask(User user, Task task) throws ForbiddenActionException {
        throw new ForbiddenActionException();
    }

    @Override
    public void createTask(String nameTask) { throw new RuntimeException("Not implemented"); }

    @Override
    public void editTask(Task task, String nameTask) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void changeStatus(Task task, StatusOfTask status) { throw new RuntimeException("Not implemented"); }

    @Override
    public void addComment(Task task, Comment comment) { throw new RuntimeException("Not implemented"); }

    @Override
    public void writeInfo() {
        System.out.print(this.getSignificantInfo().getName() + " " + this.getSignificantInfo().getFirstName() +
                " " + this.getRole() + " ");
        Iterator<UserAction> i = action.iterator();
        while (i.hasNext()) {
            System.out.print(i.next().toString() + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        String res = "[ ";
        Iterator<UserAction> i = action.iterator();
        while (i.hasNext()) {
            res += (i.next().toString() + " ");
        }
        res += "]";
        return "Sprint {\n\tsignificantInfo: " + getSignificantInfo().toString() +
                "\n\trole: " + getRole().toString() +
                "\n\tvisualBoard: " + getVisualBoard().toString() +
                "\n\taction: " + res +
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
        return getSignificantInfo().equals(((Guest) that).getSignificantInfo()) &&
                getRole().equals(((Guest) that).getRole()) &&
                getVisualBoard().equals(((Guest) that).getVisualBoard()) &&
                this.action.equals(((Guest) that).action);
    }

    public int hashCode(){
        return getSignificantInfo().hashCode() + getRole().hashCode() -
                getVisualBoard().hashCode() + this.action.hashCode();
    }
}
