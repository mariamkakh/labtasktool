package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import java.time.OffsetDateTime;

public class Comment {
    private AbstractUser abstractUser;
    private OffsetDateTime time;
    private String comment;

    public Comment(AbstractUser abstractUser, OffsetDateTime time, String comment) {
        this.abstractUser = abstractUser;
        this.time = time;
        this.comment = comment;
    }

    public AbstractUser getAbstractUser() { return this.abstractUser; }

    public void setAbstractUser (AbstractUser abstractUser) { this.abstractUser = abstractUser; }

    public OffsetDateTime getTime() { return this.time; }

    public void setTime(OffsetDateTime time) { this.time = time; }

    public String getComment() { return this.comment; }

    public void setComment(String comment) { this.comment = comment; }

    @Override
    public String toString() {
        return "Sprint {\n\tabstractUser: " + abstractUser.toString() +
                "\n\ttime: " + time.toString() +
                "\n\tcomment: " + comment +
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
        return getAbstractUser().equals(((Comment) that).getAbstractUser()) &&
                getTime().equals(((Comment) that).getTime()) &&
                comment.equals(((Comment) that).comment);
    }

    public int hashCode(){
        return (getAbstractUser().hashCode() - getTime().hashCode()) * getComment().hashCode();
    }
}
