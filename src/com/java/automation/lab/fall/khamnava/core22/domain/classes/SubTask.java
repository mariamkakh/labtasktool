package com.java.automation.lab.fall.khamnava.core22.domain.classes;

public class SubTask {
    private Task nameTask;
    private String description;

    public SubTask(Task nameTask, String description) {
        this.nameTask = nameTask;
        this.description = description;
    }

    public Task getNameTask() { return this.nameTask; }

    public void setNameTask(Task nameTask) { this.nameTask = nameTask; }

    public String getDescription() { return this.description; }

    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return "Sprint {\n\tnameTask: " + nameTask.toString() +
                "\n\tdescription: " + description +
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
        return getNameTask().equals(((SubTask) that).getNameTask()) &&
                description.equals(((SubTask) that).description);
    }

    public int hashCode(){
        return (getNameTask().hashCode() * getDescription().hashCode());
    }
}
