package com.java.automation.lab.fall.khamnava.core22.domain.exception;

public class InvalidDictFileException extends Exception{
    public InvalidDictFileException() {
        super("This file is not in .dict format");
    }
}
