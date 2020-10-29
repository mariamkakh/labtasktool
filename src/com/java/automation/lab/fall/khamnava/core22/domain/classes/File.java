package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import java.nio.file.Path;
import java.time.OffsetDateTime;

public class File extends AbstractAttachment {
    private Path pathToFile;

    public File(String basename, OffsetDateTime dateTimeAttach, Path pathToFile) {
        super(basename, dateTimeAttach);
        this.pathToFile = pathToFile;
    }

    public Path getPathToFile() { return this.pathToFile; }

    public void setPathToFile(Path pathToFile) { this.pathToFile = pathToFile; }

    @Override
    public String toString() {
        return "PathOrUrl {\n\tbasename: " + getBasename() +
                "\n\tdateTime: " + getDateTimeAttach().toString() +
                "\n\tpathToFile: " + pathToFile.toString() +
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
        return getBasename().equals(((File) that).getBasename()) &&
                getDateTimeAttach().equals(((File) that).getDateTimeAttach()) &&
                getPathToFile().equals(((File) that).getPathToFile());
    }

    public int hashCode(){
        return getBasename().hashCode() * getDateTimeAttach().hashCode() * getPathToFile().hashCode();
    }
}

