package com.er.OOP.generics;

import java.util.ArrayList;
import java.util.List;

public class Container <T extends Product> {
    //Classes: Abstract Product, Phone/Camera extends Product, Car
    public static void main(String[] args) {
        Container<Product> products = new Container<>();
        Container<Phone> phones = new Container<>();
        //Container<Car> cars = new Container<Car>();//Compile Error: Type parameter Car is not whithin its bound
        List<Camera> cams = new ArrayList<>();
        List<Object> objs = new ArrayList<>();
        products.findIt(new ArrayList<Camera>(), new Phone("Nokia"));
        //products.find(new ArrayList<Camera>(), new Phone("Nokia")); //Compile Error:
        products.copy(cams, objs);

    }

    boolean findIt (List<? extends Product> all, Product p){
        return all.contains(p);
    }
    <E extends Product> boolean find(List<E> all, E p){
        return all.contains(p);
    }
    void copy(List<? extends Product> src, List<? super Product> dest){
        dest.addAll(src);
        }
}
abstract class Product{}
class Camera extends Product{
    String name;
    Camera (String name){
        this.name = name;
    }
}
class Phone extends Product{
    String name;
    public Phone(String name) {
        this.name = name;
    }
}
class Car{
    String name;
    public Car(String name) {
        this.name = name;
    }
}
