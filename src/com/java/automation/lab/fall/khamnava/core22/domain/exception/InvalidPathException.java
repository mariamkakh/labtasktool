package com.java.automation.lab.fall.khamnava.core22.domain.exception;

public class InvalidPathException extends Exception{
    public InvalidPathException() {
        super("This file not found");
    }
}
