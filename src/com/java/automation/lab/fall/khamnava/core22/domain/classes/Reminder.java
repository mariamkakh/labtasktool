package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import com.java.automation.lab.fall.khamnava.core22.domain.exception.EmptyListException;
import com.java.automation.lab.fall.khamnava.core22.domain.util.FileUtil;

import java.time.OffsetDateTime;

public class Reminder {
    private AbstractUser abstractUser;
    private Task task;
    private OffsetDateTime dateForReminder;

    public Reminder(AbstractUser abstractUser, Task task, OffsetDateTime dateForReminder) {
        this.abstractUser = abstractUser;
        this.task = task;
        this.dateForReminder = dateForReminder;
    }

    public AbstractUser getAbstractUser() { return this.abstractUser; }

    public void setAbstractUser(AbstractUser abstractUser) { this.abstractUser = abstractUser; }

    public Task getTask() { return this.task; }

    public void setTask(Task task) { this.task = task; }

    public OffsetDateTime getDateForReminder() { return this.dateForReminder; }

    public void setDateForReminder(OffsetDateTime dateForReminder) { this.dateForReminder = dateForReminder; }

    @Override
    public String toString() {
        return "Sprint {\n\tabstractUser: " + abstractUser.toString() +
                "\n\ttask: " + task.toString() +
                "\n\tdateForReminder: " + dateForReminder.toString() +
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
        return getAbstractUser().equals(((Reminder) that).getAbstractUser()) &&
                getTask().equals(((Reminder) that).getTask()) &&
                getDateForReminder().equals(((Reminder) that).getDateForReminder());
    }

    public int hashCode(){
        return (getAbstractUser().hashCode() - getTask().hashCode()) + getDateForReminder().hashCode();
    }

    public static void logRemind(Reminder[] rem) throws EmptyListException {
        StringBuffer sumRems = new StringBuffer();
        if (rem.length == 0) {
            throw new EmptyListException("Your array should be not zero length!");
        }
        for (int i = 0; i < rem.length; i++) {
            sumRems.append(rem[i].getAbstractUser().getSignificantInfo().getName() + " " +
                    rem[i].getAbstractUser().getSignificantInfo().getFirstName() + ": " + rem[i].getTask().getNameTask()
                    + " (" + rem[i].getDateForReminder() + ")!!!" + "\n");
        }
        FileUtil.write("E:\\java\\core2\\tool\\src\\com\\java\\automation\\lab" +
                "\\fall\\khamnava\\core22\\domain\\resources\\Reminder.dict", sumRems.toString());
    }
}
