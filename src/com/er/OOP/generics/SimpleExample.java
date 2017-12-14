package com.er.OOP.generics;

public class SimpleExample<T> {
    private T value;

    public SimpleExample() {
    }
    public SimpleExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T val) {
        value = val;
    }

    public String toString() {
        if (value == null) return "Field <T> value= null";
        return "Field <T> value = " + value + "; Type: " + value.getClass().getName();
    }

    public static void main(String[] args) {

        System.out.println("_______SimpleExample RAW_______");
        SimpleExample ob3 = new SimpleExample();
        ob3.setValue("Java 6");             //Unchecked call to SetValue(T)
        System.out.println(ob3.toString()); //выводится тип объекта, а не тип параметризации
        ob3.setValue(654321);
        System.out.println(ob3.toString()); //так как при компиляции происходит стирание типов
        ob3.setValue(null);
        System.out.println(ob3.toString()); //в сырой тип можно засунуть любой тип

        System.out.println("____SimpleExample<Integer>____");
        SimpleExample<Integer> ob1 = new SimpleExample<>();
        ob1.setValue(123);                  //в параметризированном объекте стирание типов
        System.out.println(ob1.toString()); //заменяется на приведение типов при компиляции

        System.out.println("____SimpleExample<Integer>_____");
        SimpleExample<String> ob2 = new SimpleExample<>("Str");
        System.out.println(ob2.toString());
        //String strFromInteger = ob1.getValue();
    }
}
