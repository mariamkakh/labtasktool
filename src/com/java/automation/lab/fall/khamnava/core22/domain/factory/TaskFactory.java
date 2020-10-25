package com.java.automation.lab.fall.khamnava.core22.domain.factory;

import com.java.automation.lab.fall.khamnava.core22.domain.classes.*;

import java.time.OffsetDateTime;

public class TaskFactory {
    public static Task createStandardTask(String nameTask, AbstractUser taskCreator) {
        return new Task(nameTask, null, null, null, null, taskCreator,
                null, OffsetDateTime.now(), null, null, 0,
                null, null, null, null);
    }
}
