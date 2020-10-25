package com.java.automation.lab.fall.khamnava.core22.domain.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.classes.Admin;
import com.java.automation.lab.fall.khamnava.core22.domain.classes.Info;
import com.java.automation.lab.fall.khamnava.core22.domain.classes.VisualBoard;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.UserRole;

public class AdminFactory {
    public static Admin adminRoleAuto(Info significantInfo, VisualBoard[] visualBoard) {
        return new Admin(significantInfo, UserRole.ADMIN, visualBoard);
    }
}
