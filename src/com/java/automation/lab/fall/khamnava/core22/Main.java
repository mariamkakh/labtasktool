package com.java.automation.lab.fall.khamnava.core22;

import com.java.automation.lab.fall.khamnava.core22.domain.*;
import com.java.automation.lab.fall.khamnava.core22.enums.UserAction;
import com.java.automation.lab.fall.khamnava.core22.enums.UserRole;
import com.java.automation.lab.fall.khamnava.core22.exception.EmptyListException;
import com.java.automation.lab.fall.khamnava.core22.exception.InvalidPathException;
import com.java.automation.lab.fall.khamnava.core22.factory.ListFactory;
import com.java.automation.lab.fall.khamnava.core22.factory.TaskFactory;
import com.java.automation.lab.fall.khamnava.core22.util.FileUtil;

import java.nio.file.Paths;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Info testInfo1 = new Info(
                "Lola",
                "Wood",
                new File(
                        "lolaPhotos",
                        OffsetDateTime.now(),
                        Paths.get("C:\\Users\\Username\\Desktop\\lola.png")),
                OffsetDateTime.now());
        UserRole testRole1 = UserRole.ADMIN;
        List<VisualBoard> visualBoards1 = new ArrayList<>();
        Admin user1 = new Admin(testInfo1, testRole1, visualBoards1);
        user1.writeInfo();

        Info testInfo2 = new Info(
                "Garry",
                "Moll",
                new File(
                        "garryPhotos",
                        OffsetDateTime.now(),
                        Paths.get("C:\\Users\\Username\\Desktop\\garry.png")),
                OffsetDateTime.now());
        UserRole testRole2 = UserRole.USER;
        List<VisualBoard> visualBoards2 = new ArrayList<>();
        User user2 = new User(testInfo2, testRole2, visualBoards2);
        user2.writeInfo();

        Info testInfo3 = new Info(
                "Tom",
                "Butty",
                new File(
                        "tomPhotos",
                        OffsetDateTime.now(),
                        Paths.get("C:\\Users\\Username\\Desktop\\tom.png")),
                OffsetDateTime.now());
        UserRole testRole3 = UserRole.GUEST;
        List<VisualBoard> visualBoards3 = new ArrayList<>();
        Guest user3 = new Guest(testInfo3, testRole3, visualBoards3);
        user3.writeInfo();

        ListOfTasks testList = ListFactory.createStandardList(user1, "NullList");
        Task task1 = TaskFactory.createStandardTask("Make a program", user1);
        Task task2 = TaskFactory.createStandardTask("Add a new project task", user1);
        Task task3 = TaskFactory.createStandardTask("Watch your task", user2);

        Comment com1 = new Comment(user1, OffsetDateTime.now(), "Change type of your task");
        Comment com2 = new Comment(user2, OffsetDateTime.now(), "Find new solution of this problem task");
        try {
            List<Comment> coms = new ArrayList<>();
            coms.add(com1);
            coms.add(com2);
            Comment.logComments(coms);
            System.out.println(FileUtil.read(Constants.pathComments));
        } catch(EmptyListException ex){
            System.out.println("Comment list is empty!!");
        } catch(InvalidPathException ex){
            System.out.println("This file doesn't exists");
        }

        try {
            List<Info> info = new ArrayList<>();
            info.add(testInfo1);
            info.add(testInfo2);
            info.add(testInfo3);
            Info.logInfo(info);
        } catch(EmptyListException | InvalidPathException ex){
            System.out.println("Info list is empty!!");
        }

        try {
            System.out.println(FileUtil.read(Constants.pathInfo));
        } catch(InvalidPathException ex){
            System.out.println("This file doesn't exists");
        }
        Action act1 = new Action(user1, OffsetDateTime.now(), task1, UserAction.ASSIGN_TASK);
        Action act2 = new Action(user2, OffsetDateTime.now(), task2, UserAction.ADD_TASK);
        Action act3 = new Action(user3, OffsetDateTime.now(), task3, UserAction.WATCH_TASK);

        try {
            List<Action> acts = new ArrayList<>();
            acts.add(act1);
            acts.add(act2);
            acts.add(act3);
            Action.logAction(acts);
            System.out.println(FileUtil.read(Constants.pathAction));
        } catch(EmptyListException ex){
            System.out.println("Action list is empty!!");
        } catch(InvalidPathException ex){
            System.out.println("This file doesn't exists");
        }

        Reminder rem1 = new Reminder(user1, task1, OffsetDateTime.now());
        Reminder rem2 = new Reminder(user2, task2, OffsetDateTime.now());
        Reminder rem3 = new Reminder(user3, task3, OffsetDateTime.now());

        try {
            List<Reminder> rems = new ArrayList<>();
            rems.add(rem1);
            rems.add(rem2);
            rems.add(rem3);
            Reminder.logRemind(rems);
            System.out.println(FileUtil.read(Constants.pathReminder));
        } catch(EmptyListException ex){
            System.out.println("Reminder list is empty!!");
        } catch(InvalidPathException ex){
        System.out.println("This file doesn't exists");
        }
    }
}
