package com.java.automation.lab.fall.khamnava.core22.domain.exception;

public class EmptyUserNameException extends Exception {
    public EmptyUserNameException() {
        super("User without name is not allowed");
    }
}
