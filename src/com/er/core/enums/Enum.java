package com.er.core.enums;

public class Enum {//extends java.lang.Enum {
    String name;
    int ordinal;

    /**
     * Sole constructor.  Programmers cannot invoke this constructor.
     * It is for use by code emitted by the compiler in response to
     * enum type declarations.
     */
    protected Enum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }
}
