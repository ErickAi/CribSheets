package TestPack;

import java.util.Date;
import java.util.List;

public class Student extends Human {
    private double averageGrade;
    private String university;

    public Student(String name, int age) {
        super(false);
        this.name = name;
        this.age = age;
    }


    public void live() {
        learn();
    }

    public void learn() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void printData() {
        System.out.println("Студент: " + name);
    }

    public void incAverageGradeBy01() {
        averageGrade += 0.1;
    }

    public void incAverageGradeBy02() {
        averageGrade += 0.2;
    }

    public void setValue(String name, double value) {
        if (name.equals("averageGrade")) {
            averageGrade = value;
            return;
        }
        if (name.equals("course")) {
            course = (int) value;
            return;
        }
    }

    public List<Human> getChildren(Human child) {
        return super.getChildren();
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
