package com.er.OOP.InnerAndNested;

public class ForNested {
//Польза вложенных классов заключается в основном в логической группировке сущностей,
//в улучшении инкапсуляции, а также в экономии class-space.
//тестирование приватных статических методов
    private int i, j;
    private static int x;
    ForNested(int i, int j, int x){
        this.i = i; this.j = j; this.x = x;
    }
    static class Nested{
        private int iI, jJ;
        private static int xX; //Inner classes can have static context

        private int summAll(int i,int j){
            return i+j+iI+jJ+xX;
        }
    }

    public static void main(String[] args) {
        ForNested outer = new ForNested(3,5,1);
        ForNested.Nested nestedObject = new ForNested.Nested();
        int summ = nestedObject.summAll(outer.i,outer.j);
    }
}
