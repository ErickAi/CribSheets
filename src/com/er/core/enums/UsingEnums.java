package com.er.core.enums;

import java.util.Arrays;

public class UsingEnums {
    public static void main(String[] args) {                    //enum - public final КЛАСС extends java.lang.Enum
            System.out.println(Direction.class.getSuperclass());
        System.out.println(Direction.UP.getDeclaringClass());
        Direction[] myEnum = Direction.values();	            //возвращает массив значений enum’а
            System.out.println(Arrays.toString(myEnum) + "\tArrays.toString(Enum.values())");

        Direction element = Direction.UP;                       //значения перечисляемого типа — элементы enum-a
            System.out.println(element.name() +" "+ element.toString() + "\t\t\t\t\t element.name == element.toString");
            System.out.println(element.ordinal() + "\t\t\t\t\t\t element.ordinal");

        int leftIndex = Direction.LEFT.ordinal();               //возвращает значение поля ordinal - является индексом значения в массиве
            System.out.println(myEnum[leftIndex] + "\t\t\t\t\t Enum.values()[Enum.ELEMENT.ordinal]");
            System.out.println(Direction.values()[Direction.LEFT.ordinal()]);
            System.out.println(leftIndex);

        Direction down = Direction.valueOf("DOWN");	            //Преобразование строки в enum:
            System.out.println(down);
        try {
            Direction outside = Direction.valueOf("OUTSIDE");	//Exception
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        //private String columnName;              //поле класса каждого Column объекта присутствующего в енуме
        //boolean isFound;                        //это поле создается в методе configureColumns
    }
}
