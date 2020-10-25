package com.java.automation.lab.fall.khamnava.core22.domain.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.classes.Guest;
import com.java.automation.lab.fall.khamnava.core22.domain.classes.Info;
import com.java.automation.lab.fall.khamnava.core22.domain.classes.VisualBoard;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.UserRole;

public class GuestFactory {
    public static Guest guestRoleAuto (Info significantInfo, VisualBoard[] visualBoard) {
        return new Guest(significantInfo, UserRole.GUEST, visualBoard);
    }
}
