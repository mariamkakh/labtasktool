package com.java.automation.lab.fall.khamnava.core22.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.Admin;
import com.java.automation.lab.fall.khamnava.core22.domain.Info;
import com.java.automation.lab.fall.khamnava.core22.domain.VisualBoard;
import com.java.automation.lab.fall.khamnava.core22.enums.UserRole;

import java.util.List;

public class AdminFactory {
    public static Admin adminRoleAuto(Info significantInfo, List<VisualBoard> visualBoard) {
        return new Admin(significantInfo, UserRole.ADMIN, visualBoard);
    }
}
