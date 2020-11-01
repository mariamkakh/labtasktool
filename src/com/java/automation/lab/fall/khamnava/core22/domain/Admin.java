package com.java.automation.lab.fall.khamnava.core22.domain;

import com.java.automation.lab.fall.khamnava.core22.enums.StatusOfTask;
import com.java.automation.lab.fall.khamnava.core22.enums.UserAction;
import com.java.automation.lab.fall.khamnava.core22.enums.UserRole;
import com.java.automation.lab.fall.khamnava.core22.factory.TaskFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Admin extends AbstractUser {
    private HashSet<UserAction> action = new HashSet<UserAction>(Arrays.asList(UserAction.ADD_TASK,
            UserAction.ADD_COMMENT, UserAction.ADD_ATTACHMENT, UserAction.MOVE_TASK, UserAction.ADD_TASK_TO_TRASH,
            UserAction.EDIT_TASK, UserAction.CREATE_SPRINT, UserAction.CLOSE_SCRIPT, UserAction.WATCH_SPRINT,
            UserAction.WATCH_TASK, UserAction.ASSIGN_TASK));

    public Admin(Info significantInfo, UserRole role, List<VisualBoard> visualBoard) {
        super(significantInfo, role, visualBoard);
    }

    @Override
    public void assigneeTask(User user, Task task) {
        task.setAssignee(user);
    }

    @Override
    public void createTask(String nameTask) { TaskFactory.createStandardTask(nameTask, this); }

    @Override
    public void editTask(Task task, String nameTask) {
        task.setNameTask(nameTask);
    }

    @Override
    public void changeStatus(Task task, StatusOfTask status) { task.setStatus(status); }

    @Override
    public void addComment(Task task, Comment comment) {
        task.addComment(comment);
    }

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
        return "Admin {\n\tsignificantInfo: " + getSignificantInfo().toString() +
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
        return getSignificantInfo().equals(((Admin) that).getSignificantInfo()) &&
                getRole().equals(((Admin) that).getRole()) &&
                getVisualBoard().equals(((Admin) that).getVisualBoard()) &&
                this.action.equals(((Admin) that).action);
    }

    public int hashCode(){
        return getSignificantInfo().hashCode() * getRole().hashCode() -
                getVisualBoard().hashCode() * this.action.hashCode();
    }
}

