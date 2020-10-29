package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import com.java.automation.lab.fall.khamnava.core22.domain.enums.StatusOfTask;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.UserAction;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.UserRole;
import com.java.automation.lab.fall.khamnava.core22.domain.exception.ForbiddenActionException;

import java.util.Arrays;

public class Guest extends AbstractUser{
    private UserAction[] action = {UserAction.WATCH_TASK, UserAction.WATCH_SPRINT};

    public Guest(Info significantInfo, UserRole role, VisualBoard[] visualBoard) {
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
        for (int i = 0; i < action.length; i++) {
            System.out.print(this.action[i] + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Sprint {\n\tsignificantInfo: " + getSignificantInfo().toString() +
                "\n\trole: " + getRole().toString() +
                "\n\tvisualBoard: " + getVisualBoard().toString() +
                "\n\taction: " + Arrays.toString(action) +
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
                Arrays.equals(action, ((Guest) that).action);
    }

    public int hashCode(){
        return getSignificantInfo().hashCode() + getRole().hashCode() -
                getVisualBoard().hashCode() + Arrays.hashCode(action);
    }
}
