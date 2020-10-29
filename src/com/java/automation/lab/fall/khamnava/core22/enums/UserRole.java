package com.java.automation.lab.fall.khamnava.core22.enums;

public enum UserRole {
    ADMIN("Admin can do everything with tasks"),
    GUEST("Guest cannot do anything except watching tasks and scripts"),
    USER("User can do everything except creating and closing scripts");

    private String descripRole;

    UserRole(String descripRole) {
        this.descripRole = descripRole;
    }

    public String descripRole() {
        return descripRole;
    }
}
