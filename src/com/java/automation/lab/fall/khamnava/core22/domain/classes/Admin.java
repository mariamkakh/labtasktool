package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import com.java.automation.lab.fall.khamnava.core22.domain.enums.StatusOfTask;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.UserAction;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.UserRole;
import com.java.automation.lab.fall.khamnava.core22.domain.factory.TaskFactory;

import java.util.Arrays;

public class Admin extends AbstractUser {
    private UserAction[] action = {UserAction.ADD_TASK, UserAction.ADD_COMMENT, UserAction.ADD_ATTACHMENT,
            UserAction.MOVE_TASK, UserAction.ADD_TASK_TO_TRASH, UserAction.EDIT_TASK, UserAction.CREATE_SPRINT,
            UserAction.CLOSE_SCRIPT, UserAction.WATCH_SPRINT, UserAction.WATCH_TASK, UserAction.ASSIGN_TASK};

    public Admin(Info significantInfo, UserRole role, VisualBoard[] visualBoard) {
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
        Comment[] oldArr = task.getComments();
        Comment[] newArr = new Comment[oldArr.length + 1];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        newArr[oldArr.length] = comment;
        task.setComments(newArr);
    }

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
        return getSignificantInfo().equals(((Admin) that).getSignificantInfo()) &&
                getRole().equals(((Admin) that).getRole()) &&
                getVisualBoard().equals(((Admin) that).getVisualBoard()) &&
                Arrays.equals(action, ((Admin) that).action);
    }

    public int hashCode(){
        return getSignificantInfo().hashCode() * getRole().hashCode() -
                getVisualBoard().hashCode() * Arrays.hashCode(action);
    }
}

