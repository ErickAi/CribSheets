package com.er.OOP.generics;


public class TypeExtension {

    public static void main(String[] args) {
        Animal dog = new Dog ("Пес");
        Animal cat = new Cat ("Кот");
        cat.subCompare(dog);

    }
}

abstract class Animal<T extends Animal<T>> implements Comparable<T>{
    @Override
    public int compareTo(Animal o) {
        return 0;
    }
    abstract void subCompare(T a);
}
class Dog extends Animal<Dog> {
    private String name;
    public Dog(String name) {
        this.name = name;
    }
    @Override
    void subCompare(Dog a) {}
}
class Cat extends Animal<Cat> {
    private String name;
    public Cat(String name) {
        this.name = name;
    }
    @Override
    void subCompare(Cat a) {}
}
