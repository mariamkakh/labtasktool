package com.java.automation.lab.fall.khamnava.core22.domain;

import com.java.automation.lab.fall.khamnava.core22.enums.UserRole;
import com.java.automation.lab.fall.khamnava.core22.interfaces.*;

public abstract class AbstractUser implements IUser, IAssignTask, IEditTask, ICreateTask, IChangeStatus, IAddComment {
    private Info significantInfo;
    private UserRole role;
    private VisualBoard[] visualBoard;

    public AbstractUser(Info significantInfo, UserRole role, VisualBoard[] visualBoard) {
        this.significantInfo = significantInfo;
        this.role = role;
        this.visualBoard = visualBoard;
    }

    public Info getSignificantInfo() { return this.significantInfo; }

    public void setSignificantInfo(Info significantInfo) { this.significantInfo = significantInfo; }

    public UserRole getRole() { return this.role; }

    public void setRole(UserRole role) { this.role = role; }

    public VisualBoard[] getVisualBoard() { return this.visualBoard; }

    public void setVisualBoard(VisualBoard[] visualBoard) { this.visualBoard = visualBoard; }
}
