package com.java.automation.lab.fall.khamnava.core22.domain;

import com.java.automation.lab.fall.khamnava.core22.exception.EmptyListException;
import com.java.automation.lab.fall.khamnava.core22.exception.InvalidPathException;
import com.java.automation.lab.fall.khamnava.core22.util.FileUtil;

import java.time.OffsetDateTime;
import java.util.List;

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

    public static void logComments(List<Comment> coms) throws EmptyListException, InvalidPathException {
        StringBuffer sumLines = new StringBuffer();
        if (coms.size() == 0) {
            throw new EmptyListException("Your array should be not zero length!");
        }
        for (int i = 0; i < coms.size(); i++) {
            sumLines.append(coms.get(i).getAbstractUser().getSignificantInfo().getName() + " " +
                    coms.get(i).getAbstractUser().getSignificantInfo().getFirstName() + ": " + coms.get(i).getComment()
                    + "\n");
        }
        FileUtil.write("E:\\java\\core2\\tool\\src\\com\\java\\automation\\lab" +
                "\\fall\\khamnava\\core22\\domain\\resources\\Comment.dict", sumLines.toString());
    }
}
