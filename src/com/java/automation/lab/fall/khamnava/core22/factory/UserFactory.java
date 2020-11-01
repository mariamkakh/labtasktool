package com.java.automation.lab.fall.khamnava.core22.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.Info;
import com.java.automation.lab.fall.khamnava.core22.domain.User;
import com.java.automation.lab.fall.khamnava.core22.domain.VisualBoard;
import com.java.automation.lab.fall.khamnava.core22.enums.UserRole;

import java.util.List;

public class UserFactory {
    public static User userRoleAuto (Info significantInfo, List<VisualBoard> visualBoard) {
        return new User(significantInfo, UserRole.USER, visualBoard);
    }
}
