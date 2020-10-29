package com.java.automation.lab.fall.khamnava.core22.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.AbstractUser;
import com.java.automation.lab.fall.khamnava.core22.domain.ListOfTasks;
import com.java.automation.lab.fall.khamnava.core22.enums.Color;

public class ListFactory {
    public static ListOfTasks createStandardList(AbstractUser taskCreator, String nameOfList) {
        return new ListOfTasks(null, taskCreator, Color.GRAY, nameOfList);
    }
}
