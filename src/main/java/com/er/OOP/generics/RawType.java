package com.er.OOP.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RawType<T> {

    public static void main(String[] args) {
        List rawList = new ArrayList();
        List<String> list = new ArrayList<>();
        rawList = list;
        list = rawList;         //Unchecked assignment

        List<String> listStr = Arrays.asList("value");

        RawType rawType = new RawType();                //Типизированный тип лучше типизировать
//        rawType.testRow(listStr);                       //ClassCastException: String cannot be cast to Integer

        RawType<?> someType = new RawType<>();
        someType.testRow(listStr);                      //все нормально,
    }

    public <E> void testRow (Collection<E> collection){
        for (E e : collection) {
            System.out.println(e);
        }
    }
    public void testRow (List<Integer> intList){
        for (Integer i : intList) {
            System.out.println(i);
        }
    }

}
