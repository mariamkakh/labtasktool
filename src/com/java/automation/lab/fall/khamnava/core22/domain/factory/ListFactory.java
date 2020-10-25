package com.java.automation.lab.fall.khamnava.core22.domain.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.classes.AbstractUser;
import com.java.automation.lab.fall.khamnava.core22.domain.classes.ListOfTasks;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.Color;

public class ListFactory {
    public static ListOfTasks createStandardList(AbstractUser taskCreator, String nameOfList) {
        return new ListOfTasks(null, taskCreator, Color.GRAY, nameOfList);
    }
}
