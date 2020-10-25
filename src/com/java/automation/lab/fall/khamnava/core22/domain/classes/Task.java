package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import com.java.automation.lab.fall.khamnava.core22.domain.enums.PriorityOfTask;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.StatusOfTask;
import com.java.automation.lab.fall.khamnava.core22.domain.enums.TypeOfTask;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class Task {
    private String nameTask;
    private PriorityOfTask priority;
    private StatusOfTask status;
    private TypeOfTask type;
    private String tagsList;
    private AbstractUser taskCreator;
    private SubTask[] subTasks;
    private OffsetDateTime dateOfCreation;
    private OffsetDateTime deadline;
    private AbstractAttachment attachFiles;
    private int countOfStoryPoints;
    private Milestone[] milestones;
    private UrlAdress pathToOtherService;
    private Comment[] comments;
    private AbstractUser assignee;

    public Task(String nameTask, PriorityOfTask priority, StatusOfTask status, TypeOfTask type, String tagsList,
                AbstractUser taskCreator, SubTask[] subTasks, OffsetDateTime dateOfCreation, OffsetDateTime deadline,
                AbstractAttachment attachFiles, int countOfStoryPoints, Milestone[] milestones,
                UrlAdress pathToOtherService, Comment[] comments, AbstractUser assignee) {
        this.nameTask = nameTask;
        this.priority= priority;
        this.status = status;
        this.type = type;
        this.tagsList = tagsList;
        this.taskCreator = taskCreator;
        this.subTasks = subTasks;
        this.dateOfCreation = dateOfCreation;
        this.deadline = deadline;
        this.attachFiles = attachFiles;
        this.countOfStoryPoints = countOfStoryPoints;
        this.pathToOtherService = pathToOtherService;
        this.comments = comments;
        this.assignee = assignee;
    }

    public String getNameTask() { return this.nameTask; }

    public void setNameTask(String nameTask) { this.nameTask = nameTask; }

    public PriorityOfTask getPriority() { return this.priority; }

    public void setPriority(PriorityOfTask priority) { this.priority = priority; }

    public StatusOfTask getStatus() { return this.status; }

    public void setStatus(StatusOfTask status) { this.status = status; }

    public TypeOfTask getType() { return this.type; }

    public void setType() { this.type = type; }

    public String getTagsList() { return this.tagsList; }

    public void setTagsList() { this.tagsList = tagsList; }

    public AbstractUser getTaskCreator() { return this.taskCreator; }

    public void setTaskCreator(AbstractUser taskCreator) { this.taskCreator = taskCreator; }

    public SubTask[] getSubTasks() { return this.subTasks; }

    public void setSubTasks(SubTask[] subTasks) { this.subTasks = subTasks; }

    public OffsetDateTime getDateOfCreation() { return this.dateOfCreation; }

    public void setDateOfCreation(OffsetDateTime dateOfCreation) { this.dateOfCreation = dateOfCreation; }

    public OffsetDateTime getDeadline () { return this.deadline; }

    public void setDeadline(OffsetDateTime deadline) { this.deadline = deadline ; }

    public AbstractAttachment getAttachFiles() { return this.attachFiles; }

    public void setAttachFiles(AbstractAttachment attachFiles) { this.attachFiles = attachFiles; }

    public int getCountOfStoryPoints() { return this.countOfStoryPoints; }

    public void setCountOfStoryPoints(int countOfStoryPoints) { this.countOfStoryPoints = countOfStoryPoints; }

    public Milestone[] getMilestones() { return this.milestones; }

    public void setMilestones(Milestone[] milestones) { this.milestones = milestones; }

    public UrlAdress getPathToOtherService() { return this.pathToOtherService; }

    public void setPathToOtherService(UrlAdress pathToOtherService) { this.pathToOtherService = pathToOtherService; }

    public Comment[] getComments() { return this.comments; }

    public void setComments(Comment[] comments) { this.comments = comments; }

    public AbstractUser getAssignee() { return this.assignee; }

    public void setAssignee(AbstractUser assignee) { this.assignee = assignee; }

    @Override
    public String toString() {
        return "Sprint {\n\tnameTask: " + nameTask +
                "\n\tpriority: " + priority.toString() +
                "\n\ttype: " + type.toString() +
                "\n\ttagsList: " + tagsList +
                "\n\ttaskCreator: " + taskCreator.toString() +
                "\n\tsubTasks: " + Arrays.toString(subTasks) +
                "\n\tdateOfCreation: " + dateOfCreation.toString() +
                "\n\tdeadline: " + deadline.toString() +
                "\n\tattachFiles: " + attachFiles.toString() +
                "\n\tcountOfStoryPoints: " + countOfStoryPoints +
                "\n\tmilestones: " + Arrays.toString(milestones) +
                "\n\tpathToOtherService: " + pathToOtherService.toString() +
                "\n\tcomments: " + Arrays.toString(comments) +
                "\n\tassignee: " + assignee.toString() +
                "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        return nameTask.equals(((Task) that).getNameTask()) &&
                getPriority().equals(((Task) that).getPriority()) &&
                getStatus().equals(((Task) that).getPriority()) &&
                getType().equals(((Task) that).getType()) &&
                tagsList.equals(((Task) that).tagsList) &&
                getTaskCreator().equals(((Task) that).getTaskCreator()) &&
                Arrays.equals(getSubTasks(), ((Task) that).getSubTasks()) &&
                getDateOfCreation().equals(((Task) that).getDateOfCreation()) &&
                getDeadline().equals(((Task) that).getDeadline()) &&
                getAttachFiles().equals(((Task) that).getAttachFiles()) &&
                countOfStoryPoints == ((Task) that).countOfStoryPoints &&
                Arrays.equals(getMilestones(), ((Task) that).getMilestones()) &&
                getPathToOtherService().equals(((Task) that).getPathToOtherService()) &&
                Arrays.equals(getComments(), ((Task) that).getComments()) &&
                getAssignee().equals(((Task) that).getAssignee());
    }

    public int hashCode(){
        return (getNameTask().hashCode() + getPriority().hashCode() - getStatus().hashCode()) *
                (tagsList.hashCode() + getTaskCreator().hashCode() - Arrays.hashCode(getSubTasks())) -
                (getDateOfCreation().hashCode() + getDeadline().hashCode() * getAttachFiles().hashCode()) *
                countOfStoryPoints - (Arrays.hashCode(getMilestones()) + getPathToOtherService().hashCode() -
                Arrays.hashCode(getComments()) * getAssignee().hashCode());
    }
}
