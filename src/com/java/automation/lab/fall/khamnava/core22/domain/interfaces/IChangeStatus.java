package com.java.automation.lab.fall.khamnava.core22.domain.interfaces;

import com.java.automation.lab.fall.khamnava.core22.domain.classes.Task;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.StatusOfTask;

public interface IChangeStatus {
    void changeStatus(Task task, StatusOfTask status);
}
