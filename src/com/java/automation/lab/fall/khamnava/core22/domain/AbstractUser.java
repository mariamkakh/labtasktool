package com.java.automation.lab.fall.khamnava.core22.domain;

import com.java.automation.lab.fall.khamnava.core22.enums.UserRole;
import com.java.automation.lab.fall.khamnava.core22.interfaces.*;

import java.util.List;

public abstract class AbstractUser implements IUser, IAssignTask, IEditTask, ICreateTask, IChangeStatus, IAddComment {
    private Info significantInfo;
    private UserRole role;
    private List<VisualBoard> visualBoard;

    public AbstractUser(Info significantInfo, UserRole role, List<VisualBoard> visualBoard) {
        this.significantInfo = significantInfo;
        this.role = role;
        this.visualBoard = visualBoard;
    }

    public Info getSignificantInfo() { return this.significantInfo; }

    public void setSignificantInfo(Info significantInfo) { this.significantInfo = significantInfo; }

    public UserRole getRole() { return this.role; }

    public void setRole(UserRole role) { this.role = role; }

    public List<VisualBoard> getVisualBoard() { return this.visualBoard; }

    public void setVisualBoard(List<VisualBoard> visualBoard) { this.visualBoard = visualBoard; }
}
