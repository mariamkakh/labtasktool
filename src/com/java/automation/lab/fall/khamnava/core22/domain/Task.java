package com.java.automation.lab.fall.khamnava.core22.domain;

import com.java.automation.lab.fall.khamnava.core22.enums.PriorityOfTask;
import com.java.automation.lab.fall.khamnava.core22.enums.StatusOfTask;
import com.java.automation.lab.fall.khamnava.core22.enums.TypeOfTask;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task {
    private String nameTask;
    private PriorityOfTask priority;
    private StatusOfTask status;
    private TypeOfTask type;
    private String tagsList;
    private AbstractUser taskCreator;
    private LinkedList<SubTask> subTasks;
    private OffsetDateTime dateOfCreation;
    private OffsetDateTime deadline;
    private AbstractAttachment attachFiles;
    private int countOfStoryPoints;
    private List<Milestone> milestones;
    private UrlAdress pathToOtherService;
    private List<Comment> comments;
    private AbstractUser assignee;

    public Task(String nameTask, PriorityOfTask priority, StatusOfTask status, TypeOfTask type, String tagsList,
                AbstractUser taskCreator, LinkedList<SubTask> subTasks, OffsetDateTime dateOfCreation,
                OffsetDateTime deadline, AbstractAttachment attachFiles, int countOfStoryPoints,
                List<Milestone> milestones, UrlAdress pathToOtherService, List<Comment> comments,
                AbstractUser assignee) {
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

    public LinkedList<SubTask> getSubTasks() { return this.subTasks; }

    public void setSubTasks(LinkedList<SubTask> subTasks) { this.subTasks = subTasks; }

    public OffsetDateTime getDateOfCreation() { return this.dateOfCreation; }

    public void setDateOfCreation(OffsetDateTime dateOfCreation) { this.dateOfCreation = dateOfCreation; }

    public OffsetDateTime getDeadline () { return this.deadline; }

    public void setDeadline(OffsetDateTime deadline) { this.deadline = deadline ; }

    public AbstractAttachment getAttachFiles() { return this.attachFiles; }

    public void setAttachFiles(AbstractAttachment attachFiles) { this.attachFiles = attachFiles; }

    public int getCountOfStoryPoints() { return this.countOfStoryPoints; }

    public void setCountOfStoryPoints(int countOfStoryPoints) { this.countOfStoryPoints = countOfStoryPoints; }

    public List<Milestone> getMilestones() { return this.milestones; }

    public void setMilestones(List<Milestone> milestones) { this.milestones = milestones; }

    public UrlAdress getPathToOtherService() { return this.pathToOtherService; }

    public void setPathToOtherService(UrlAdress pathToOtherService) { this.pathToOtherService = pathToOtherService; }

    public List<Comment> getComments() { return this.comments; }

    public void setComments(List<Comment> comments) { this.comments = comments; }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public AbstractUser getAssignee() { return this.assignee; }

    public void setAssignee(AbstractUser assignee) { this.assignee = assignee; }

    @Override
    public String toString() {
        String res1 = "[ ";
        for(SubTask st : subTasks) {
            res1 += (st.toString() + ",\n");
        }
        res1 += "]";

        String res2 = "[ ";
        for(Milestone mile : milestones) {
            res2 += (mile.toString() + ",\n");
        }
        res2 += "]";

        String res3 = "[ ";
        for(Comment com : comments) {
            res3 += (com.toString() + ",\n");
        }
        res3 += "]";
        return "Sprint {\n\tnameTask: " + nameTask +
                "\n\tpriority: " + priority.toString() +
                "\n\ttype: " + type.toString() +
                "\n\ttagsList: " + tagsList +
                "\n\ttaskCreator: " + taskCreator.toString() +
                "\n\tsubTasks: " + res1 +
                "\n\tdateOfCreation: " + dateOfCreation.toString() +
                "\n\tdeadline: " + deadline.toString() +
                "\n\tattachFiles: " + attachFiles.toString() +
                "\n\tcountOfStoryPoints: " + countOfStoryPoints +
                "\n\tmilestones: " + res2 +
                "\n\tpathToOtherService: " + pathToOtherService.toString() +
                "\n\tcomments: " + res3 +
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
                getSubTasks().equals(((Task) that).getSubTasks()) &&
                getDateOfCreation().equals(((Task) that).getDateOfCreation()) &&
                getDeadline().equals(((Task) that).getDeadline()) &&
                getAttachFiles().equals(((Task) that).getAttachFiles()) &&
                countOfStoryPoints == ((Task) that).countOfStoryPoints &&
                getMilestones().equals(((Task) that).getMilestones()) &&
                getPathToOtherService().equals(((Task) that).getPathToOtherService()) &&
                getComments().equals(((Task) that).getComments()) &&
                getAssignee().equals(((Task) that).getAssignee());
    }

    public int hashCode(){
        return (getNameTask().hashCode() + getPriority().hashCode() - getStatus().hashCode()) *
                (tagsList.hashCode() + getTaskCreator().hashCode() - getSubTasks().hashCode()) -
                (getDateOfCreation().hashCode() + getDeadline().hashCode() * getAttachFiles().hashCode()) *
                countOfStoryPoints - (getMilestones().hashCode() + getPathToOtherService().hashCode() -
                getComments().hashCode() * getAssignee().hashCode());
    }
}
