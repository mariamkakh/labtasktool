package com.java.automation.lab.fall.khamnava.core22.domain.enums;

public enum Color {
    BLUE(0x5607d4),
    GREEN(0x7cbc2d),
    GRAY(0x6e6e6e),
    BLACK(0x000000);

    private int value;

    Color(int value) {
        this.value = value;
    }

    public int getValue() { return value; }
}
