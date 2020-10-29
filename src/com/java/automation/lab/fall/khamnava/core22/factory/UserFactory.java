package com.java.automation.lab.fall.khamnava.core22.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.Info;
import com.java.automation.lab.fall.khamnava.core22.domain.User;
import com.java.automation.lab.fall.khamnava.core22.domain.VisualBoard;
import com.java.automation.lab.fall.khamnava.core22.enums.UserRole;

public class UserFactory {
    public static User userRoleAuto (Info significantInfo, VisualBoard[] visualBoard) {
        return new User(significantInfo, UserRole.USER, visualBoard);
    }
}
