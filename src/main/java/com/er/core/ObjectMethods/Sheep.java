package com.er.core.ObjectMethods;

public class Sheep implements Cloneable{

    protected String name;
    protected int age;
    public Specification spec;

    public Sheep(String name, int age, Specification spec) {
        this.name = name;
        this.age = age;
        this.spec = spec;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        sheep.spec = (Specification) spec.clone();
        return sheep;
    }*/

    @Override
    public String toString() {
        return "Sheep: " + "name= " + name + ", age= " + age + "\n\t" + spec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sheep sheep = (Sheep) o;

        if (age != sheep.age) return false;
        if (name != null ? !name.equals(sheep.name) : sheep.name != null) return false;
        return spec != null ? spec.equals(sheep.spec) : sheep.spec == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (spec != null ? spec.hashCode() : 0);
        return result;
    }
}
