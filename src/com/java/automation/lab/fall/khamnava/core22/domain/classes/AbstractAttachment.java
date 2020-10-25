package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import java.time.OffsetDateTime;

public abstract class AbstractAttachment {
    private String basename;
    private OffsetDateTime dateTimeAttach;

    public AbstractAttachment(String basename, OffsetDateTime dateTimeAttach) {
        this.basename = basename;
        this.dateTimeAttach = dateTimeAttach;
    }

    public String getBasename() { return this.basename; }

    public void setBasename(String basename) { this.basename = basename; }

    public OffsetDateTime getDateTimeAttach() { return this.dateTimeAttach; }

    public void setDateTimeAttach(OffsetDateTime dateTimeAttach) { this.dateTimeAttach = dateTimeAttach; }
}
