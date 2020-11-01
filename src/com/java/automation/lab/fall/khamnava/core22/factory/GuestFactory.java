package com.java.automation.lab.fall.khamnava.core22.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.Guest;
import com.java.automation.lab.fall.khamnava.core22.domain.Info;
import com.java.automation.lab.fall.khamnava.core22.domain.VisualBoard;
import com.java.automation.lab.fall.khamnava.core22.enums.UserRole;

import java.util.List;

public class GuestFactory {
    public static Guest guestRoleAuto (Info significantInfo, List<VisualBoard> visualBoard) {
        return new Guest(significantInfo, UserRole.GUEST, visualBoard);
    }
}
