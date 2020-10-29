package com.java.automation.lab.fall.khamnava.core22.interfaces;

import com.java.automation.lab.fall.khamnava.core22.domain.Task;
import com.java.automation.lab.fall.khamnava.core22.domain.User;
import com.java.automation.lab.fall.khamnava.core22.exception.ForbiddenActionException;

public interface IAssignTask {
    void assigneeTask(User user, Task task) throws ForbiddenActionException;
}
