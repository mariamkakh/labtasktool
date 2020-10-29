package com.java.automation.lab.fall.khamnava.core22.enums;

public enum UserAction {
    ADD_TASK("A person with this privilege can create a task and add it to the list of tasks"),
    ADD_TASK_TO_TRASH("A person with this privilege can add task to the trash " +
                        "when he/she doesn't need it anymore"),
    MOVE_TASK("A person with this privilege can move a task from one list of tasks to another"),
    EDIT_TASK("A person with this privilege can edit tasks properties, add files, links or delete them"),
    WATCH_TASK("A person with this privilege can only view tasks and lists of tasks"),
    WATCH_SPRINT("A person with this privilege can only view sprint"),
    ADD_ATTACHMENT("A person with this privilege can add attachment: " +
                    "file or url to the task or info about him/her"),
    ADD_COMMENT("A person with this privilege can add comment to the task"),
    CREATE_SPRINT("A person with this privilege can create sprint"),
    CLOSE_SCRIPT("A person with this privilege can close script"),
    ASSIGN_TASK("A person with this privilege can assign task himself/herself or to someone else");

    private String descripAction;

    UserAction(String descripAction) {
        this.descripAction = descripAction;
    }

    public String descripAction() {
        return descripAction;
    }
}
