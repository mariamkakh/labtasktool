package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import com.java.automation.lab.fall.khamnava.core22.domain.enums.UserRole;
import com.java.automation.lab.fall.khamnava.core22.domain.factory.ListFactory;
import com.java.automation.lab.fall.khamnava.core22.domain.factory.TaskFactory;

import java.nio.file.Paths;
import java.time.OffsetDateTime;

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
        VisualBoard[] visualBoards1 = new VisualBoard[0];
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
        VisualBoard[] visualBoards2 = new VisualBoard[0];
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
        VisualBoard[] visualBoards3 = new VisualBoard[0];
        Guest user3 = new Guest(testInfo3, testRole3, visualBoards3);
        user3.writeInfo();

        ListOfTasks testList = ListFactory.createStandardList(user3, "NullList");
        Task testTask = TaskFactory.createStandardTask("Make a program", user3);
    }
}
