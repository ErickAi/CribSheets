package com.er.testPack;

public class MainClass {

    public static void main(String[] args) {
        Student student = new Student("Mewldsn", 23);
        student.addChild(new Human(false));
        student.addChild(new Human(true));
        System.out.println(student.getChildren(new Human(false)));
    }
}
