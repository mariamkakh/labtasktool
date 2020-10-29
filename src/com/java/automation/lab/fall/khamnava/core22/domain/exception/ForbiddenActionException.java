package com.java.automation.lab.fall.khamnava.core22.domain.exception;

public class ForbiddenActionException extends Exception{
    public ForbiddenActionException() {
        super("This Action forbidden for this User!");
    }
}
