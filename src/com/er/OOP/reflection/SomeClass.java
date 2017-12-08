package com.er.OOP.reflection;

public class SomeClass {
    private transient String s;
    private int i;
    private OtherClass otherClass;

    public SomeClass() {
    }

    public SomeClass(String s, int i, OtherClass otherClass) {
        this.s = s;
        this.i = i;
        this.otherClass = otherClass;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                '}';
    }
}
