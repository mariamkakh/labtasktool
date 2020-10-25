package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import java.net.URL;
import java.time.OffsetDateTime;

public class UrlAdress extends AbstractAttachment {
    URL urlAdress;

    public UrlAdress(String basename, OffsetDateTime dateTimeAttach, URL urlAdress) {
        super(basename, dateTimeAttach);
        this.urlAdress = urlAdress;
    }

    public URL getUrlAdress() { return this.urlAdress; }

    public void setUrlAdress(URL urlAdress) { this.urlAdress = urlAdress; }

    @Override
    public String toString() {
        return "Sprint {\n\tbasename: " + getBasename() +
                "\n\tdateTime: " + getDateTimeAttach().toString() +
                "\n\turlAdress: " + urlAdress.toString() +
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
        return getBasename().equals(((UrlAdress) that).getBasename()) &&
                getDateTimeAttach().equals(((UrlAdress) that).getDateTimeAttach()) &&
                getUrlAdress().equals(((UrlAdress) that).getUrlAdress());
    }

    public int hashCode(){
        return (getBasename().hashCode() - getDateTimeAttach().hashCode()) * getUrlAdress().hashCode();
    }
}
