package com.java.automation.lab.fall.khamnava.core22.domain.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.classes.Info;
import com.java.automation.lab.fall.khamnava.core22.domain.classes.User;
import com.java.automation.lab.fall.khamnava.core22.domain.classes.VisualBoard;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.UserRole;

public class UserFactory {
    public static User userRoleAuto (Info significantInfo, VisualBoard[] visualBoard) {
        return new User(significantInfo, UserRole.USER, visualBoard);
    }
}
