package com.java.automation.lab.fall.khamnava.core22.domain;

import com.java.automation.lab.fall.khamnava.core22.enums.UserAction;
import com.java.automation.lab.fall.khamnava.core22.exception.EmptyListException;
import com.java.automation.lab.fall.khamnava.core22.exception.InvalidPathException;
import com.java.automation.lab.fall.khamnava.core22.util.FileUtil;

import java.time.OffsetDateTime;
import java.util.List;

public class Action {
    private AbstractUser abstractUser;
    private OffsetDateTime timeOfExecution;
    private Task taskOfExecution;
    private UserAction actionOfUser;

    public Action(AbstractUser abstractUser, OffsetDateTime timeOfExecution, Task taskOfExecution, UserAction actionOfUser) {
        this.abstractUser = abstractUser;
        this.timeOfExecution = timeOfExecution;
        this.taskOfExecution = taskOfExecution;
        this.actionOfUser = actionOfUser;
    }

    public AbstractUser getAbstractUser() { return this.abstractUser; }

    public void setAbstractUser(AbstractUser abstractUser) {
        this.abstractUser = abstractUser;
    }

    public OffsetDateTime getTimeOfExecution() { return this.timeOfExecution = timeOfExecution; }

    public void setTimeOfExecution(OffsetDateTime timeOfExecution) { this.timeOfExecution = timeOfExecution; }

    public Task getTaskOfExecution() { return this.taskOfExecution; }

    public void setTaskOfExecution(Task taskOfExecution) {
        this.taskOfExecution = taskOfExecution;
    }

    public UserAction getActionOfUser() { return this.actionOfUser; }

    public void setActionOfUser(UserAction actionOfUser) {
        this.actionOfUser = actionOfUser;
    }

    @Override
    public String toString() {
        return "Action {\n\tabstractUser: " + abstractUser.toString() +
                "\n\ttimeOfExecution: " + timeOfExecution.toString() +
                "\n\ttaskOfExecution: " + taskOfExecution.getNameTask() +
                "\n\tactionOfUser: " + actionOfUser.toString() +
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
        return getAbstractUser().equals(((Action) that).getAbstractUser()) &&
                getTimeOfExecution().equals(((Action) that).getTimeOfExecution()) &&
                getTaskOfExecution().equals(((Action) that).getTaskOfExecution()) &&
                getActionOfUser().equals(((Action) that).getActionOfUser());
    }

    public int hashCode(){
        return (getAbstractUser().hashCode() + getTimeOfExecution().hashCode()) *
                (getTaskOfExecution().hashCode() + getActionOfUser().hashCode());
    }

    public static void logAction(List<Action> acts) throws EmptyListException, InvalidPathException {
        StringBuffer sumAct = new StringBuffer();
        if (acts.isEmpty()) {
            throw new EmptyListException("Your array should be not zero length!");
        }
        for (int i = 0; i < acts.size(); i++) {
            sumAct.append(acts.get(i).toString());
        }
        FileUtil.write("E:\\java\\core2\\tool\\src\\com\\java\\automation\\lab" +
                    "\\fall\\khamnava\\core22\\domain\\resources\\Action.dict", sumAct.toString());
    }
}


