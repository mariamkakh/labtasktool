package com.java.automation.lab.fall.khamnava.core22.interfaces;

import com.java.automation.lab.fall.khamnava.core22.domain.Task;
import com.java.automation.lab.fall.khamnava.core22.enums.StatusOfTask;

public interface IChangeStatus {
    void changeStatus(Task task, StatusOfTask status);
}
