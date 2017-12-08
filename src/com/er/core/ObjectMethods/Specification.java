package com.er.core.ObjectMethods;

public class Specification implements Cloneable {

    public String color, pelage;
    public int weight;

    public Specification(String color, int weight, String pelage) {
        this.color = color;
        this.weight = weight;
        this.pelage = pelage;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Specification: " + "color= " + color + ", weight= " + weight + ", pelage= " + pelage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Specification that = (Specification) o;

        if (weight != that.weight) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        return pelage != null ? pelage.equals(that.pelage) : that.pelage == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (pelage != null ? pelage.hashCode() : 0);
        result = 31 * result + weight;
        return result;
    }
}
