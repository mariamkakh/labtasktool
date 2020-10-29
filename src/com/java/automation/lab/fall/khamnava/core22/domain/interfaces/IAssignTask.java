package com.java.automation.lab.fall.khamnava.core22.domain.interfaces;

import com.java.automation.lab.fall.khamnava.core22.domain.classes.Task;
import com.java.automation.lab.fall.khamnava.core22.domain.classes.User;
import com.java.automation.lab.fall.khamnava.core22.domain.exception.ForbiddenActionException;

public interface IAssignTask {
    void assigneeTask(User user, Task task) throws ForbiddenActionException;
}
