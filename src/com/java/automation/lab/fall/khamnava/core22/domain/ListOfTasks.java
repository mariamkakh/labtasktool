package com.java.automation.lab.fall.khamnava.core22.domain;

import com.java.automation.lab.fall.khamnava.core22.enums.Color;

import java.util.Arrays;
import java.util.LinkedList;

public class ListOfTasks {
    private LinkedList<Task> tasks;
    private AbstractUser taskCreator;
    private Color color;
    private String nameOfList;

    public ListOfTasks(LinkedList<Task> tasks, AbstractUser taskCreator, Color color, String nameOfList) {
        this.tasks = tasks;
        this.taskCreator = taskCreator;
        this.color = color;
        this.nameOfList = nameOfList;
    }

    public LinkedList<Task> getTasks() { return this.tasks; }

    public void setTasks(LinkedList<Task> tasks) { this.tasks = tasks; }

    public AbstractUser getTaskCreator() { return this.taskCreator; }

    public void setTaskCreator(AbstractUser taskCreator) { this.taskCreator = taskCreator; }

    public Color getColor() { return this.color; }

    public void setColor(Color color) { this.color = color; }

    public String getNameOfList() { return this.nameOfList; }

    public void setNameOfList(String nameOfList) { this.nameOfList = nameOfList; }

    @Override
    public String toString() {
        return "ListOfTasks {\n\ttasks: " + tasks.toString() +
                "\n\t:taskCreator " + taskCreator.toString() +
                "\n\tcolor: " + color +
                "\n\tnameOfList " + nameOfList +
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
        return  getTasks().equals(((ListOfTasks) that).getTasks()) &&
                getTaskCreator().equals(((ListOfTasks) that).getTaskCreator()) &&
                getColor() == ((ListOfTasks) that).getColor() &&
                nameOfList.equals(((ListOfTasks) that).nameOfList);
    }

    public int hashCode(){
        return getTasks().hashCode() * getTaskCreator().hashCode() +
                getColor().hashCode() * getNameOfList().hashCode();
    }
}
