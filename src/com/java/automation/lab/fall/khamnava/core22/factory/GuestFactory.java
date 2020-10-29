package com.java.automation.lab.fall.khamnava.core22.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.Guest;
import com.java.automation.lab.fall.khamnava.core22.domain.Info;
import com.java.automation.lab.fall.khamnava.core22.domain.VisualBoard;
import com.java.automation.lab.fall.khamnava.core22.enums.UserRole;

public class GuestFactory {
    public static Guest guestRoleAuto (Info significantInfo, VisualBoard[] visualBoard) {
        return new Guest(significantInfo, UserRole.GUEST, visualBoard);
    }
}
