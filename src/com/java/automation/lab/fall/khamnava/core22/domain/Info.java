package com.java.automation.lab.fall.khamnava.core22.domain;

import com.java.automation.lab.fall.khamnava.core22.exception.EmptyListException;
import com.java.automation.lab.fall.khamnava.core22.util.FileUtil;

import java.time.OffsetDateTime;

public class Info {
    private String name;
    private String firstName;
    private AbstractAttachment pathOrUrl;
    private OffsetDateTime dateOfRegistration;

    public Info(String name, String firstName, AbstractAttachment pathOrUrl, OffsetDateTime dateOfRegistration) {
        this.firstName = firstName;
        this.name = name;
        this.pathOrUrl = pathOrUrl;
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getFirstName() { return this.firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public AbstractAttachment getPathOrUrl() { return this.pathOrUrl; }

    public void setPathOrUrl(AbstractAttachment pathOrUrl) { this.pathOrUrl = pathOrUrl; }

    public OffsetDateTime getDateOfRegistration() { return this.dateOfRegistration; }

    public void setDateOfRegistration(OffsetDateTime dateOfRegistration) { this.dateOfRegistration = dateOfRegistration; }

    @Override
    public String toString() {
        return "Info {\n\tname: " + name +
                "\n\tfirstName: " + firstName +
                "\n\tpathOrUrl: " + pathOrUrl.toString() +
                "\n\tdateOfRegistration: " + dateOfRegistration.toString() +
                "\n}\n";
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
        return name.equals(((Info) that).name) &&
                firstName.equals(((Info) that).firstName) &&
                getPathOrUrl().equals(((Info) that).getPathOrUrl()) &&
                getDateOfRegistration().equals(((Info) that).getDateOfRegistration());
    }

    public int hashCode(){
        return (name.hashCode() + firstName.hashCode()) *
                (getPathOrUrl().hashCode() + getDateOfRegistration().hashCode());
    }

    public static void logInfo(Info[] infos) throws EmptyListException{
        StringBuffer sumInfo = new StringBuffer();
        if (infos.length == 0) {
            throw new EmptyListException("Your array should be not zero length!");
        }
        for (int i = 0; i < infos.length; i++) {
            sumInfo.append(infos[i].toString());
        }
        FileUtil.write("E:\\java\\core2\\tool\\src\\com\\java\\automation\\lab" +
                "\\fall\\khamnava\\core22\\domain\\resources\\Info.dict", sumInfo.toString());
    }
}
